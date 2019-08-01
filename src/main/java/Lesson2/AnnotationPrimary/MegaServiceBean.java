package Lesson2.AnnotationPrimary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MegaServiceBean implements MegaService {
}
