package ac.za.factory;

import ac.za.domain.Brand;

import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class Brand_Factory {

    private static  Brand_Factory instance=null;

    private  Brand_Factory(){}

    public static  Brand_Factory getInstance() {
        if (instance == null) {
            instance = new  Brand_Factory();

        }
        return instance;
    }

    public static Brand createBrand(Long id, Map<String,String>values) {

        Brand brand = new Brand
                .Builder(id)
                .brandCode(values.get("Brandcode"))
                .brandName(values.get("BrandName"))
                .build();
        return brand;

    }
}
