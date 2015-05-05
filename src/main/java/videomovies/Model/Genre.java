package videomovies.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by DAM on 5/5/15.
 */
@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "genre_id")
    private Long id;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private Type name;

    @ManyToMany(mappedBy = "genres")
    private Set<Movie> movies = new HashSet<>();

    public Genre() {
    }

    public Genre(Type name, Set<Movie> movies) {
        this.name = name;
        this.movies = movies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getName() {
        return name;
    }

    public void setName(Type name) {
        this.name = name;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name=" + name +
                ", movies=" + movies +
                '}';
    }
}
