import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class FirefoxBrowserTesting {

    public static void main(String[] args) {
        String baseURL = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); // Creating object of chrome driver
        driver.get(baseURL);   // onpe browse
        //driver.manage().window().maximize();  // Maximize a window
        // String title = driver.getTitle(); //13 and 14 line are  for conform a site title name
        //System.out.println(title);

        //driver.close(); //close browser
    }


}
