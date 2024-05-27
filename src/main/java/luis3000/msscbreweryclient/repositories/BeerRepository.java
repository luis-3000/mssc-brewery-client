package luis3000.msscbreweryclient.repositories;
import luis3000.msscbreweryclient.web.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by jlc on 5/26/2024.
 */

public class BeerRepository extends PagingAndSortingRepository<Beer, UUID> {


}