package Lesson2.AnnotationPrimary.ComplexAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        final BetaService betaService = context.getBean(BetaService.class);

        System.out.println(betaService.getSimpleServiceBean().getClass().getSimpleName());
        System.out.println(betaService.getSimpleServiceImpl().getClass().getSimpleName());
        System.out.println(betaService.getSimpleServiceTest().getClass().getSimpleName());
    }
}
