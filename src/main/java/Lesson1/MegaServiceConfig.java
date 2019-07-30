package Lesson1;

public class MegaServiceConfig {

    private String name;

    public MegaServiceConfig(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "MegaService{"+"name='" +name +'\'' +'}';
    }
}


