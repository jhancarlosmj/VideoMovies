package videomovies.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

    @Column
    @NotNull
    private Long serialNumber;

    @Column
    @NotNull
    private String title;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private DvdType dvdType;

    @ManyToOne
    private Movie movie;

    public Dvd() {
    }

    public Dvd(Long id, String title, DvdType dvdType, Movie movie) {
        this.id = id;
        this.title = title;
        this.dvdType = dvdType;
        this.movie = movie;
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

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public DvdType getDvdType() {
        return dvdType;
    }

    public void setDvdType(DvdType dvdType) {
        this.dvdType = dvdType;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dvdType=" + dvdType +
                '}';
    }
}
