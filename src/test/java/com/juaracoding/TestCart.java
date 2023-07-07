package com.juaracoding;

import com.juaracoding.pages.CartPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestCart {

    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();
    static CartPage cartPage = new CartPage();

    public TestCart(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click demo site")
    public void user_click_demo_site(){
        driver.get(Constants.URL);
        loginPage.login("sindy","$Sindy1999");
        cartPage.demoSite();
        extentTest.log(LogStatus.PASS,"User click demo site");
    }

    @And("User click product one")
    public void user_click_product_one(){
        Hooks.delay(Constants.DETIK);
        Hooks.scroll(1300);
        cartPage.productOne();
        extentTest.log(LogStatus.PASS,"User click product one");
    }

    @And("User choose product1 color")
    public void user_choose_product1_color(){
        Hooks.delay(Constants.DETIK);
        Hooks.scroll(500);
        cartPage.chooseColor("beige");
        extentTest.log(LogStatus.PASS,"User choose product1 color");
    }

    @And("User choose product1 size")
    public void user_choose_product1_size(){
        cartPage.chooseSize("large");
        extentTest.log(LogStatus.PASS,"User choose product1 size");
    }

    @Then("User click button add to cart")
    public void user_click_button_add_to_cart(){
        cartPage.checkoutProduct();
        extentTest.log(LogStatus.PASS,"User click button add to cart");
    }

    @When("User click logo to shop")
    public void user_click_logo_to_shop(){
        cartPage.demoSite();
        extentTest.log(LogStatus.PASS,"User click logo to shop");
    }

    @And("User click product two")
    public void user_click_product_two(){
        Hooks.delay(Constants.DETIK);
        Hooks.scroll(1300);
        cartPage.productTwo();
        extentTest.log(LogStatus.PASS,"User click product two");
    }

    @And("User choose product2 color")
    public void user_choose_product2_color(){
        Hooks.delay(Constants.DETIK);
        Hooks.scroll(500);
        cartPage.chooseColor1("red");
        extentTest.log(LogStatus.PASS,"User choose product2 color");
    }

    @And("User choose product2 size")
    public void user_choose_product2_size(){
        cartPage.chooseSize1("medium");
        extentTest.log(LogStatus.PASS,"User choose product2 size");
    }
}
