package Lesson3;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "project_Task")
public class Task {
    @Id
    private String id = UUID.randomUUID().toString();

    @Column
    private String name;

    @Enumerated
    private CURRENTSTATUS currentstatus;

    @ManyToOne
    private Project project;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public Project getProject() {
        return project;
    }
    public void setName(String name) {
        this.name = name;
    }



    public void setProject(Project project) {
        this.project = project;
    }

    public CURRENTSTATUS getCurrentstatus() {
        return currentstatus;
    }

    public void setCurrentstatus(CURRENTSTATUS status) {
        this.currentstatus = currentstatus;
    }
}