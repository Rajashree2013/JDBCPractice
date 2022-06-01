package se.lexicon.rajashree.impl;

import se.lexicon.rajashree.dao.ShoppingCartDAO;
import se.lexicon.rajashree.db.MySQLConnection;
import se.lexicon.rajashree.model.ShoppingCart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class ShoppingCartDAOImpl  implements ShoppingCartDAO {


    MySQLConnection mySQLConnection = new MySQLConnection();
    Connection connection = null;
    Statement statement = null;




    @Override
    public ShoppingCart save(ShoppingCart cart) {

        try {
            System.out.println(" ShoppingCart: "+ cart.getLastUpdate()+""+ cart.getOrderStatus() +" "+cart.getDeliveryAddress()+" "+cart.getCustomerReference()+" "+cart.isPaymentApproved());
            connection = mySQLConnection.getConnection();
            String insertShopingCarttRow = "INSERT INTO shopping_cart (last_update, order_status,delivery_address,customer_reference ) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertShopingCarttRow);
            preparedStatement.setString(1,cart.getLastUpdate().toString());
            preparedStatement.setString(2, cart.getOrderStatus());
            preparedStatement.setString(3, cart.getDeliveryAddress());
            preparedStatement.setString(4, cart.getCustomerReference());
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
