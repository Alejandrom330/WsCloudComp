package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Cliente;
import demo.modelo.entidad.Pedido;

@SpringBootApplication
public class AplicacionPedidos {
	
	public static ApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(AplicacionPedidos.class, args);
		
		Cliente c = context.getBean("cliente", Cliente.class);
		c.setNombre("Jorge");
		c.setApellidos("Grande Nadal");
		
		c.setPedido(new Pedido(5, 25.8));
		
		System.out.println(c);
		
		
		Cliente c2 = context.getBean("cliente", Cliente.class);
		c2.setNombre("Jaime");
		c2.setApellidos("de La Rosa Gonzalez");
		
		Pedido p = context.getBean("pedido", Pedido.class);
		p.setId(7);
		p.setPrecio(7.6);
		
		c2.setPedido(p);
		
		System.out.println(c2);
	}

}
