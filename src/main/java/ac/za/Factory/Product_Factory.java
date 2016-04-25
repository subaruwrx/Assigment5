package ac.za.factory;

import ac.za.domain.Product;

import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class Product_Factory {

    private static  Product_Factory instance=null;

    private Product_Factory(){}

    public static Product_Factory getInstance() {
        if (instance == null) {
            instance = new Product_Factory();

        }
        return instance;
    }

    public static Product createProduct(Long id, Map<String,String> values) {

        Product product = new Product
                .Builder(id)
                .productMethod(values.get("productsize"))
                .productName(values.get("productName"))
                .productQuantity(values.get("productQuantity"))
                .productType(values.get("productType"))

                .build();
        return product;

    }
}
