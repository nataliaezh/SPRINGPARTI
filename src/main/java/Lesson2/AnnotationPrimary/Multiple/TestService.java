package Lesson2.AnnotationPrimary.Multiple;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class TestService {
    @Autowired
    private BetaService bestService;

}
