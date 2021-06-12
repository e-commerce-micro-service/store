package it.prova.store.dto;

import it.prova.store.model.ProductStore;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {

    private Long id;
    private String description;
    private Double price;
    private List<ProductStore> stores = new ArrayList<>();

    public ProductDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<ProductStore> getStores() {
        return stores;
    }

    public void setStores(List<ProductStore> stores) {
        this.stores = stores;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stores=" + stores +
                '}';
    }
}
