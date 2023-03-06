package Fbpageobjects;

import DataRead.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbpageobj extends Baseclass {
    //public  static WebDriver driver;
   // String url="https://www.facebook.com/";
    public Fbpageobj() {

        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "email")
     public WebElement Email;
    @FindBy(id = "pass")
    public  WebElement Pass;

    @FindBy(xpath = "*//button[@name='login']")
    public  WebElement login;
    public  void Loginfb() throws InterruptedException {
        driver.get(ApplicationURL);
        Thread.sleep(3000);
        Email.sendKeys("akash@gmail.com");
        Thread.sleep(3000);
        Pass.sendKeys("akash");
        Thread.sleep(3000);
        login.click();
        Thread.sleep(5000);
    }

//    @FindBy(xpath = "*//input[@id='twotabsearchtextbox']")
//    WebElement searchproduct;
//
//    @FindBy(xpath = "*//input[@id='nav-search-submit-button']")
//    WebElement findproduct;
//
//    @FindBy(xpath = "*//span[@class='a-size-medium a-color-base a-text-normal']")
//    WebElement phone;
//
//    public  void LaunchAmazon()
//    {
//        driver.get(ApplicationURL);
//    }
//
//    public void Searchproduct() throws InterruptedException {
//        searchproduct.sendKeys("iphone14");
//        Thread.sleep(3000);
//        findproduct.click();
//        Thread.sleep(3000);
//        phone.click();
//        Thread.sleep(3000);
//    }
}
