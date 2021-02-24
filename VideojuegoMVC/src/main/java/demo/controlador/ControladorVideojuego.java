package demo.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.modelo.entidades.Videojuego;
import demo.modelo.gestor.GestorVideojuego;

@Controller
public class ControladorVideojuego {
	
	@Autowired
	private GestorVideojuego gestorVideojuego;
	@PostMapping("buscarId") 
	public String buscarId(
			@RequestParam("id") int id,
			Model model) { 

		Videojuego validado = gestorVideojuego.buscarId(id);

		if(validado != null) {

			model.addAttribute("juego", validado);
		
			return "juego";
		}else {
		
			return "errorId";
		}
	}
}
