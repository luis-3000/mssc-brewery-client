package luis3000.msscbreweryclient.web.mappers;

import luis3000.msscbreweryclient.web.domain.Beer;
import luis3000.msscbreweryclient.web.model.BeerDto;
import org.mapstruct.Mapper;
/**
 * Created by jlc on 6/26/2024
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
