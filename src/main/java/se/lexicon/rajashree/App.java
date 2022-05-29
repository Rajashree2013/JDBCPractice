package se.lexicon.rajashree;

import se.lexicon.rajashree.impl.ProductDAOImpl;
import se.lexicon.rajashree.model.Product;

public class App {

    public static void main(String args[]){
        Product product = new Product(003,"ITME3",4000.0);
        ProductDAOImpl productDAOImpl = new ProductDAOImpl();
        //productDAOImpl.save(product);
        //productDAOImpl.findbyid(001);
         //productDAOImpl.findAll();
         //productDAOImpl.findByName("item1");
        //productDAOImpl.findByPriceBetween(3000,5000);
        productDAOImpl.deleat(002);

    }
}
