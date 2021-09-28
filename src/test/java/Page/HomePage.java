package Page;

import Base.BasePage;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static Utils.Elements.*;

public class HomePage extends BasePage {


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    private static Logger logger = Logger.getLogger(HomePage.class);


    public void search(String text){
        write(searchTextArea,text);
        click(searchButton);
    }

    public void isHomePageOpen(){
        Assert.assertEquals(getPageTitle(),"GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi");
        logger.info("Ana sayfa başarılı açıldı.");
    }

}
