package Lesson2.AnnotationPrimary.SeveralConfigFiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
         final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

         final MegaService megaService = context.getBean(MegaService.class);

         final BestService bestService = context.getBean(BestService.class);
        System.out.println(megaService);
        System.out.println(bestService);
    }

}
