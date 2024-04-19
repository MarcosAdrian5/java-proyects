package mx.com.session26.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class StudentInfo {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotEmpty
    @Column(length = 30)
    private String name;

    @NotEmpty
    @Column(length = 30)
    private String middleName;

    @NotEmpty
    @Column(length = 30)
    private String lastName;

    @NotEmpty
    @Column(length = 20)
    private String gender;


    @NotEmpty
    @Column(length = 30)
    private String birthdate;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getMiddleName() {
        return middleName;
    }


    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getBirthdate() {
        return birthdate;
    }


    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    
}
