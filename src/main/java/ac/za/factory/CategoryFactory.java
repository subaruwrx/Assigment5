package ac.za.factory;

import ac.za.domain.Category;

import java.util.Map;

/**
 * Created by Admin on 2016-05-03.
 */
public class CategoryFactory {
    private static  CategoryFactory instance=null;

    private CategoryFactory(){}

    public static CategoryFactory getInstance() {
        if (instance == null) {
            instance = new CategoryFactory();

        }
        return instance;
    }

    public static Category createCategory(Map<String,String> value){
        return new Category.Builder()
                .name(value.get("name"))
                .description(value.get("description"))
                .build();


    }
}
