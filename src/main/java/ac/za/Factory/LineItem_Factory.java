package ac.za.factory;

import ac.za.domain.LineItem;

import java.util.Date;
import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class LineItem_Factory {

    private static LineItem_Factory instance=null;

    private LineItem_Factory(){}

    public static LineItem_Factory getInstance() {
        if (instance == null) {
            instance = new LineItem_Factory();

        }
        return instance;
    }

    public LineItem createLine_Item(Map<String,String> values, int id,double price,Date createDate) {
        int prodid=0;
        int quantity=0;
        LineItem item= new LineItem
                .Builder(id)
                .productID(prodid)
                .quantityMethod(quantity)
                .purchaseOrderNumberL(id)
                .price(price)
                .createDate(createDate)
                .build();
        return item;

    }
}
