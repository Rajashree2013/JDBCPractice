package se.lexicon.rajashree.impl;

import se.lexicon.rajashree.dao.ProductDAO;
import se.lexicon.rajashree.db.MySQLConnection;
import se.lexicon.rajashree.model.Product;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class ProductDAOImpl implements ProductDAO {

    MySQLConnection mySQLConnection = new MySQLConnection();
    Connection connection = null;
    Statement statement = null;


    @Override
    public Product save(Product product) {

        try {
            System.out.println("Product : "+product.getId() +" "+product.getName()+" "+product.getPrice());
            connection = mySQLConnection.getConnection();
            String insertProductRow = "INSERT INTO Product (name, price) VALUES (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertProductRow);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            int k = preparedStatement.executeUpdate();


            // todo: return the generated key and then set it to product id
        } catch (SQLException e) {
            e.fillInStackTrace();
        }
        // todo: close the connection and prepared statement

        return null;
    }

    @Override
    public Optional<Product> findbyid(int id) {


        try {
            String selectQuery = "select * from product where id = " + id;
            connection = mySQLConnection.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("price"));

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        try {
            String selectQuery = "select id, name, price from product";

            connection = mySQLConnection.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("price"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Product> findByName(String name) {

        try {
            String query = "select * from product where name like ?";
            Connection connection = MySQLConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("price"));
                System.out.println(resultSet.getInt("id"));
            }
        } catch (SQLException exceptionReferenceName) {
            exceptionReferenceName.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Product> findByPriceBetween(int low, int high) {
        String query = "SELECT * FROM product WHERE price BETWEEN low AND high";
        try {
            Connection connection = MySQLConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, String.valueOf(low));
            preparedStatement.setString(2, String.valueOf(high));
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("price"));

            }
        } catch (SQLException exceptionReferenceName) {
            exceptionReferenceName.printStackTrace();

        }

        return null;
    }

    @Override
    public void deleat(int id) {

        Connection connection = MySQLConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from product where id = ?");
            preparedStatement.setInt(1, id);
            int result = preparedStatement.executeUpdate();
            System.out.println("result = " + result);
        } catch (SQLException e) {
            e.printStackTrace();


        }
    }
}