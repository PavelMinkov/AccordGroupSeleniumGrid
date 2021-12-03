package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BarInventoryPage extends BasePage {

    @FindBy(xpath = "//input[@value='monin']")
    private WebElement checkBox;

    @FindBy(xpath = "//div[contains(@class,'count')]//span[contains(@class,'close')]")
    private WebElement closeButton;


    public BarInventoryPage(WebDriver driver) { super(driver); }

    public void clickCheckBox() { checkBox.click(); }

    public WebElement getCloseButton() {
        return closeButton;
    }


}
