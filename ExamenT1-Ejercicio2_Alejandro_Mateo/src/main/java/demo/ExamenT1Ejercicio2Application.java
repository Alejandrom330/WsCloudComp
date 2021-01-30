package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Avion;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class ExamenT1Ejercicio2Application {
	
	public static ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(ExamenT1Ejercicio2Application.class, args);
		
		context = SpringApplication.run(ExamenT1Ejercicio2Application.class, args);
		
		Avion av1 = context.getBean("avion1", Avion.class);
		
		System.out.println(av1);
		
		Avion av2 = context.getBean("avion2", Avion.class);
		
		System.out.println(av2);
		
	}

}
