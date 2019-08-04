package Lesson2.AnnotationPrimary.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
     final ApplicationContext ctx = new ClassPathXmlApplicationContext("app-resources");


       final TestService testService = ctx.getBean(TestService.class);

        System.out.println(testService.getBestServiceBean().getClass().getSimpleName());
        System.out.println(testService.getBestServiceImpl().getClass().getSimpleName());
        System.out.println(testService.getBestBean().getClass().getSimpleName());
        System.out.println(testService.getBestImpl().getClass().getSimpleName());
    }
}
