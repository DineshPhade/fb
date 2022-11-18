package DataRead;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Baseclass {
    public static WebDriver driver;
     public static String  ApplicationURL;
    public static Properties p;

    public  void Read() throws IOException {
        FileInputStream Fp = new FileInputStream("src/test/java/Properties/conf.properties");
        p = new Properties();
        p.load(Fp);
        System.out.println("read the data= " + p.getProperty("url"));
        ApplicationURL = p.getProperty("url");

    }
    public void Launchbrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }


}
