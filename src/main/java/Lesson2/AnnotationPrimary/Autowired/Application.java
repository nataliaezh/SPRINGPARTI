package Lesson2.AnnotationPrimary.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("Autowired")
public class Application {
    public static void main(String[] args) {

        final ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        final BestService bestService = context.getBean(BestService.class);
        final TestService testService = context.getBean(TestService.class);

        System.out.println(bestService.getTestService().hashCode());
        System.out.println(testService.getBestService().hashCode());

        System.out.println();

        System.out.println(context.getBean(BestService.class).getTestService());
        System.out.println(new BestService().getTestService());

}
}
