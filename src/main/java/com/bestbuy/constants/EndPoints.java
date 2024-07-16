package com.bestbuy.constants;

public class EndPoints {
    //products endpoints
    public static final String GET_ALL_PRODUCT ="/products";
    public static final String CREATE_PRODUCT ="/products";
    public static final String GET_PRODUCT_BY_ID ="/products/{productID}";
    public static final String UPDATE_PRODUCT_BY_ID ="/products/{productID}";
    public static final String DELETE_PRODUCT_BY_ID ="/products/{productID}";

    //stores endpoints
    public static final String GET_ALL_Stores = "/stores";
    public static final String CREATE_Store = "/stores";
    public static final String GET_SINGLE_Store_BY_ID = "/{storeID}";
    public static final String UPDATE_Store_BY_ID = "/{storeID}";
    public static final String DELETE_Store_BY_ID = "/{storeID}";
}
