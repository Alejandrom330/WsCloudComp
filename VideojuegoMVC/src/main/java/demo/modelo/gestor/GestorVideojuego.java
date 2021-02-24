package demo.modelo.gestor;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.modelo.entidades.Videojuego;
import demo.modelo.persistencia.DaoVideojuego;

@Service
public class GestorVideojuego {
	
	@Autowired
	private DaoVideojuego daoVideojuego;
	
	public Videojuego buscarId(int id) {
		Optional<Videojuego> videojuegoAux = daoVideojuego.findById(id);
		
	
		if(videojuegoAux.isPresent()) {
			return videojuegoAux.get();
		}else {
			return null;
		}
	}
	
	public List<Videojuego> mostrarVideojuegos(){
		List<Videojuego> listaVideojuego = daoVideojuego.findAll();
		return listaVideojuego;
	}
			 

}


								
						