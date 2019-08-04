package Lesson2.AnnotationPrimary.Autowired;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class BestService {

    @Autowired
    private TestService testService;

    public TestService getTestService() {
        return testService;
    }



}
