package registrar.RegaliaOrderingSystem.Models;

import com.sun.xml.bind.v2.TODO;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Faculty {

    private int ID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String College;
    private String PhoneNumber;
    private String Department;
    private String CapSize;
    private String Degree;
    private String Discipline;
    private int Weight;
    private int HeightFeet;
    private int HeightInches;
    private String GrantingInstitution;
    private String InstitutionState;
    private String InstitutionCity;
    private String CeremonyDate;
    private Boolean FacultyValue;//TODO replace in favor of a roles field
    private Boolean AdminValue; //TODO replace in favor of a roles field
    private Date AuthDate;



    public Faculty(){

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getCapSize() {
        return CapSize;
    }

    public void setCapSize(String capSize) {
        CapSize = capSize;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getDiscipline() {
        return Discipline;
    }

    public void setDiscipline(String discipline) {
        Discipline = discipline;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getHeightFeet() {
        return HeightFeet;
    }

    public void setHeightFeet(int heightFeet) {
        HeightFeet = heightFeet;
    }

    public int getHeightInches() {
        return HeightInches;
    }

    public void setHeightInches(int heightInches) {
        HeightInches = heightInches;
    }

    public String getGrantingInstitution() {
        return GrantingInstitution;
    }

    public void setGrantingInstitution(String grantingInstitution) {
        GrantingInstitution = grantingInstitution;
    }

    public String getInstitutionState() {
        return InstitutionState;
    }

    public void setInstitutionState(String institutionState) {
        InstitutionState = institutionState;
    }

    public String getInstitutionCity() {
        return InstitutionCity;
    }

    public void setInstitutionCity(String institutionCity) {
        InstitutionCity = institutionCity;
    }

    public String getCeremonyDate() {
        return CeremonyDate;
    }

    public void setCeremonyDate(String ceremonyDate) {
        CeremonyDate = ceremonyDate;
    }

    public Boolean getFacultyValue() {
        return FacultyValue;
    }

    public void setFacultyValue(Boolean facultyValue) {
        FacultyValue = facultyValue;
    }

    public Boolean getAdminValue() {
        return AdminValue;
    }

    public void setAdminValue(Boolean adminValue) {
        AdminValue = adminValue;
    }

    public Date getAuthDate() {
        return AuthDate;
    }

    public void setAuthDate(Date authDate) {
        AuthDate = authDate;
    }
}

