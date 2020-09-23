package registrar.RegaliaOrderingSystem.Models;

import javax.persistence.*;

@Entity
@Table(name = "CAPSIZE")
public class CapSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAP_SIZE_ID")
    private long id;

    @Column(name = "SIZE", nullable = true, unique = true)
    private String size;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
