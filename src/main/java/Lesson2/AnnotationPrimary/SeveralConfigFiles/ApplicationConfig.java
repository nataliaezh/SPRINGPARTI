package Lesson2.AnnotationPrimary.SeveralConfigFiles;


import org.springframework.context.annotation.Import;

// Если классов конфигурации Config несколько, их можно перечислить через запятую, при этом будет создан массив
//и классы дб перечислены в фигурных скобках: @Import ({ExtraConfig.class,...})
@Import(ExtraConfig.class)
public class ApplicationConfig {
}
