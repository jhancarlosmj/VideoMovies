package videomovies.Model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by DAM on 4/5/15.
 */
@Entity
@Table(name = "dvds")
public class Dvd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dvd_id")
    private Long id;

    private String title;
    private DvdType dvdType;
    private Set<Movie> content;

    public Dvd() {
    }

    public Dvd(Long id, String title, DvdType dvdType, Set<Movie> content) {
        this.id = id;
        this.title = title;
        this.dvdType = dvdType;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public DvdType getDvdType() {
        return dvdType;
    }

    public void setDvdType(DvdType dvdType) {
        this.dvdType = dvdType;
    }

    public Set<Movie> getContent() {
        return content;
    }

    public void setContent(Set<Movie> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dvdType=" + dvdType +
                ", content=" + content +
                '}';
    }
}
