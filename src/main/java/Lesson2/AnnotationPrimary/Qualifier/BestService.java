package Lesson2.AnnotationPrimary.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BestService {

    @Autowired
    @Qualifier("bean")
    private SimpleService simpleBean;

    public SimpleService getSimpleBean() {
        return simpleBean;
    }

    public SimpleService getSimpleImpl() {
        return simpleImpl;
    }

    @Autowired
    @Qualifier("impl")
    private SimpleService simpleImpl;
}
