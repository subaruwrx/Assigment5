package ac.za.factory_Test;

import ac.za.domain.Shopping_Cart;
import ac.za.factory.Shopping_Cart_Factory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;



/**
 * Created by Admin on 2016-04-20.
 */

public class Shopping_Cart_Test {

    Date mydate= new Date();
    @Test
    public void testCreateCart()
    {


       Shopping_Cart cart= Shopping_Cart_Factory
                .createShopping_Cart(mydate);



        Assert.assertEquals(mydate,cart.getCreated());

    }

    @Test
    public void testUpdateSale() throws Exception {
        final  Date mydat= new Date();
        Shopping_Cart cart= Shopping_Cart_Factory
                .createShopping_Cart(mydate);

        Shopping_Cart cart1= new Shopping_Cart
                .Builder()
                .copy(cart)
                .dateCreated(mydat)
                .build();

        junit.framework.Assert.assertEquals(mydat,cart1.getCreated());

    }





}
