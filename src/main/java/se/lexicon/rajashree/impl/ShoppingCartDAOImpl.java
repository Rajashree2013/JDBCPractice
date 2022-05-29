package se.lexicon.rajashree.impl;

import se.lexicon.rajashree.dao.ShoppingCartDAO;
import se.lexicon.rajashree.model.ShoppingCart;

import java.util.List;
import java.util.Optional;

public class ShoppingCartDAOImpl  implements ShoppingCartDAO {
    @Override
    public ShoppingCart save(ShoppingCart cart) {
        return null;
    }

    @Override
    public Optional<ShoppingCart> findbyid(int id) {
        return Optional.empty();
    }

    @Override
    public List<ShoppingCart> findAll() {
        return null;
    }

    @Override
    public List<ShoppingCart> findByorderStatus(String status) {
        return null;
    }

    @Override
    public List<ShoppingCart> findByReference(String customer) {
        return null;
    }

    @Override
    public void deleat(int id) {

    }
}
