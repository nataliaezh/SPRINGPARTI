package Lesson2.AnnotationPrimary.OwnQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Wanted
    @Autowired
    private BestService bestServiceOne;

    @Wanted
    @Autowired
    private BestService bestServiceTwo;

    @NotWanted
    @Autowired
    private BestService bestService;

    public BestService getBestServiceOne() {
        return bestServiceOne;
    }

    public void setBestServiceOne(BestService bestServiceOne) {
        this.bestServiceOne = bestServiceOne;
    }

    public BestService getBestServiceTwo() {
        return bestServiceTwo;
    }

    public void setBestServiceTwo(BestService bestServiceTwo) {
        this.bestServiceTwo = bestServiceTwo;
    }

    public BestService getBestService() {
        return bestService;
    }

    public void setBestService(BestService bestService) {
        this.bestService = bestService;
    }
}
