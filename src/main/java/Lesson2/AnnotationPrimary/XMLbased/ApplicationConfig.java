package Lesson2.AnnotationPrimary.XMLbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("XMLbased")
@Configuration
public class ApplicationConfig {

    @Bean ("mega")
    public Mega mega(){
        return new Mega("123");
    }
}
