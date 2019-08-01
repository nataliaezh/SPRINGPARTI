package Lesson2.AnnotationPrimary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("AnnotationPrimary")
public class Application {
    public static void main(String[] args) {


        final ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        MegaService megaService = context.getBean(MegaService.class);
        System.out.println(megaService.getClass().getSimpleName());
    }

}
