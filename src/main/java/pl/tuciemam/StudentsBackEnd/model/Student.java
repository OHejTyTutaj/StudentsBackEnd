package pl.tuciemam.StudentsBackEnd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "studentsdatabase")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "emailr_id")
    private String emailrId;

    public Student() {

    }

    public Student(String firstName, String lastName, String emailrId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailrId = emailrId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailrId() {
        return emailrId;
    }

    public void setEmailrId(String emailId) {
        this.emailrId = emailId;
    }
}
