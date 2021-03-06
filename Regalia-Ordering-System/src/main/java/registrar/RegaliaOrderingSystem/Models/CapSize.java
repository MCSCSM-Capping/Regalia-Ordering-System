package registrar.RegaliaOrderingSystem.Models;

import javax.persistence.*;

@Entity
@Table(name = "capsize")
public class CapSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAPSIZE_ID")
    private long id;

    @Column(name = "INCHES", nullable = true, unique = true)
    private String inches;

    @Column(name = "FITTED", nullable = true, unique = true)
    private String fitted;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInches() {
        return inches;
    }

    public void setInches(String inches) {
        this.inches = inches;
    }

    public String getFitted() {
        return fitted;
    }

    public void setFitted(String fitted) {
        this.fitted = fitted;
    }
}
