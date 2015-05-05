package videomovies.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by DAM on 4/5/15.
 */

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private Long id;
    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String director;

    @Column
    @NotNull
    private int year;

    @Column
    @NotNull
    private String country;

    @JsonManagedReference
    @ManyToMany
    private Set<Actor> actors;

    @OneToMany
    private Set<Genre> genres;

    @OneToMany(mappedBy = "movie")
    private Set<Dvd> dvds = new HashSet<>();

    public Movie() {
    }

    public Movie(Long id, String name, String director, int year, String country, Set<Actor> actors, Set<Genre> genres) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.year = year;
        this.country = country;
        this.actors = actors;
        this.genres = genres;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
