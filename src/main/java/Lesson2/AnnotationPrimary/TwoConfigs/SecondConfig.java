package Lesson2.AnnotationPrimary.TwoConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecondConfig {

    @Bean
    public BestService bestService(){
        return new BestService();
    }
}
