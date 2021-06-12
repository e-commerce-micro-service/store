package it.prova.store.mapper;

import it.prova.store.dto.ProductDTO;
import it.prova.store.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring"
)
public interface ProductMapper {


    ProductDTO toDto(Product product);
}
