package Lesson2.AnnotationPrimary.InjectVersusAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("InjectVersusAutowired")
public class Application {
    public static void main(String[] args) {


        final ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        final TestService testService = context.getBean(TestService.class);

        System.out.println(testService.getBestService());
        System.out.println(testService.getMegaService());
        System.out.println(testService.getPegaService());
        System.out.println(testService.getBetaService());


    }
}
