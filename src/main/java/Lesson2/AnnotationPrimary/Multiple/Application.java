package Lesson2.AnnotationPrimary.Multiple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("Multiple")
public class Application {
    public static void main(String[] args) {

        final ApplicationContext context = new AnnotationConfigApplicationContext(Autowired.Application.class);

        final MegaService megaService = context.getBean(MegaService.class);
        final BetaService betaService = context.getBean(BetaService.class);
        final OmegaService omegaService = context.getBean(OmegaService.class);
        final TestService testService = context.getBean(TestService.class);

        System.out.println(megaService.getBestService());
        System.out.println(betaService.getBestService());
        System.out.println(omegaService.getBestService());
        System.out.println(testService.getBestService());
    }
}
