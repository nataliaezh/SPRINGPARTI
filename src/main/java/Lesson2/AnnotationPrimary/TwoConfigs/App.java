package Lesson2.AnnotationPrimary.TwoConfigs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //вместо указания основного файла конфигурации в качестве входного аргумента, над классами, которые будут собирать бины
        //фабричными методами стоят @Configuration/
        //Для переменной ниже конструктор дефолтный
        //Т.о. достигается множественная конфигурация
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //Ранее мы этот метод указывали как ComponentScan и просим его искать конфигарации по указанному пакету
        context.scan("TwoConfigs");
        //после вызова метода refresh() проинициализируется контекст и с ним можно будет работать
        context.refresh();

        final MegaService megaService =context.getBean(MegaService.class);

        final BestService bestService=context.getBean(BestService.class);

        final TestService testService=context.getBean(TestService.class);

        System.out.println(megaService);
        System.out.println(bestService);
        System.out.println(testService);
    }
}
