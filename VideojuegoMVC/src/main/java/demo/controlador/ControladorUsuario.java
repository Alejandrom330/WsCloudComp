package demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.modelo.entidades.Usuario;
import demo.modelo.entidades.Videojuego;
import demo.modelo.gestor.GestorUsuario;
import demo.modelo.gestor.GestorVideojuego;


//Esta anotacion sirve para dar de alta un objeto controlador
//en nuestra app. Es parecida a la anotacion @RestController
//pero tiene diferencias

//Cosas iguales:
// Ambas anotaciones sirven para mapear urls con metodos (o recursos)
// y ambas procesan peticiones HTTP

//Cosas diferentes:
// Cuando haciamos REST el interncambio de informacionen en el body
// del http se hacia con JSON, en este caso lo que devolveran los 
// metodos serán paginas web
@Controller
public class ControladorUsuario {

	@Autowired
	private GestorUsuario gestorUsuario;
	@Autowired
	private GestorVideojuego gestorVideojuego;
	
	//Si la pagina web nos manda los datos por GET, entonces
	//los datos iran como parte de la URL de peticion
	
	//Si la pagina web nos manda los datos por POST, entonces
	//los datos iran dentro del body el mensaje HTTP
	
	//Cramos un metodo que mapee una URL por POST, y lo que vamos
	//a devolver va a ser el nombre de una pagina web localizada
	//en src/main/resources/templates o src/main/resources/static
	
	//Tambien debemos de recoger los parametros que nos envia el 
	//cliente, y haremos por los parametros de entrada de este
	//metodo, anotados con @RequestParam("NOMBRE_PARAMETRO_FORM")
	
	//El objeto Model nos va a ayudar a pasarle información desde
	//Controlador a la vista, nos va a servir de objeto que tranporta
	//información
	
	@PostMapping("doLogin")
	public String logarse(
			@RequestParam("nombre") String nombre,
			@RequestParam("psw") String password,
			Model model) {
		
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPsw(password);
		
		boolean validado = gestorUsuario.validarUsuario(usuario);
		
		List<Videojuego> listaVideojuegos = gestorVideojuego.mostrarVideojuegos();

		if(validado) {

			model.addAttribute("nombreUsuario", nombre);
			
			
			model.addAttribute("listaVideojuegos", listaVideojuegos);
		
			return "inicio";
		}else {
		
			return "Error Usuario";
		}
	}
}