package Fbstepdef;

import DataRead.Baseclass;
import Fbpageobjects.Fbpageobj;
import cucumber.api.java.en.Given;


public class Loginstepdef extends Baseclass {
    Fbpageobj fb=new Fbpageobj();


    @Given("^Login to application$")
    public  void Login_to_application() throws InterruptedException {
        fb.Loginfb();


    }

//    @Given("^Launch the Amazon application$")
//    public void launch_The_Amazon_Application() {
//        fb.LaunchAmazon();
//
//    }
//
//    @And("^User Search the products in Application$")
//    public void User_Search_the_products_in_Application() throws InterruptedException {
//        fb.Searchproduct();
//    }
//
//    @And("^Register in the Application$")
//    public void register_In_The_Application() {
//    }
}
