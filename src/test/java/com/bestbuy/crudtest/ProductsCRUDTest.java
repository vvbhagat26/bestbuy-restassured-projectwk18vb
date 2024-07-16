package com.bestbuy.crudtest;

import com.bestbuy.bestbuyinfo.ProductSteps;
import com.bestbuy.testbase.TestBase;
import com.bestbuy.utils.TestUtils;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;

import static org.hamcrest.Matchers.hasValue;

@RunWith(SerenityRunner.class)
public class ProductsCRUDTest extends TestBase {

    static String name = "Panasonic - AA Batteries" + TestUtils.getRandomValue();
    static String type = "HardGoods" + TestUtils.getRandomValue();
    static String manufacturer = "Panasonic";
    static String model = "PN0123B4Z";
    static String upc = "987456321";
    static String description = "50% Extra long life";
    static String url = "http://www.bestbuy.com";
    static String image = "http://img.bbystatic.com/BestBuy_US/images/products/4390/43900_sa.jpg";
    static double price = 4.99;
    static double shipping = 3.49;
    static int id;

    @Steps
    ProductSteps productSteps;
    @Title("Create a product")
    @Test
    public void testNo01(){
       ValidatableResponse response=productSteps.createProduct(name,description,type,shipping,image,price,manufacturer,model,upc,url);
       response.statusCode(201);
       id=response.extract().path("id");
    }

    @Steps
    ProductSteps productGetSteps;
    @Title("Get a product")
    @Test
    public void testNo02(){

       HashMap<String,Object> getProductById = productSteps.getProductInfoById(id);
        Assert.assertThat(getProductById, hasValue(name));
    }

    @Steps
    ProductSteps productUpdateSteps;
    @Title("Update a product")
    @Test
    public void testNo03(){

        ValidatableResponse response=productSteps.updateProduct(id,name,description,type,shipping,image,price,manufacturer,model,upc,url);
        response.statusCode(200);

    }

    @Test
    public void testNo04() {
        ValidatableResponse response = productSteps.deleteProduct(id);
        response.statusCode(200);
}

}
