package Lesson2.AnnotationPrimary.TwoConfigs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Здесь в MegaSrvice внедряется BestService
@Component
public class MegaService {

    private BestService bestService;
    @Autowired
    public BestService getBestService() {
        return bestService;
    }
}
