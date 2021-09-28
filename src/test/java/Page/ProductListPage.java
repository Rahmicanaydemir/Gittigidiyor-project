package Page;

import Base.BasePage;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Utils.Constant.productListPage_productName;
import static Utils.Elements.*;

public class ProductListPage extends BasePage {

    public ProductListPage(WebDriver webDriver) {
        super(webDriver);
    }

    private static Logger logger = Logger.getLogger(ProductListPage.class);


    public void controlSearchResult(String expectedSearchText){
        Assert.assertEquals(expectedSearchText,getElementText(searchResultText));
        logger.info("Arama sonucunda "+expectedSearchText+" sonucu görülmüştür.");
    }


    public void gotoNPage(int pageNumber){
        pageScrollDown();
        clickNthElement(paginationList,pageNumber);

        WebElement element = driver.findElement(paginationList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        waitSecond(1);

        logger.info("Listeleme sayfasında "+pageNumber+". sayfa butonuna tıklanır.");

    }


    public void controlNthPageOpen(int pageNumber){
        String expectedPageUri="sf="+pageNumber;
        Assert.assertTrue(getCurrentPageUrl().contains(expectedPageUri));
        logger.info("Listele sayfasında "+pageNumber+" numaralı sayfanın açıldığı görülür.");
    }


    public void clickRandomProduct(){
        WebElement selectedProduct=getRandomElementFromElementList(productListPage_products);
        productListPage_productName=selectedProduct.getText();
        selectedProduct.click();
        logger.info("Listeleme sayfasında rastgele bir ürüne tıklandı.");
    }
}
