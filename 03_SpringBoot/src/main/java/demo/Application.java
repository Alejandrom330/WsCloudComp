package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Persona;

/*
 * Esta clase de aqui va a ser nuestro punto de entrada de
 * la aplicacion
 * 
 * esta anotacion carga todo el contexto de spring y 
 * autoconfigura la aplicacion para funcionar
 * 
 * Por ejemplo si tu la has dicho en el starter que 
 * quieres usar una base de datos, si no configuras una 
 * base de datos esta anotacion te levanta una base de datos 
 * en memoria perfectamente operativa
 */

@SpringBootApplication
public class Application {
	
	public static ApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		/*
		 * Al ser prototipada la persona, siempre que le pidamos una persona
		 * al contexto de spring, me va a devolver un objero nuevo para 
		 * nuestro disfrute
		 */
		
		Persona p = context.getBean("persona", Persona.class);
		p.setEdad(25);
		
		System.out.println(p);
		
		Persona p2 = context.getBean("persona", Persona.class);
		
		System.out.println(p2);
		
	}

}
