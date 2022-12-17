package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CD {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String title;
    private String description;
    private String year;
    private String artist;
    private int price;

//    @OneToMany()
//    private Set<artist> artist = new HashSet<artist>();
//
//    @ManyToMany()
//    private Set<artist> artists = new HashSet<artist>();

    public CD(Long id) {
        this.id = id;
    }
}
