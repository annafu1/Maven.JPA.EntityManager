package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CD {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany()
    private Set<artist> artist = new HashSet<artist>();

    @ManyToMany()
    private Set<artist> artists = new HashSet<artist>();

    public CD(Long id) {
        this.id = id;
    }
}
