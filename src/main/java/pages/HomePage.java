package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='row menu-line']//input[@name='search']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@class='row menu-line']//button[@id='search-button']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@class='with-child'][contains(@href,'farfor')]")
    private WebElement productPorcelainButton;

    @FindBy(xpath = "//a[@class='with-child'][contains(@href,'bar')]")
    private WebElement productBarInventoryButton;

    @FindBy(xpath = "//div[@class='row menu-line']//div[@class='products']//span")
    private WebElement amountOfProductsInCart;

    @FindBy(xpath = "//span[@class='hidden-sm hidden-xs']//span")
    private WebElement logInAccountButton;

    @FindBy(xpath = "//a[contains(@href,'simpleregister')]")
    private WebElement registrationButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword);
        searchButton.click();
    }

    public void clickProductPorcelainButton() { productPorcelainButton.click(); }

    public void clickProductBarInventoryButton() { productBarInventoryButton.click(); }

    public String getTextOfAmountProductsInCart() {
        return amountOfProductsInCart.getText();
    }

    public void clickLogInAccountButton() { logInAccountButton.click(); }

    public void clickRegistrationButton() { registrationButton.click(); }

}