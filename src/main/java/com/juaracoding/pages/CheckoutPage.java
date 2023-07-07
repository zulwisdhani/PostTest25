package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CheckoutPage {

    private WebDriver driver;
    public CheckoutPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@class='cart-name-and-total']")
    WebElement viewCartBtn;

    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward wp-element-button']")
    WebElement checkoutBtn;

    @FindBy(id = "billing_first_name")
    WebElement firstName;

    @FindBy(id = "billing_last_name")
    WebElement lastName;

    @FindBy(id = "billing_country")
    WebElement countrySelect;

    @FindBy(id = "billing_address_1")
    WebElement streetAddress;

    @FindBy(id = "billing_city")
    WebElement cityTown;

//    @FindBy(id = "billing_state")
//    WebElement province;

    @FindBy(xpath = "//span[@id='select2-billing_state-container']")
    WebElement province;

    @FindBy(xpath = "//input[@role='combobox']")
    WebElement selectprovince;

    @FindBy(id = "billing_postcode")
    WebElement postcode;

    @FindBy(id = "billing_phone")
    WebElement phoneNumber;

    @FindBy(id = "billing_email")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"terms\"]")
    WebElement checkBox;

    @FindBy(id = "place_order")
    WebElement btnOrder;

    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/div/p[1]")
    WebElement validCheckout;

    public void viewCart(){
        viewCartBtn.click();
    }

    public void checkout(){
        checkoutBtn.click();
    }

    public void firstName(String fName){
        firstName.clear();
        firstName.sendKeys(fName);
    }

    public void lastName(String lName){
        lastName.clear();
        lastName.sendKeys(lName);
    }

    public void selectCountry(String country){
        Select select = new Select(countrySelect);
        select.selectByValue(country);
    }

    public void addressStreet(String address){
        streetAddress.clear();
        streetAddress.sendKeys(address);
    }

    public void townCity(String city){
        cityTown.clear();
        cityTown.sendKeys(city);
    }

    public void getProvince(String selectProvince){
        province.click();
        this.selectprovince.sendKeys(selectProvince + Keys.ENTER);
    }

    public void postCode(String zip){
        postcode.clear();
        postcode.sendKeys(zip);
    }

    public void numberPhone(String phone){
        phoneNumber.clear();
        phoneNumber.sendKeys(phone);
    }

    public void mailAddress(String mail){
        email.clear();
        email.sendKeys(mail);
    }

    public void checkBoxTerms(){
        checkBox.click();
    }

    public void orderBtn(){
        btnOrder.click();
    }

    public String validCheck(){
        return validCheckout.getText();
    }
}

