package it.prova.store.repository;

import it.prova.store.model.Store;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<Store,Long> {
}
