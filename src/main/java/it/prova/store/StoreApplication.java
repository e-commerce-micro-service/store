package it.prova.store;

import it.prova.store.dto.ProductDTO;
import it.prova.store.mapper.ProductMapper;
import it.prova.store.model.Product;
import it.prova.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;

	@Autowired
	private ProductMapper productMapper;



	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Product ferro= new Product("asdasd",342d);

		ProductDTO ferroDTO =productMapper.toDto(ferro);

		System.out.println(ferroDTO);



	}
}
