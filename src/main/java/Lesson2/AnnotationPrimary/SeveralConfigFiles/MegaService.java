package Lesson2.AnnotationPrimary.SeveralConfigFiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// MegaService имеет конфигурацию Annotation-based, и поэтому для того, чтобы она считалась
//дб указан ComponentScan на пакет, в котором содержатся классы с аннотацией
@Component
public class MegaService {

    @Autowired
    private BestService bestService;

    public BestService getBestService() {
        return bestService;
    }
}
