package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
    private WebDriver driver;
    public CartPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='custom-logo-link']//img[@alt='ToolsQA Demo Site']")
    WebElement demosite;

    @FindBy(xpath = "//a[normalize-space()='Black Cross Back Maxi Dress']")
    WebElement product1;

    @FindBy(xpath = "//a[normalize-space()='red satin round neck backless maxi dress']")
    WebElement product2;

    @FindBy(id="pa_color")
    WebElement menuColor;

    @FindBy(id="pa_size")
    WebElement menuSize;

    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement menuColor1;

    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement menuSize1;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement checkoutBtn;

    public void demoSite(){
        demosite.click();
    }

    public void productOne(){
        product1.click();
    }

    public void chooseColor(String color){
        Select select = new Select(this.menuColor);
        select.selectByValue(color);
    }

    public void chooseSize(String size){
        Select select = new Select(this.menuSize);
        select.selectByValue(size);
    }

    public void productTwo(){
        product2.click();
    }

    public void chooseColor1(String color){
        Select select = new Select(menuColor1);
        select.selectByValue(color);
    }

    public void chooseSize1(String size){
        Select select = new Select(menuSize1);
        select.selectByValue(size);
    }

    public void checkoutProduct(){
        checkoutBtn.click();
    }

}
