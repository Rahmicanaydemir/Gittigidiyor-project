package Page;

import Base.BasePage;
import Utils.Constant;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Constant.productListPage_productName;
import static Utils.Elements.*;


public class ProductDetailPage extends BasePage {


    private static Logger logger = Logger.getLogger(ProductDetailPage.class);

    public ProductDetailPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void controlDetailPageOpen(){
        String productDetail_actualSubtitle=getElementText(productDetailPage_subtitle);
        boolean state=productDetail_actualSubtitle.contains(productListPage_productName);
        Assert.assertTrue(state);
        logger.info("ilgili ürün detay sayfası başarılı şekilde açıldı.");
    }


    public void addToBasket(){
        click(productDetailPage_closeCookieButton);

        WebElement element = driver.findElement(productDetailPage_addToBasketButton);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        waitSecond(1);
        Constant.productDetailPage_productPrice=getElementText(productDetailPage_productPrice).trim();
        click(productDetailPage_addToBasketButton);
        logger.info("Ürün detay sayfası sepete ekle butonuna tıklandı.");
    }


    public void toBasketPage(){
        click(productDetailPage_toBasketPage);
        logger.info("Ürün detay sayfası sepete git butonuna tıklanır.");
    }



}
