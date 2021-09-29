package Base;

import Page.ProductListPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

import static Utils.Elements.basketPage_productAmount;


public class BasePage {
    public WebDriver driver;

    private static Logger logger = Logger.getLogger(BasePage.class);

    public BasePage(WebDriver webDriver){
        this.driver=webDriver;
    }

    public void click(By by){
        WebElement element=driver.findElement(by);
        element.click();
        logger.info(by.toString()+" elementine tıklandı.");
    }

    public void clickNthElement(By by,int index){
        List<WebElement> elements= driver.findElements(by);
        elements.get(index-1).click();
        logger.info(by.toString()+" elementine listesinden "+index+" numarali elemente tıklandı.");

    }

    public void clickRandomElementFromElementList(By by){
        List<WebElement> elementList=driver.findElements(by);
        int randomNumber=getRandomNumber(elementList.size());
        elementList.get(randomNumber);
        logger.info(by.toString()+" elementine listesinden "+randomNumber+" numarali elemente tıklandı.");
    }

    public WebElement getRandomElementFromElementList(By by){
        List<WebElement> elementList=driver.findElements(by);
        int randomNumber=getRandomNumber(elementList.size());
        return  elementList.get(randomNumber);
    }

    public void write(By by,String text){
        WebElement element=driver.findElement(by);
        element.sendKeys(text);
        logger.info(by.toString()+" elementine "+text+" değeri yazıldı.");

    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getElementText(By by){
        return driver.findElement(by).getText();
    }

    public void pageScrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public String getCurrentPageUrl(){
       return driver.getCurrentUrl();
    }

    public int getRandomNumber(int limit){
        return new Random().nextInt(limit);
    }

    public void waitSecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
            logger.info(seconds+" saniye bekleniyor.");
        }catch (Exception e){
            logger.info(seconds+" saniye beklenemiyor :D");
        }
    }

    public void selectOption(By by,String value){
        Select select=new Select(driver.findElement(by));
        select.selectByValue(value);
    }
}
