package Lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("SPRINGPARTI")
public class Application {
    public static void main(String[] args) {
        final ApplicationContext context= new AnnotationConfigApplicationContext(Application.class);
        System.out.println(context.getBean(MegaService.class));
    }
}
