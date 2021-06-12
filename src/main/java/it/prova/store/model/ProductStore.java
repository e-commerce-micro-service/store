package it.prova.store.model;

import javax.persistence.*;

@Entity(name = "ProductStore")
@Table(name = "product_store")
public class ProductStore {

    @EmbeddedId
    private ProductStoreId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("storeId")
    private Store store;

    @Column(name = "quantity")
    private Long quantity;
}
