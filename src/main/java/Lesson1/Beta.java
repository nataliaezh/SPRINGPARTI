package Lesson1;

public class Beta {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Beta{"+"name='" +name +'\'' +'}';
    }
}


