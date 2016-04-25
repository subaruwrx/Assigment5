package ac.za.factory_Test;

import ac.za.domain.Transport;
import ac.za.factory.Transport_Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 2016-04-15.
 */
public class Transport_Test {


    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateTransport() throws Exception {

        Map<String,String> values = new HashMap<String,String>();

        values.put("id","BUS001199");
        values.put("available", "yes");
        values.put("location","cape town");
        values.put("root ot travel","joburg via Bloemfontein");
        values.put("transportType","Bus");

       Transport transport = Transport_Factory
                .createTransport(values);

        Assert.assertEquals("BUS001199",transport.getId() );
        Assert.assertEquals("yes",transport.getAvailable());
        Assert.assertEquals("cape town",transport.getLocation());
    }
    @Test
    public void testUpdateTransport() throws Exception {


        Map<String,String> values = new HashMap<String,String>();

        values.put("id","BUS001199");
        values.put("available", "yes");
        values.put("location","cape town");
        values.put("root ot travel","joburg via Bloemfontein");
        values.put("transportType","Bus");

        Transport transport = Transport_Factory
                .createTransport(values);

        Transport transport1= new Transport
                .Builder("BUS001199")
                .availableMethod("yes")
                .rootMethod("joburg via Bloemfontein")
                .locationMethod("Cape town")
                .transportType("Bus")
                .copy(transport)
                .build();
        Assert.assertEquals("BUS001199", transport1.getId());
        Assert.assertEquals("yes",transport1.getAvailable());
        Assert.assertEquals("joburg via Bloemfontein",transport1.getRoot());
        Assert.assertEquals("cape town",transport1.getLocation());

    }



}
