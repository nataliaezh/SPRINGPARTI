package Lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppUsingAplicationConfig {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        System.out.println(context.getBean("megaService"));
        System.out.println(context.getBean("megaServiceFirst"));
        System.out.println(context.getBean("megaServiceSecond"));
    }
    }
