package se.lexicon.rajashree;

import se.lexicon.rajashree.impl.ProductDAOImpl;
import se.lexicon.rajashree.impl.ShoppingCartDAOImpl;
import se.lexicon.rajashree.model.Product;
import se.lexicon.rajashree.model.ShoppingCart;

import java.time.LocalDateTime;

public class App {

    public static void main(String args[]){
        //Product product = new Product("ITME8",800.0);
        //ProductDAOImpl productDAOImpl = new ProductDAOImpl();
        //productDAOImpl.save(product);
        //productDAOImpl.findbyid(001);
         //productDAOImpl.findAll();
         //productDAOImpl.findByName("item1");
        //productDAOImpl.findByPriceBetween(3000,5000);
      // productDAOImpl.deleat(002);

        LocalDateTime now = LocalDateTime.now();

        ShoppingCart cart = new ShoppingCart(now,"Ordered","HEL","RA");
        ShoppingCartDAOImpl shoppingCartDAOImpl = new ShoppingCartDAOImpl();
        shoppingCartDAOImpl.save(cart);




    }
}
