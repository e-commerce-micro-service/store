package it.prova.store.service;

import it.prova.store.model.Store;

import java.util.List;

public interface StoreService {

    List<Store> listAllElements();

    Store caricaSingoloElemento(Long id);

    Store aggiorna(Store storeInstance);

    Store inserisciNuovo(Store storeInstance);

    void rimuovi(Store storeInstance);

    List<Store> findByExample(Store example);
}
