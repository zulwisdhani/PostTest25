package com.juaracoding.utils;

public enum TestScenarios {
    T1("Login Valid Functionality Test"),
    T2("Login Invalid Functionality Test"),
    T3("Add Product 1 to cart"),
    T4("Add Product 2 to cart"),
    T5("Checkout product from cart");
    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
