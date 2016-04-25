package ac.za.factory;

import ac.za.domain.Shopping_Cart;

import java.util.Date;

/**
 * Created by Admin on 2016-04-14.
 */
public class Shopping_Cart_Factory {

    private static Shopping_Cart_Factory instance=null;

    private Shopping_Cart_Factory(){}

    public static Shopping_Cart_Factory getInstance() {
        if (instance == null) {
            instance = new Shopping_Cart_Factory();

        }
        return instance;
    }

    public static Shopping_Cart createShopping_Cart( Date created) {

        Shopping_Cart cart= new Shopping_Cart
                .Builder()
                .dateCreated(created)
                .build();
        return cart;

    }
}
