package com.springDemo.sample.service;

import com.springDemo.sample.Repository.ProductRepository;
import com.springDemo.sample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "iphone", 5000),
//            new Product(102, "samsung", 4000),
//            new Product(103, "mi", 2000)
//    ));

    public List<Product> getProducts() {
//        return products;

        return productRepo.findAll();
    }

    public Product getproductById(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst().orElse(new Product(100, "No itm found", 000));

        return productRepo.findById(prodId).orElse(new Product());
    }

    public void createProducts(Product product) {
//        products.add(product);

        productRepo.save(product);
    }

    public void updateProduct(Product product) {
//        int index = 0;
//        for (int i=0; i< products.size(); i++) {
//            if(products.get(i).getProdId() == product.getProdId()) {
//                index = i;
//            }
//        }
//        products.add(index, product);

        productRepo.save(product);
    }

    public void deleteProduct(int ProdId) {
//        int index = 0;
//        for (int i=0; i< products.size(); i++) {
//            if(products.get(i).getProdId() == ProdId) {
//                index = i;
//            }
//        }
//        products.remove(index);

        productRepo.deleteById(ProdId);
    }
}
