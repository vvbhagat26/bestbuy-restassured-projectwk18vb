package com.bestbuy.bestbuyinfo;

import com.bestbuy.constants.EndPoints;
import com.bestbuy.model.ProductPojo;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import java.util.HashMap;

public class ProductSteps {
    //1.create a product
    @Step("Creating a new product")
    public ValidatableResponse createProduct(String name, String description, String type, double shipping, String image, double price,
                                             String manufacturer, String model, String upc, String url) {
        ProductPojo productPojo = ProductPojo.getProductPojo(name, description, type, shipping, image, price, manufacturer, model, upc, url);
        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .when()
                .body(productPojo)
                .post(EndPoints.CREATE_PRODUCT).then();
    }

    //2.Get list of a particular(newly generated id-product)
    @Step("Verifying product is added with productID")
    public HashMap<String, Object> getProductInfoById(int id) {

        return SerenityRest.given()
                .when()
                .pathParam("productID", id)
                .get(EndPoints.GET_PRODUCT_BY_ID)
                .then()
                .statusCode(200)
                .extract().path("");
    }

    //3.Update
    @Step("Updating a newly created product")
    public ValidatableResponse updateProduct(int id, String name, String description, String type, double shipping, String image, double price,
                                             String manufacturer, String model, String upc, String url) {
        ProductPojo productPojo = ProductPojo.getProductPojo(name, description, type, shipping, image, price, manufacturer, model, upc, url);
        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .pathParam("productID", id)
                .when()
                .body(productPojo)
                .put(EndPoints.UPDATE_PRODUCT_BY_ID).then();
    }

    //4.1.Delete
    @Step("Delete created record with product id")
    public ValidatableResponse deleteProduct(int id) {

        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .pathParam("productID", id)
                .when()
                .delete(EndPoints.DELETE_PRODUCT_BY_ID).then();
    }

    //4.2.confirming that the deleted product is not in the list anymore.
    @Step("Getting Product information with productID")
    public ValidatableResponse getProductById(int id) {

        return SerenityRest.given()
                .pathParam("productID", id)
                .when()
                .get(EndPoints.GET_PRODUCT_BY_ID).then();

    }
}
















