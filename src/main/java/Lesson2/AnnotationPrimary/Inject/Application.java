package Lesson2.AnnotationPrimary.Inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("Inject")
public class Application {
    public static void main(String[] args) {


        final ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        final TestService testService = context.getBean(TestService.class);

        System.out.println(testService.getBestService());
        System.out.println(testService.getMegaService());
    }
}
