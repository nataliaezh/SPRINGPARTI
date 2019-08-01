package Lesson2.AnnotationPrimary.Inject;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class TestService {


    @Inject
    private BestService bestService;

    public BestService getBestService() {
        return bestService;
    }

    @Inject
    public MegaService getMegaService() {
        return megaService;
    }

    @Inject
    private MegaService megaService;
}
