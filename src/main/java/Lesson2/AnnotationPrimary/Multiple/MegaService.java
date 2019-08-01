package Lesson2.AnnotationPrimary.Multiple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MegaService {
    private final BetaService bestService;

    public BetaService getBestService() {
        return bestService;
    }

    @Autowired
    public MegaService(BetaService bestService) {
        this.bestService = bestService;
    }
}

