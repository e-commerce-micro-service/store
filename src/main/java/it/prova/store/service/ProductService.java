package it.prova.store.service;

import it.prova.store.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllElements();

    Product caricaSingoloElemento(Long id);

    Product aggiorna(Product productInstance);

    Product inserisciNuovo(Product productInstance);

    void rimuovi(Product productInstance);

    List<Product> findByExample(Product example);
}
