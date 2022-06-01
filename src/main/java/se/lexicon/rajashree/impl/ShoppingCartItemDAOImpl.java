package se.lexicon.rajashree.impl;

import se.lexicon.rajashree.dao.ShoppingCartItemDAO;
import se.lexicon.rajashree.db.MySQLConnection;
import se.lexicon.rajashree.model.Product;
import se.lexicon.rajashree.model.ShoppingCartItem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

public class ShoppingCartItemDAOImpl implements ShoppingCartItemDAO {
    MySQLConnection mySQLConnection = new MySQLConnection();
    Connection connection = null;
    Statement statement = null;


    @Override
    public ShoppingCartItem save(ShoppingCartItem cart) {

        try {

            connection = mySQLConnection.getConnection();
            String insertshopping_cart_itemrow= "INSERT INTO shopping_cart_item(amount,total_price,product_id,shopping_cart_id ) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertshopping_cart_itemrow);
            preparedStatement.setInt(1,cart.getAmount());
            preparedStatement.setDouble(2,cart.getTotalPrice());
            preparedStatement.setInt(3,cart.getCart().getId());
            preparedStatement.setDouble(4,cart.getCart().getId());

            int k = preparedStatement.executeUpdate();

            preparedStatement.close();
            // todo: return the generated key and then set it to product id
        } catch (SQLException e) {
            e.fillInStackTrace();
        }finally {
            try{
                connection.close();
            }catch (SQLException e) {
                e.fillInStackTrace();
            }

        }


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
