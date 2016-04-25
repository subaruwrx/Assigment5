package ac.za.factory;

import ac.za.domain.LineItem;
import ac.za.domain.Order;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class Order_Factory {

    private static Order_Factory instance=null;

    private Order_Factory(){}

    public static Order_Factory getInstance() {
        if (instance == null) {
            instance = new Order_Factory();

        }
        return instance;
    }

    public static Order createOrder(int number, Map<String,String> values,Date date, List<LineItem> lineItems) {

        Order order = new Order
                .Builder(number)
                .orderDate(date)
                .supplierName(values.get("SupplierName"))
                .deliveryDate(date)
                .lineItems(lineItems)
                .supplierId(number)
                .orderDate(date)
                .build();
        return order;

    }
}
