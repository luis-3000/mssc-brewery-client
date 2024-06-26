package luis3000.msscbreweryclient.services;

import lombok.RequiredArgsConstructor;
import luis3000.msscbreweryclient.repositories.BeerRepository;
import luis3000.msscbreweryclient.web.controller.NotFoundException;
import luis3000.msscbreweryclient.web.domain.Beer;
import luis3000.msscbreweryclient.web.mappers.BeerMapper;
import luis3000.msscbreweryclient.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/*
 * Created by jlc 6/25/24.
 */
@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getById(UUID beerId) {
        return beerMapper.beerToBeerDto(beerRepository.fingById(beerId).orElseThrow(NotFoundException::new));
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtoToBeer(beerDto)));
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {

        Beer beer = beerRepository.fingById(beerId).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle((beerDto.getBeerStyleEnum().name()));
        beer.setPrice(beerDto.getPrice());
        beer.setUpc(beerDto.getUpc());

        return beerMapper.beerToBeerDto(beerRepository.save(beer));
    }
}
