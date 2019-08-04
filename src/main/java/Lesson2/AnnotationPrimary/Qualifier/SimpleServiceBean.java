package Lesson2.AnnotationPrimary.Qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bean")
public class SimpleServiceBean implements SimpleService {
}
