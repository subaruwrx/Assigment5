package ac.za.factory_Test;

import ac.za.domain.Address;
import ac.za.factory.Address_Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 2016-04-15.
 */
public class Address_Test {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateAddress() throws Exception {

        Map<String,String> values = new HashMap<String,String>();

        values.put("city","cape town");
        values.put("country", "South Africa");
        values.put("street","24 tienkers road");


        Address adress = Address_Factory
                .createAddress(values);

        Assert.assertEquals("cape town",adress.getCity() );
        Assert.assertEquals("South Africa",adress.getCountry());
        Assert.assertEquals("24 tienkers road",adress.getStreet());
    }
    @Test
    public void testUpdateAddress() throws Exception {


        Map<String,String> values = new HashMap<String,String>();

        values.put("city","cape town");
        values.put("country", "South Africa");
        values.put("street","24 tienkers road");


        Address adress = Address_Factory
                .createAddress(values);

       Address address1= new Address
                .Builder("joburg")
                .country("South africa")
                .Street("14 caledon street")
                .copy(adress)
                .build();
        Assert.assertEquals("joburg", address1.getCity());
        Assert.assertEquals("South Africa",address1.getCountry());
        Assert.assertEquals("14 caledon street",address1.getStreet());

    }


}
