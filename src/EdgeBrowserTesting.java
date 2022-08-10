import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeBrowserTesting {

    public static void main(String[] args) {
        String baseURL = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver(); // Creating object of chrome driver
        driver.get(baseURL);   // onpe browse
        //driver.manage().window().maximize();  // Maximize a window
        // String title = driver.getTitle(); //13 and 14 line are  for conform a site title name
        //System.out.println(title);

        //driver.close(); //close browser
    }
}
