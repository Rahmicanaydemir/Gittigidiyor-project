package Utils;

import org.openqa.selenium.By;

public class Elements {

    public static final By searchTextArea=By.xpath("//input[@name='k']");

    public static final By searchButton=By.xpath("//button[@data-cy='search-find-button']");

    public static final By searchResultText=By.xpath("//div[@data-cy='no_result_container']//h1//b");

    public static final By paginationList=By.xpath("//li[@data-testid='pagination-list-item']//a");

    public static final By productListPage_products=By.xpath("//article[@data-cy='product-card-item']//header//h2");

    public static final By productDetailPage_subtitle=By.xpath("//span[@id='sp-subTitle']");

    public static final By productDetailPage_addToBasketButton=By.id("add-to-basket");

    public static final By productDetailPage_productPrice=By.xpath("//div[@id='product-general-info']//div[@id='sp-price-lowPrice']");

    public static final By productDetailPage_closeCookieButton=By.xpath("//div[@class='policy-alert-v2-close policy-alert-v2-close-action']");

    public static final By productDetailPage_toBasketPage=By.xpath("//div[@class='basket-icon-title hidden-m hidden-t']");

    public static final By basketPage_productPrice=By.xpath("//div[@class='total-price']//strong");

    public static final By basketPage_productAmount=By.xpath("//select[@class='amount']");

    public static final By basketPage_productDelete=By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[1]/div[1]/div/div[6]/div[2]/div[2]/div[1]/div[3]/div/div[2]/div/a/i");

    }