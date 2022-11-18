package Fbstepdef;

import DataRead.Baseclass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

import static DataRead.Baseclass.driver;

public class Hooks {
    Baseclass BA = new Baseclass();

    @Before
    public void BH() throws IOException {
        BA.Read();
        BA.Launchbrowser();
    }

    @After
    public void AH() {
        driver.close();
    }
}
