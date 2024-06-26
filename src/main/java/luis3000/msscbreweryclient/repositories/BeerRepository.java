package luis3000.msscbreweryclient.repositories;
import luis3000.msscbreweryclient.web.domain.Beer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by jlc on 6/25/2024.
 */
@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

    Optional<Beer> fingById(UUID beerId);
}