package registrar.RegaliaOrderingSystem.Models;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "FIRST_NAME")
    private String first_name;

    @Column(name = "LAST_NAME")
    private String last_name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ENABLED")
    private boolean enabled;

    @Column(name = "PHONE_NUMBER")
    private String phone_number;

    @ManyToOne
    @JoinColumn(name = "CEREMONY_ID", foreignKey = @ForeignKey(name = "CEREMONY_ID_FK"))
    private Ceremony ceremony_date;

    @ManyToOne
    @JoinColumn(name = "CAP_SIZE_ID", foreignKey = @ForeignKey(name = "CAP_SIZE_ID_FK"))
    private CapSize cap_size;

    @ManyToOne
    @JoinColumn(name = "DEGREE_ID", foreignKey = @ForeignKey(name = "DEGREE_ID_FK"))
    private Degree degree;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID", foreignKey = @ForeignKey(name = "DEPARTMENT_ID_FK"))
    private Department department;

    @Column(name = "WEIGHT")
    private Integer weight;

    @Column(name = "HEIGHT_INCHES")
    private Integer height_inches;

    @Column(name = "GRANTING_INSTITUTION")
    private String granting_institution;

    @Column(name = "GRANTING_CITY")
    private String granting_city;

    @ManyToOne
    @JoinColumn(name = "STATE_ID", foreignKey = @ForeignKey(name = "STATE_ID_FK"))
    private State granting_state;

    @Column(name = "LAST_UPDATED")
    private Date last_updated;

    public User(String username){
        this.username = username;
    }

    public User(){
        super();
    }

    public User(Long id, String email, String username, String first_name, String last_name, String password, boolean enabled, String phone_number, Ceremony ceremony_date, CapSize cap_size, Degree degree, Department department, Integer weight, Integer height_inches, String granting_institution, String granting_city, State granting_state, Date last_updated, Set<Role> roles) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.enabled = enabled;
        this.phone_number = phone_number;
        this.ceremony_date = ceremony_date;
        this.cap_size = cap_size;
        this.degree = degree;
        this.department = department;
        this.weight = weight;
        this.height_inches = height_inches;
        this.granting_institution = granting_institution;
        this.granting_city = granting_city;
        this.granting_state = granting_state;
        this.last_updated = last_updated;
        this.roles = roles;
    }

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "USERS_ROLES",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID")
    )
    private Set<Role> roles = new HashSet<>();

    public User(String email, String username, String first_name, String last_name, String phone_number, Ceremony cermonyByName, CapSize capSizeByName, Degree degreeByName, Department departmentIdByName, Integer weight, Integer height_inches, State stateIdByName) {
        this.email = email;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.ceremony_date = cermonyByName;
        this.cap_size = capSizeByName;
        this.degree = degreeByName;
        this.department = departmentIdByName;
        this.weight = weight;
        this.height_inches = height_inches;
        this.granting_state = stateIdByName;
    }

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Ceremony getCeremony_date() {
        return ceremony_date;
    }

    public void setCeremony_date(Ceremony ceremony_date) {
        this.ceremony_date = ceremony_date;
    }

    public CapSize getCap_size() {
        return cap_size;
    }

    public void setCap_size(CapSize cap_size) {
        this.cap_size = cap_size;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight_inches() {
        return height_inches;
    }

    public void setHeight_inches(Integer height_inches) {
        this.height_inches = height_inches;
    }

    public String getGranting_institution() {
        return granting_institution;
    }

    public void setGranting_institution(String granting_institution) {
        this.granting_institution = granting_institution;
    }

    public String getGranting_city() {
        return granting_city;
    }

    public void setGranting_city(String granting_city) {
        this.granting_city = granting_city;
    }

    public State getGranting_state() {
        return granting_state;
    }

    public void setGranting_state(State granting_state) {
        this.granting_state = granting_state;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
