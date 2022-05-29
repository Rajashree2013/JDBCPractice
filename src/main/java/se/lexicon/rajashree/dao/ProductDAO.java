package se.lexicon.rajashree.dao;

import se.lexicon.rajashree.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDAO {

     Product save(Product product);
     Optional<Product> findbyid(int id);
     List<Product>findAll();
     List<Product> findByName(String name);
     List<Product> findByPriceBetween( int low, int high);
     void deleat(int id);


}