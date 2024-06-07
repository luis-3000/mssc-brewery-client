package luis3000.msscbreweryclient.web.controller;

import luis3000.msscbreweryclient.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/*
 * Created by Jose Castillo 6/06/24.
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeetById(@PathVariable("beerId") UUID beerId) {

        // @Todo: Do the implementation, for now, we're just stubbing things out...
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody @Validated BeerDto beerDto) {

        // @Todo: provide implementation
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody @Validated BeerDto beerDto) {

        // @Todo: provide implementation in a future task
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
