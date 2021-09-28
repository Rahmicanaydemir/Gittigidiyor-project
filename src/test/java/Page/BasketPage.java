package Page;

import Base.BasePage;
import Utils.Constant;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;

import static Utils.Elements.basketPage_productPrice;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver webDriver) {
        super(webDriver);
    }

    private static Logger logger = Logger.getLogger(BasketPage.class);


    public void controlEqualsProductPrices(){
        String basketPageProductPrice=getElementText(basketPage_productPrice);
        Assert.assertTrue(basketPageProductPrice.contains(Constant.productDetailPage_productPrice));
        logger.info("Sepet sayfasında ürün fiyatı ile ürün detay sayfasındaki ürün fiyatı eşittir.");
    }
}
