package demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidades.Usuario;
import demo.modelo.entidades.Videojuego;
import demo.modelo.persistencia.DaoUsuario;
import demo.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class VideojuegoMvcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(VideojuegoMvcApplication.class, args);
		
		DaoUsuario du = context.getBean("daoUsuario", DaoUsuario.class);
	
		Usuario u = new Usuario();
		u.setNombre("Alex");
		u.setPsw("123456");
		
		du.save(u);
		
		DaoVideojuego dv = context.getBean("daoVideojuego", DaoVideojuego.class);
		
		List<Videojuego> listaVideojuego = new ArrayList<>();
		Videojuego v1 = new Videojuego();
		v1.setNombre("Metal Gear Solid");
		v1.setCompany("Konami(KojimaCompany)");			
		listaVideojuego.add(v1);
		
		Videojuego v2 = new Videojuego();
		v2.setNombre("Spyro");
		v2.setCompany("Insomniac Games");			
		listaVideojuego.add(v2);
		
		Videojuego v3 = new Videojuego();
		v3.setNombre("Genshin Impact");
		v3.setCompany("MiHoyo");			
		listaVideojuego.add(v3);
		
		Videojuego v4 = new Videojuego();
		v4.setNombre("The Last Of Us");
		v4.setCompany("Naughty Dogs");			
		listaVideojuego.add(v4);
		
		dv.saveAll(listaVideojuego);
		} 
}
