package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Autor;
import demo.modelo.entidad.Email;
import demo.modelo.entidad.Libro;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class EjercicioSpringBoot2Application {
	
	public static ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioSpringBoot2Application.class, args);
		
		context = SpringApplication.run(EjercicioSpringBoot2Application.class, args);
		
		Email email1 = context.getBean("email", Email.class);
		System.out.println(email1);
		
		Email email2 = context.getBean("emailSingleton", Email.class);
		Email email3 = context.getBean("emailSingleton", Email.class);
		
		System.out.println();
		
		System.out.println(email2);
		System.out.println(email3);
		
		Autor a1 = context.getBean("autor", Autor.class);
		a1.setNombre("AAAA");
		a1.setEdad(90);
		System.out.println(a1);
		
		Libro l1 = context.getBean("libro", Libro.class);
		l1.setAutor(a1);
		System.out.println(l1);
		
		Libro l2 = context.getBean("libro", Libro.class);
		l2.setAutor(a1);
		System.out.println(l2);
	}

}
