package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTests extends BaseTest {

    private static final String EXPECTED_AMOUNT_OF_PRODUCTS_CART_IN_CART = "1";
    private static final long DEFAULT_WAITING_TIME = 90;


    @Test
    public void checkAddToCart() {
        getHomePage().clickProductPorcelainButton();
        getPorcelainPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getPorcelainPage().clickToAddCartButton();
        getPorcelainPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getPorcelainPage().getAddToCartPopup());
        getPorcelainPage().clickContinueShoppingButton();
        assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_CART_IN_CART);
    }

    @Test
    public void checkRemoveToCart() {
        getHomePage().clickProductPorcelainButton();
        getPorcelainPage().clickToAddCartButton();
        getPorcelainPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getPorcelainPage().getAddToCartPopup());
        getPorcelainPage().clickContinueShoppingButton();
        getPorcelainPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getPorcelainPage().clickToAddCartNextButton();
        getPorcelainPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getPorcelainPage().getAddToCartPopup());
        getPorcelainPage().clickContinueShoppingButton();
        getPorcelainPage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getPorcelainPage().clickCartButton();
        getPorcelainPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getPorcelainPage().getAddToCartPopup());
        getPorcelainPage().clickToRemoveProductFromCart();
        getPorcelainPage().implicitWait(DEFAULT_WAITING_TIME);
        assertEquals(getPorcelainPage().getTextOfAmountProductsAfterRemoveInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_CART_IN_CART);
    }
}
