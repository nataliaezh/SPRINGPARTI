package Lesson3;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "list_Project")
public class Project {

    @Id
    private String id = UUID.randomUUID().toString();

    @Column
    private String name;

    @Enumerated
    private CURRENTSTATUS currentstatus;

    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, CURRENTSTATUS currentstatus) {
        this.name = name;
        this.currentstatus = currentstatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CURRENTSTATUS getCurrentstatus() {
        return currentstatus;
    }

    public void setCurrentstatus(CURRENTSTATUS currentstatus) {
        this.currentstatus = currentstatus;
    }
}

