package Lesson2.AnnotationPrimary.TwoConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstConfig {

    @Bean
    public TestService testService(){
        return  new TestService();
    }
}
