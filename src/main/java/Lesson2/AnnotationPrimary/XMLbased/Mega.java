package Lesson2.AnnotationPrimary.XMLbased;

import org.springframework.stereotype.Component;

@Component("mega")

public class Mega {
    private String name="777";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mega(String name) {
        this.name = name;
    }
}
