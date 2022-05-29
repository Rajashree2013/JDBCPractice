package se.lexicon.rajashree.dao;

import se.lexicon.rajashree.model.Product;
import se.lexicon.rajashree.model.ShoppingCart;
import se.lexicon.rajashree.model.ShoppingCartItem;


import java.util.List;
import java.util.Optional;

public interface ShoppingCartItemDAO {

    ShoppingCartItem save(ShoppingCartItem cart);
    Optional<ShoppingCartItem>findbyid(int id);
    List<ShoppingCartItem> findbyall();
    List<ShoppingCartItem>findByCartid(String cartid);
    Product findByproductid(Product productid);
    List<ShoppingCartItem> fillALL();
    void deleat(int id);





}

