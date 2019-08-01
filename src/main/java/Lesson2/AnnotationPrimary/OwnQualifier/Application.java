package Lesson2.AnnotationPrimary.OwnQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("OwnQualifier")
public class Application {
    public static void main(String[] args) {

        final ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        final TestService testService = context.getBean(TestService.class);

        System.out.println(testService.getBestServiceOne().getClass().getSimpleName());
        System.out.println(testService.getBestServiceTwo().getClass().getSimpleName());
        System.out.println(testService.getBestService().getClass().getSimpleName());
    }

}
