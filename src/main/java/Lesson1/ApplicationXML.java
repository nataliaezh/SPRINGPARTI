package Lesson1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationXML {

    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app");
        System.out.println(context);
    }
}

