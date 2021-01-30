package negocios;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidades.Persona;

public class MainSpring {
	
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		
		// el contexto de spring tambien es un objeto  asi que tenemos que crearlo
		 
		context = new ClassPathXmlApplicationContext("recursos/context.xml");
		
		//a partir de aqui tendremos nuestro contexto de spring cargado junto los objetos que haya en el XML
		
		//a partir de ahora, siempre que queramos un objeto gestionado por spring tenemos que pedirlo al contexto
		
		Persona persona1 = (Persona) context.getBean("persona1");
		System.out.println(persona1);
		
		persona1.setNombre("Harry Potter");
		
		//esto seria de una manera habitual
		cambiarEdadPersona(persona1, 35);
		
		//con spring podramos hacer lo siguiente
		cambiarEdadPersona(65);
		
		System.out.println(persona1);
		
		persona1 = null;
		
		//1000 lineas mas abajo
		//manera equivalente a castear el objeto
		persona1 = context.getBean("persona1", Persona.class);
		
		System.out.println(persona1);
		
		persona1 = context.getBean("persona2", Persona.class);
		
		System.out.println(persona1);
		
		persona1 = context.getBean("persona3", Persona.class);
		
		System.out.println(persona1);
		
		persona1 = context.getBean("personaPrototipada", Persona.class);
		
		System.out.println(persona1);
		
		persona1.setNombre("Superman");
		
	/*	List<Persona> listaPersonas = context.getBean("listaPersonas", List.class);
		listaPersonas.add(persona1);*/
		
		persona1 = context.getBean("personaPrototipada", Persona.class);
		
		System.out.println(persona1);
		
	//	System.out.println(listaPersonas.get(0));
		
		persona1 = context.getBean("persona4", Persona.class);
		
		System.out.println(persona1);
	}
	
	public static void cambiarEdadPersona(Persona p, int edad) {
		p.setEdad(edad);
	}
	
	public static void cambiarEdadPersona(int edad) {
		Persona p = (Persona) context.getBean("persona1");
		
		p.setEdad(edad);
	}
}
