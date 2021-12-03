package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//a[contains(@id,'confirm')]")
    private WebElement confirmButton;

    @FindBy(xpath = "//div[@data-for='register_email'][@data-rule='regexp']")
    private WebElement textError;

    public RegistrationPage(WebDriver driver) { super(driver); }

    public void searchByKeyword(final String keyword) {
        emailField.sendKeys(keyword);
    }

    public void clickConfirmButton(){ confirmButton.click();}

    public String getTextEmailField() { return textError.getText(); }

}
