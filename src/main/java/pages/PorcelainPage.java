package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PorcelainPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'subcategory')]//a[contains(@href,'bljuda')]")
    private WebElement productDishesButton;

    @FindBy(xpath = "//button[contains(@class,'buy')]")
    private List<WebElement> addCartButtonList;

    @FindBy(xpath ="//div[@id='popup-cart-inner']//div[@class='popup-heading']")
    private WebElement addToCartPopup;

    @FindBy(xpath = "//button[contains(@onclick,'close')]")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//div[@class='row menu-line']//div[@id='cart']")
    private WebElement cartButton;

    @FindBy(xpath = "//td[@class='remove']//button[@type='button']")
    private List<WebElement> removeProduct;

    @FindBy(xpath = "//div[@class='row menu-line']//div[@class='products']//b")
    private WebElement amountOfProductsInCart;

    public PorcelainPage(WebDriver driver) { super(driver); }

    public void clickProductDishesButton() { productDishesButton.click(); }

    public WebElement getAddToCartPopup() {
        return addToCartPopup;
    }

    public void clickToAddCartButton() {
        addCartButtonList.get(0).click();
    }

    public void clickToAddCartNextButton() {
        addCartButtonList.get(1).click();
    }

    public void clickContinueShoppingButton() { continueShoppingButton.click(); }

    public void clickCartButton() { cartButton.click(); }

    public WebElement CartButton() { return cartButton; }

    public void clickToRemoveProductFromCart(){removeProduct.get(0).click();}

    public String getTextOfAmountProductsAfterRemoveInCart() {
        return amountOfProductsInCart.getText();
    }

}