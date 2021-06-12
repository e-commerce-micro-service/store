package it.prova.store.service;

import it.prova.store.model.Store;
import it.prova.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public List<Store> listAllElements() {
        return (List<Store>) storeRepository.findAll();
    }

    @Override
    public Store caricaSingoloElemento(Long id) {
        return storeRepository.findById(id).orElse(null);
    }

    @Override
    public Store aggiorna(Store storeInstance) {
        return storeRepository.save(storeInstance);
    }

    @Override
    public Store inserisciNuovo(Store storeInstance) {
        return storeRepository.save(storeInstance);
    }

    @Override
    public void rimuovi(Store storeInstance) {
        storeRepository.delete(storeInstance);

    }

    @Override
    public List<Store> findByExample(Store example) {
        return null;
    }
}
