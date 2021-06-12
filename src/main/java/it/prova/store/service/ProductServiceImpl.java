package it.prova.store.service;

import it.prova.store.model.Product;
import it.prova.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> listAllElements() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product caricaSingoloElemento(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product aggiorna(Product productInstance) {
        return productRepository.save(productInstance);
    }

    @Override
    public Product inserisciNuovo(Product productInstance) {
        return productRepository.save(productInstance);
    }

    @Override
    public void rimuovi(Product productInstance) {
        productRepository.delete(productInstance);

    }

    @Override
    public List<Product> findByExample(Product example) {
        return null;
    }
}
