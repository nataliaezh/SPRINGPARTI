package Lesson2.AnnotationPrimary.SeveralConfigFiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//ComponentScan - дополнительная конфигурация в данном случае, а не основная, кот. подается в конструктор
@ComponentScan("SeveralConfigFiles")
public class ExtraConfig {

    @Bean
    public BestService bestService(){
        return new BestService();
    }
}
