package Test;

import Base.BaseTest;
import Page.BasketPage;
import Page.HomePage;
import Page.ProductDetailPage;
import Page.ProductListPage;
import org.junit.Test;

public class TestExample extends BaseTest {


    @Test
    public  void TestiniumCase() {

        HomePage homePage=new HomePage(driver);
        ProductListPage productListPage=new ProductListPage(driver);
        ProductDetailPage productDetailPage=new ProductDetailPage(driver);
        BasketPage basketPage=new BasketPage(driver);


        homePage.isHomePageOpen();
        homePage.search("bilgisayar");

        productListPage.controlSearchResult("bilgisayar");
        productListPage.gotoNPage(2);
        productListPage.controlNthPageOpen(2);
        productListPage.clickRandomProduct();


        productDetailPage.controlDetailPageOpen();
        productDetailPage.addToBasket();
        productDetailPage.waitSecond(4);

        productDetailPage.toBasketPage();

        productDetailPage.waitSecond(4);

        basketPage.controlEqualsProductPrices();

        basketPage.productNumberAmount();
        basketPage.productDelete();



    }


}

