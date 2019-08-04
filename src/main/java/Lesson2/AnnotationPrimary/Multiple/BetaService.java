package Lesson2.AnnotationPrimary.Multiple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BetaService {
@Autowired
    private BetaService bestService;

    public BetaService getBestService() {
        return bestService;
    }
}
