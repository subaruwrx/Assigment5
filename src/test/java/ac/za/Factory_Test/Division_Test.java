package ac.za.factory_Test;

import ac.za.domain.Address;
import ac.za.domain.Division;
import ac.za.factory.Address_Factory;
import ac.za.factory.Division_Factory;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Admin on 2016-04-20.
 */
public class Division_Test {


    @Test
    public void testCreateBrand() throws Exception {


        Map<String,String> values = new HashMap<String,String>();
        Map<String,String> values1= new HashMap<String,String>();

        //Address

        values1.put("wareHouse","cape town");
        values1.put("productType", "South Africa");
        values1.put("street","24 tienkers road");


        Address address = Address_Factory
                .createAddress(values1);


        //Division

        values.put("wareHouse","WoolWorths1");
        values.put("productType", "Shoes");

        Division division = Division_Factory
                .createDivision(address,values);

        //Assert.assertEquals("WoolWorths1",division.getWarehouse() );
        Assert.assertEquals("Shoes",division.getProductType());

    }
    @Test
    public void testUpdateBrand() throws Exception {
        final String name="Levis House1";
        final String type="Jeans";
        Map<String,String> values = new HashMap<String,String>();
        Map<String,String> values1= new HashMap<String, String>();

        //Address

        values1.put("wareHouse","cape town");
        values1.put("productType", "South Africa");
        values1.put("street","24 tienkers road");


        Address address = Address_Factory
                .createAddress(values1);


        //Division

        values.put("wareHouse","WoolWorths1");
        values.put("productType", "Shoes");

        Division division = Division_Factory
                .createDivision(address,values);

        Division division1= new Division
                .Builder()
                .copy(division)
                .wareHouse(name)
                .producttypewhareH(type)
                .build();



        Assert.assertEquals(name,division1.getWarehouse());
        Assert.assertEquals(type,division1.getProductType());

    }
}
