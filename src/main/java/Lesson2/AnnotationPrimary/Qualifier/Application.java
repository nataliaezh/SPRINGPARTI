package Lesson2.AnnotationPrimary.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("Qualifier")
public class Application {
    public static void main(String[] args) {


        final ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        BestService bestService = context.getBean(BestService.class);

        System.out.println(bestService.getSimpleBean().getClass().getSimpleName());
        System.out.println(bestService.getSimpleImpl().getClass().getSimpleName());
    }
}
