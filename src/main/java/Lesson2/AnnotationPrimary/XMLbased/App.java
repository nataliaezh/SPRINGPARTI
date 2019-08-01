package Lesson2.AnnotationPrimary.XMLbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
       final ApplicationContext context=new ClassPathXmlApplicationContext("app-context");
      //  final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        System.out.println(context.getBean(Mega.class).hashCode());
        System.out.println(context.getBean(Beta.class).hashCode());
        System.out.println(context.getBean(Alpha.class).hashCode());
        System.out.println(context.getBean(Mega.class).getName());

    }
}
