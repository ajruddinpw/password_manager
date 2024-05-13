package ajju.ali.entity;

import jakarta.persistence.*;

@Entity
@Table(name="passwords")
public class PasswordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="website")
    private String website;

    @Column(name="user")
    private String user;

    @Column(name="password")
    private String password;

    @Column(name="notes")
    private String notes;


    public PasswordEntity() {

    }

    public PasswordEntity(String name, String website, String user, String password, String notes) {
        this.name = name;
        this.website = website;
        this.user = user;
        this.password = password;
        this.notes = notes;
    }

    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "PasswordEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", password='" + password + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}








