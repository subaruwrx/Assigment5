package ac.za.factoryTest;

import ac.za.domain.OrderStatus;
import ac.za.factory.OrderStatusFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 2016-05-02.
 */
public class OrderStatusFactoryTest {

    @Test
    public void testCreateOrder() throws Exception {


        Map<String ,String> values= new HashMap<String ,String>();


        values.put("name","Nike Sneakers");
        values.put("description","By Mikel Jordan");



        OrderStatus status = OrderStatusFactory
                .createOrderStatus(values);

         Assert.assertEquals("Nike Sneakers",status.getName());
         Assert.assertEquals("By Mikel Jordan",status.getDescription());



    }
}
