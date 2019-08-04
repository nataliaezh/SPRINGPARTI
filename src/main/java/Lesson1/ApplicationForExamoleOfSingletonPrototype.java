package Lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationForExamoleOfSingletonPrototype {
    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("app-Int");

        final Beta beta = context.getBean(Beta.class);
        final Mega mega = context.getBean(Mega.class);

        System.out.println(beta);
        System.out.println(mega);

    }
}
}
