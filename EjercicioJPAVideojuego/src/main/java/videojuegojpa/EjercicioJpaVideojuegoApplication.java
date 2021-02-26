package videojuegojpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import videojuegojpa.modelo.entidad.Videojuego;
import videojuegojpa.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class EjercicioJpaVideojuegoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioJpaVideojuegoApplication.class, args);
		
		DaoVideojuego daoVideojuego = context.getBean("daoVideojuego", DaoVideojuego.class);
		
		Videojuego v1 = new Videojuego();
		v1.setNombre("Genshin Impact");
		v1.setCompañia("MiHoyo");
		v1.setPrecio(10);
		v1.setPuntuacion(4.5);
		daoVideojuego.save(v1);

		Videojuego v2 = new Videojuego();
		v2.setNombre("Epic Seven");
		v2.setCompañia("Smilegate");
		v2.setPrecio(0);
		v2.setPuntuacion(4);
		daoVideojuego.save(v2);

		Videojuego v3 = new Videojuego();
		v3.setNombre("Pokemon Master");
		v3.setCompañia("Niantic");
		v3.setPuntuacion(3.9);
		v3.setPrecio(5);
		daoVideojuego.save(v3);
		
		Optional<Videojuego> vOptional = daoVideojuego.findById(8);
		if (vOptional.isPresent()) {
			System.out.println("Existe en la base dedatos");
		} else {
			System.out.println("No existe en la base de datos");
		}
		
		System.out.println("\nLISTA DE VIDEOJUEGOS");
		List<Videojuego> listaVideojuegos = daoVideojuego.findAll();
		for (Videojuego videojuego : listaVideojuegos) {
			System.out.println(videojuego);
		}
		
		Videojuego vModif = new Videojuego();
		vModif.setId(1);
		vModif.setNombre("Summoners Wars");
		vModif.setCompañia("Smilegate");
		vModif.setPuntuacion(5);
		vModif.setPrecio(20);
		daoVideojuego.save(vModif);

		System.out.println("\nLISTA DE VIDEOJUEGOS ( VIDEOJUEGO 1 MODIFICADO )");
		List<Videojuego> listaModif = daoVideojuego.findAll();
		for (Videojuego videojuego : listaModif) {
			System.out.println(videojuego);
		}

		daoVideojuego.deleteById(3);

		System.out.println("\nLISTA DE VIDEOJUEGOS ( VIDEOJUEGO 3 ELIMINADO )");
		List<Videojuego> listaDelete = daoVideojuego.findAll();
		for (Videojuego videojuego : listaDelete) {
			System.out.println(videojuego);
		}
		
	}

}
