package luis3000.msscbreweryclient.repositories;

import luis3000.msscbreweryclient.web.domain.Beer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;

@Service
public class BeerRepositoryImpl implements BeerRepository {

    @Override
    public Iterable<Beer> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Beer> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Beer> S save(S s) {
        return null;
    }

    @Override
    public <S extends Beer> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Beer> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public Iterable<Beer> findAll() {
        return null;
    }

    @Override
    public Iterable<Beer> findAllById(Iterable<UUID> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0; //@To do: to implement
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(Beer beer) {

    }

    @Override
    public void deleteAll(Iterable<? extends Beer> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Optional<Beer> fingById(UUID beerId) {
        return Optional.of(new Beer());
    }
}
