package demo.modelo.gestor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.modelo.entidades.Usuario;
import demo.modelo.persistencia.DaoUsuario;

@Service
public class GestorUsuario {

	@Autowired
	private DaoUsuario daoUsuario;
	
	//Esta capa se encarga de logida de la aplicacion, de validaciones
	//, de aplicar requisitos del cliente
	public boolean validarUsuario(Usuario usuario) {
		Usuario usuarioAux = daoUsuario.findByNombreAndPsw(usuario.getNombre(), usuario.getPsw());
		
		//si usuarioAux es null, entonces no esta en la BBDD
		//Si existe, entonces el usuario si existe
		
		
		if(usuarioAux == null) {
			return false;
		}else {
			return true;
		} 
	}
}
