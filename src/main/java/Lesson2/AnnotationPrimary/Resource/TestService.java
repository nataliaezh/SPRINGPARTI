package Lesson2.AnnotationPrimary.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TestService {

    @Autowired
    //@Qualifier("bean")
  // @Qualifier("bestServiceBean")
    @Qualifier("mega")
    private BestService bestServiceBean;

    @Autowired
    @Qualifier("impl")
    private BestService bestServiceImpl;

    @Autowired
    @Resource(name = "bestServiceImpl")
    private BestService bestImpl;

    @Autowired
    @Resource(name = "bestServiceBean")
    private BestService bestBean;

    public BestService getBestServiceBean() {
        return bestServiceBean;
    }

    public BestService getBestServiceImpl() {
        return bestServiceImpl;
    }

    public BestService getBestImpl() {
        return bestImpl;
    }

    public BestService getBestBean() {
        return bestBean;
    }
}
