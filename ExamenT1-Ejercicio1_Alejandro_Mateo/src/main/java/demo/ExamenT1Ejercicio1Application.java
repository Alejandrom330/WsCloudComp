package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Director;
import demo.modelo.entidad.Pelicula;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class ExamenT1Ejercicio1Application {
	
	public static ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(ExamenT1Ejercicio1Application.class, args);
		
		context = SpringApplication.run(ExamenT1Ejercicio1Application.class, args);
		
		Pelicula p1 = context.getBean("pelicula", Pelicula.class);
		
		System.out.println(p1);
		
		Pelicula p2 = context.getBean("peli2", Pelicula.class);
		p2.setDirector(new Director("Juan", 30));
		
		System.out.println(p2);
		
		Pelicula p3 = context.getBean("peli3", Pelicula.class);
		p3.setDirector(new Director("Santi", 60));
		
		System.out.println(p3);
	}
}
