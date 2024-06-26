package luis3000.msscbreweryclient.services;

import luis3000.msscbreweryclient.web.model.BeerDto;

import java.util.UUID;

/*
 * Created by Jose Castillo 6/25/24.
 */
public interface BeerService  {

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
