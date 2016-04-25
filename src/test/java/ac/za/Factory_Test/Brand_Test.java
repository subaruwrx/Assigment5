package ac.za.factory_Test;

import ac.za.domain.Brand;
import ac.za.factory.Brand_Factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 2016-04-15.
 */
public class Brand_Test {

    public Long id= 100000L;
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateBrand() throws Exception {

        Map<String,String> values = new HashMap<String,String>();


        values.put("Brandcode", "Nik099");
        values.put("BrandName","Nike");


        Brand brand = Brand_Factory
                .createBrand(id,values);

        Assert.assertEquals(id,brand.getId() );
        Assert.assertEquals("Nik099",brand.getBrandCode());
        Assert.assertEquals("Nike",brand.getBrandName());
    }

    @Test
    public void testUpdateBrand() throws Exception {

        Long id1=200000L;

        Map<String,String> values = new HashMap<String,String>();

        values.put("BrandName","Nike");
        values.put("Brandcode", "Nik099");



        Brand brand = Brand_Factory
                .createBrand(id,values);

        Brand brand1= new Brand
                .Builder(id1)
                .brandName("Addidas")
                .brandCode("Addida092")
                .copy(brand)
                .build();

       // Assert.assertEquals(id1,brand1.getId());
        //Assert.assertEquals("Addidas",brand1.getBrandName());
        Assert.assertEquals("Addida092",brand1.getBrandCode());

    }

}
