package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Autor;
import demo.modelo.entidad.Email;
import demo.modelo.entidad.Libro;

@SpringBootApplication
@ImportResource("classpath:context.xml")
public class RepasoExamenApplication {
	
	public static ApplicationContext context1;

	public static void main(String[] args) {
		SpringApplication.run(RepasoExamenApplication.class, args);
		
		context1 = SpringApplication.run(RepasoExamenApplication.class, args);
		
		Email e1 = context1.getBean("email", Email.class);
		e1.setId(1);
		e1.setDestinatario("Jorge");
		e1.setRemitente("Jaime");
		
		Email e2 = context1.getBean("email2", Email.class);
		
		Email e3 = context1.getBean("email3", Email.class);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		
		Libro l1 = context1.getBean("libro", Libro.class);
		l1.setIsbn("A");
		l1.setEditorial("A");
		l1.setAutor(new Autor(1, "Jorge", 13));
		
		System.out.println(l1);
		
		Libro l2 = context1.getBean("libro2", Libro.class);
		
		System.out.println(l2);
		
		Libro l3 = context1.getBean("libro3", Libro.class);
		System.out.println(l3);
	}
}