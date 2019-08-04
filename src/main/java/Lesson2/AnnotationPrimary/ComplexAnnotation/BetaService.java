package Lesson2.AnnotationPrimary.ComplexAnnotation;

import org.springframework.stereotype.Component;

@Component
public class BetaService {

    private  SimpleService simpleServiceBean;

    private  SimpleService simpleServiceImpl;

    private SimpleService simpleServiceTest;

    public SimpleService getSimpleServiceBean() {
        return simpleServiceBean;
    }

    public void setSimpleServiceBean(SimpleService simpleServiceBean) {
        this.simpleServiceBean = simpleServiceBean;
    }

    public SimpleService getSimpleServiceImpl() {
        return simpleServiceImpl;
    }

    public void setSimpleServiceImpl(SimpleService simpleServiceImpl) {
        this.simpleServiceImpl = simpleServiceImpl;
    }

    public SimpleService getSimpleServiceTest() {
        return simpleServiceTest;
    }

    public void setSimpleServiceTest(SimpleService simpleServiceTest) {
        this.simpleServiceTest = simpleServiceTest;
    }
}
