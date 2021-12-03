package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private static final String SEARCH_KEYWORD = "glass";
    private static final String SEARCH = "glass";
    private static final int COUNT_ELEMENTS = 24;
    private static final String CHECK_BRAND = "Monin";
    private static final String NO_CORRECT_EMAIL = "Fault@";
    private static final String MESSAGE_FIELD_EMAIL = "Некорректный адрес электронной почты!";
    private static final long DEFAULT_WAITING_TIME = 90;


    @Test
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(SEARCH));
    }

    @Test
    public void checkElementsAmountOnSearchPage() {
        getHomePage().clickProductPorcelainButton();
        getPorcelainPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getPorcelainPage().clickProductDishesButton();
        getPorcelainPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        assertEquals(getSearchResultsPage().getSearchResultsCount(), COUNT_ELEMENTS);
    }

    @Test
    public void checkThatCheckBoxResultsContainsSearchBrand() {
        getHomePage().clickProductBarInventoryButton();
        getBarInventoryPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getBarInventoryPage().clickCheckBox();
        getBarInventoryPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME,getBarInventoryPage().getCloseButton());

        for (WebElement webElement: getSearchResultsPage().getSearchResultsList()){
            assertTrue(webElement.getText().contains(CHECK_BRAND));
        }
    }

    @Test
    public void checkCorrectEmail() {
        getHomePage().clickLogInAccountButton();
        getHomePage().clickRegistrationButton();
        getRegistrationPage().searchByKeyword(NO_CORRECT_EMAIL);
        getRegistrationPage().clickConfirmButton();
        assertEquals(getRegistrationPage().getTextEmailField(), MESSAGE_FIELD_EMAIL);
    }
}