package ejercicioCasa;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCasa {

    private static ApplicationContext context;

	public static void main(String[] args) {
            context = new ClassPathXmlApplicationContext("recursos/context.xml");
            
            Casa casa = context.getBean("casa", Casa.class);
            System.out.println(casa);
    }

}