package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

class ProductServiceTest {


    private ProductService service;
    @Mock
    private MerchService merchService;

    @BeforeEach
    public void init() {
        merchService = Mockito.mock(MerchService.class); // по умолчанию false
        service = new ProductService();
        service.setMerchService(merchService);
        service.save(new Product("milk", 10, "Muller Milk"));
        service.save(new Product("bread", 21, "Schtirlitz Bread"));
        service.save(new Product("sugar", 15, "Schellenberg Sugar"));
    }


    @Test
    public void checkIfProductsConteinsSupplyerInfo() { // getAll()

        List<Product> products = service.getAll();
        for (Product product : products
        ) {
            Assertions.assertNotNull(product.getSupplier());
        }
    }

    @Test
    public void checkIfProductSupplyerIsNull() {
        Mockito.when(merchService.withoutSupplierInfo()).thenReturn(true);
        List<Product> products = service.getAll();
        for (Product product : products
        ) {
            Assertions.assertNull(product.getSupplier());

        }
    }



}



