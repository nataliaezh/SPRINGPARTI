package Lesson3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        final ProjectDAO projectDAO = ctx.getBean(ProjectDAO.class);
        projectDAO.persist(new Project("MOVIE", CURRENTSTATUS.NEW));
    }
}
