package se.lexicon.rajashree.impl;

import se.lexicon.rajashree.dao.ShoppingCartItemDAO;
import se.lexicon.rajashree.model.Product;
import se.lexicon.rajashree.model.ShoppingCartItem;

import java.util.List;
import java.util.Optional;

public class ShoppingCartItemDAOImpl implements ShoppingCartItemDAO {
    @Override
    public ShoppingCartItem save(ShoppingCartItem cart) {
        return null;
    }

    @Override
    public Optional<ShoppingCartItem> findbyid(int id) {
        return Optional.empty();
    }

    @Override
    public List<ShoppingCartItem> findbyall() {
        return null;
    }

    @Override
    public List<ShoppingCartItem> findByCartid(String cartid) {
        return null;
    }

    @Override
    public Product findByproductid(Product productid) {
        return null;
    }

    @Override
    public List<ShoppingCartItem> fillALL() {
        return null;
    }

    @Override
    public void deleat(int id) {

    }
}
