package Lesson2.AnnotationPrimary.Multiple;

import org.springframework.beans.factory.annotation.Autowired;

public class OmegaService {
    @Autowired
    public void setBestService(BetaService bestService) {
        this.bestService = bestService;
    }

    private BetaService bestService;

    public BetaService getBestService() {
        return bestService;
    }


}
