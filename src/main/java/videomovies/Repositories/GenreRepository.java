package videomovies.Repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import videomovies.Model.Genre;

/**
 * Created by DAM on 4/5/15.
 */
@RepositoryRestResource
public interface GenreRepository extends PagingAndSortingRepository<Genre,Long> {
}
