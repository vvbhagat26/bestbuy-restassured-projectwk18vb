package com.bestbuy.model;

public class ProductPojo {
    // fn+alt+insert key to get "getter and setter" and Ctrl+a "select all"

    private String name;
    private String type;
    private double price;
    private String upc;
    private double shipping;
    private String description;
    private String manufacturer;
    private String model;
    private String url;
    private String image;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
}
    public static ProductPojo getProductPojo(String name,String description,String type,double shipping,String image,double price,
                                             String manufacturer,String model,String upc,String url){
        ProductPojo productPojo = new ProductPojo();
        productPojo.setName(name);
        productPojo.setDescription(description);
        productPojo.setType(type);
        productPojo.setShipping(shipping);
        productPojo.setImage(image);
        productPojo.setPrice(price);
        productPojo.setManufacturer(manufacturer);
        productPojo.setModel(model);
        productPojo.setUpc(upc);
        productPojo.setUrl(url);
        return productPojo;
    }

    /**public static ProductPojo getProductPojoForPatchMethod(Double price) {
    ProductPojo productPojo = new ProductPojo();
    productPojo.setPrice(price);
    return productPojo;
    }*/

}
