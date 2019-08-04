package Lesson2.AnnotationPrimary.InjectVersusAutowired;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

public class TestService {
    @Inject
    private BestService bestService;

    @Autowired
    private  MegaService megaService;

    @Autowired (required = true)
    private PegaService pegaService;

    // флаг required указывает на то, что значение аннотации (конкретно @Autowired) установлено на false
    //Аннотация Autowired указывает Spring, что если не найдется ни одного
    //подходящего объекта, ничего внедрять не надо
    //@Inject (!!! добавить зависимость javax в pom) в этом случае поставит null, так как это непараметизированная переменная, т.е.
    //никаких параметров добавлять нельзя (точно также как @Autowired по умолчанию)

    @Autowired (required = false)
    private BetaService betaService;

    public BestService getBestService() {
        return bestService;
    }

    public MegaService getMegaService() {
        return megaService;
    }

    public PegaService getPegaService() {
        return pegaService;
    }

    public BetaService getBetaService() {
        return betaService;
    }

}
