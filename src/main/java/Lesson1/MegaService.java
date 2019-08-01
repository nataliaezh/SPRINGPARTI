package Lesson1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(BeanDefinition.SCOPE_SINGLETON)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope("singleton")
//@Scope("prototype")
public class MegaService {
}
