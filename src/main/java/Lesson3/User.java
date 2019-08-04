package Lesson3;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table (name = "project_User")
public class User {

    @Id
    private  String id= UUID.randomUUID().toString();

    @Column
    private String login;

    @Column
    private String password;

    public CURRENTSTATUS getCurrentstatus() {
        return currentstatus;
    }

    public void setCurrentstatus(CURRENTSTATUS currentstatus) {
        this.currentstatus = currentstatus;
    }

    @Enumerated
    private CURRENTSTATUS currentstatus;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @ManyToOne
    private Project project;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
