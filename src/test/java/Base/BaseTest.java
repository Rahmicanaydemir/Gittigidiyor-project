package Base;

import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-fullscreen");
        driver=new ChromeDriver(options);
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        PropertyConfigurator.configure("log4j.properties");

    }

    @After
    public void end(){
        driver.quit();

    }


}
