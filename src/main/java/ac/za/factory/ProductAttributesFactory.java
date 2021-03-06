package ac.za.factory;

import ac.za.domain.ProductAttribute;

import java.util.Map;

/**
 * Created by Admin on 2016-05-03.
 */
public class ProductAttributesFactory {
    private static ProductAttributesFactory instance=null;

    private ProductAttributesFactory(){}

    public static ProductAttributesFactory getInstance() {
        if (instance == null) {
            instance = new ProductAttributesFactory();

        }
        return instance;
    }



    public static ProductAttribute createProductAttributes(Map<String,Long> values) {
        ProductAttribute attributes = new ProductAttribute
                .Builder()
                .attributeId(values.get("attributeId"))
                .productId(values.get("productId"))
                .build();
        return attributes;

    }
}
