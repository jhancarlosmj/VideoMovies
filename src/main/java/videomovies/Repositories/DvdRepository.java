package videomovies.Repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import videomovies.Model.Dvd;

/**
 * Created by DAM on 4/5/15.
 */
@RepositoryRestResource
public interface DvdRepository extends PagingAndSortingRepository<Dvd,Long> {
}
