package registrar.RegaliaOrderingSystem.Models;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Faculty {

    private Long id;
    private String email;
    private String name;
    private String phonenumber;
    private String department;
    private String capsize;
    private String college;
    private String degree;
    private String discipline;
    private int heightfeet;
    private int heightinches;
    private int weight;

    public Faculty(){

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCapsize() {
        return capsize;
    }

    public void setCapsize(String capsize) {
        this.capsize = capsize;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getHeightfeet() {
        return heightfeet;
    }

    public void setHeightfeet(int heightfeet) {
        this.heightfeet = heightfeet;
    }

    public int getHeightinches() {
        return heightinches;
    }

    public void setHeightinches(int heightinches) {
        this.heightinches = heightinches;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}

