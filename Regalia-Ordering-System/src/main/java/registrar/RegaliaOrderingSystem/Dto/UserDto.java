package registrar.RegaliaOrderingSystem.Dto;


import org.springframework.beans.factory.annotation.Autowired;
import registrar.RegaliaOrderingSystem.Dao.Service.CeremonyService;
import registrar.RegaliaOrderingSystem.Dao.Service.UserService;
import registrar.RegaliaOrderingSystem.Models.Role;
import registrar.RegaliaOrderingSystem.Models.User;

import java.util.Set;

public class UserDto {

    private Long id;
    private String email;
    private String username;
    private String first_name;
    private String last_name;
    private boolean enabled;
    private Integer phone_number;
    private String ceremony_date;
    private String cap_size_inches;
    private String cap_size_fitted;
    private String degree;
    private String department;
    private Integer weight;
    private Integer height_feet;
    private Integer height_inches;
    private String granting_institution;
    private String granting_state;
    private String granting_city;
    private String last_updated;
    private Set<Role> roles;

    @Autowired
    private UserService userService;
    
    public UserDto(Long id) {
        User user = userService.get(id);
        this.id = user.getId();
        this.email = user.getEmail();
        this.first_name = user.getFirst_name();
        this.last_name = user.getLast_name();
        this.enabled = user.isEnabled();
        this.phone_number = user.getPhone_number();
        this.ceremony_date = user.getCeremony_date().getName();
        this.cap_size_inches = user.getCap_size().getInches();
        this.cap_size_fitted = user.getCap_size().getFitted();
        this.degree = user.getDegree().getName();
        this.department = user.getDepartment().getName();
        this.weight = user.getWeight();
        this.height_feet = user.getHeight_feet();
        this.height_inches = user.getHeight_inches();
        this.granting_institution = user.getGranting_institution();
        this.granting_state = user.getGranting_state().getName();
        this.granting_city = user.getGranting_city();
        this.last_updated = user.getLast_updated();
        this.roles = user.getRoles();
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public String getCeremony_date() {
        return ceremony_date;
    }

    public void setCeremony_date(String ceremony_date) {
        this.ceremony_date = ceremony_date;
    }

    public String getCap_size_inches() {
        return cap_size_inches;
    }

    public void setCap_size_inches(String cap_size_inches) {
        this.cap_size_inches = cap_size_inches;
    }

    public String getCap_size_fitted() {
        return cap_size_fitted;
    }

    public void setCap_size_fitted(String cap_size_fitted) {
        this.cap_size_fitted = cap_size_fitted;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGranting_state() {
        return granting_state;
    }

    public void setGranting_state(String granting_state) {
        this.granting_state = granting_state;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight_feet() {
        return height_feet;
    }

    public void setHeight_feet(Integer height_feet) {
        this.height_feet = height_feet;
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

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
