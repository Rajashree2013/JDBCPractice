package se.lexicon.rajashree.dao;

import se.lexicon.rajashree.model.ShoppingCart;


import java.util.List;
import java.util.Optional;

public interface ShoppingCartDAO {
   ShoppingCart save(ShoppingCart cart);
  Optional<ShoppingCart>findbyid(int id);
  List<ShoppingCart> findAll();
  List<ShoppingCart> findByorderStatus(String status);
  List<ShoppingCart> findByReference( String customer);
  void deleat(int id);
}
