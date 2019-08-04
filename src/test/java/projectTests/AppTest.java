package projectTests;

import com.geekbrains.SPRING_Lesson3_HW.AppConfig;
import com.geekbrains.SPRING_Lesson3_HW.Project;
import com.geekbrains.SPRING_Lesson3_HW.ProjectDAO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

public class AppTest {

    @Test
    public void testFindAll(){
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        final ProjectDAO projectDAO = ctx.getBean(ProjectDAO.class);
        Assert.assertFalse(projectDAO.findAll().isEmpty());
    }

    @Test
    public void testFindOne(){
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        final ProjectDAO projectDAO = ctx.getBean(ProjectDAO.class);
        final Project project = new Project();
        project.setId(UUID.randomUUID().toString());
        projectDAO.persist(project);
        Assert.assertNotNull(projectDAO.findOne(project.getId()));
    }

    @Test
    public void testRemoveById(){
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        final ProjectDAO projectDAO = ctx.getBean(ProjectDAO.class);
        final Project project = new Project();
        project.setId(UUID.randomUUID().toString());
        projectDAO.persist(project);
        Assert.assertEquals(true, projectDAO.findOne(String.valueOf(project.getId().isEmpty())));
    }

    @Test
    public void testRemoveAll(){
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        final ProjectDAO projectDAO = ctx.getBean(ProjectDAO.class);
        final Project project = new Project();
        project.setId(UUID.randomUUID().toString());
        projectDAO.persist(project);
        Assert.assertEquals(true, projectDAO.findAll().isEmpty());
    }
    @Test
    public void testGetById(){
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        final ProjectDAO projectDAO = ctx.getBean(ProjectDAO.class);
        final Project project = new Project();
        project.setId(UUID.randomUUID().toString());
        projectDAO.persist(project);
        Assert.assertEquals(true, projectDAO.findOne(String.valueOf(project.getId().isEmpty())));
    }

    @Test
    public void testPersist(){
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        final ProjectDAO projectDAO = ctx.getBean(ProjectDAO.class);

        final Project project = new Project();

        project.setName(UUID.randomUUID().toString());
        projectDAO.persist(project);

        Assert.assertNotNull(projectDAO.findOne(project.getId()));
    }


}
