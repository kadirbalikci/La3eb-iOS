package com.automation.step_definitions.guest;

import com.automation.pages.BasePage;
import com.automation.pages.GuestEnPage;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import com.automation.utilities.MobileUtilities;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


import java.net.MalformedURLException;

public class guestAddsItemsToWishlistFromCart extends BasePage{

    Actions action = new Actions(Driver.get());
    GuestEnPage guestEnPage = new GuestEnPage();

    @Given("user should continue as a guest")
    public void user_should_continue_as_a_guest() {
        allow.click();
        continueAsAGuest.click();

    }

    @Then("user click on skip for discover la3eb")
    public void user_click_on_skip_for_discover_la3eb() {
        skipButton.click();
    }

    @Then("click on screen")
    public void click_on_screen() {

        action.moveToElement(shop, 100, 250).click().build().perform();
        MobileUtilities.wait(3);
    }

    @Then("user navigates PDP")
    public void user_navigates_PDP() {
        searchBox.sendKeys(ConfigurationReader.get("sku"));
        MobileUtilities.wait(3);
        guestEnPage.selectProduct.click();
        MobileUtilities.wait(2);
    }

    @Then("user add product to cart")
    public void user_add_product_to_cart() {
        guestEnPage.addToCartButton.click();
        MobileUtilities.wait(2);
        guestEnPage.cart.click();
    }

    @Then("user adds item to wishlist")
    public void user_adds_item_to_wishlist() {
        MobileUtilities.wait(2);
        guestEnPage.editCart.click();
        guestEnPage.markFirstProduct.click();
        guestEnPage.addToWishlistFromCart.click();
    }

    @Then("user navigates back to wishlist from cart")
    public void user_navigates_back_to_wishlist_from_cart() {
        Assert.assertTrue(guestEnPage.addedWishlistTopUpMsg.isDisplayed());
        guestEnPage.backToPDP.click();
        guestEnPage.backSearchBox.click();
        guestEnPage.cancelSearch.click();
        MobileUtilities.wait(2);
        guestEnPage.shop2.click();
        guestEnPage.wishlistButton.click();
    }

    @Then("user navigates back to wishlist")
    public void user_navigates_back_to_wishlist() {
        Assert.assertTrue(guestEnPage.addedWishlistTopUpMsg.isDisplayed());
        guestEnPage.backSearchBox.click();
        guestEnPage.cancelSearch.click();
        MobileUtilities.wait(2);
        guestEnPage.shop2.click();
        guestEnPage.wishlistButton.click();
    }


    @Then("verify product added to wishlist")
    public void verify_product_added_to_wishlist() {

        Assert.assertTrue(guestEnPage.wishlistItem.isDisplayed());
    }

    @Then("user click on add to wishlist button")
    public void user_click_on_add_to_wishlist_button() {
        guestEnPage.getAddToWishlistFromPDP.click();
    }

    @Then("user navigates back to Connect")
    public void user_navigates_back_to_Connect() {
        connect.click();
    }

    @Then("verify the user should see the channels")
    public void verify_the_user_should_see_the_channels() {
        Assert.assertTrue(guestEnPage.secondChannel.isDisplayed());
        MobileUtilities.wait(2);
        guestEnPage.secondChannel.click();
        MobileUtilities.wait(2);
        Assert.assertTrue(guestEnPage.gameImageConnect.isDisplayed());
    }

    @Then("user navigates to cart and clicks checkout")
    public void user_navigates_to_cart_and_clicks_checkout() {
        guestEnPage.checkout.click();
    }

    @Then("user should fill address details and clicks continue")
    public void user_should_fill_address_details_and_clicks_continue() {
        guestEnPage.firstName.sendKeys(ConfigurationReader.get("firstName"));
        guestEnPage.lastName.sendKeys(ConfigurationReader.get("lastName"));
        guestEnPage.email.sendKeys(ConfigurationReader.get("email2"));
        guestEnPage.phoneNumber.sendKeys(ConfigurationReader.get("phoneNumber"));


        MobileUtilities.wait(1);
        guestEnPage.country.sendKeys(ConfigurationReader.get("country"));
        guestEnPage.city.sendKeys(ConfigurationReader.get("city"));
        guestEnPage.district.sendKeys(ConfigurationReader.get("district"));
        guestEnPage.street.sendKeys(ConfigurationReader.get("street"));
        MobileUtilities.wait(2);
        guestEnPage.continueToNextStep.click();

    }

    @Then("user choose payment method and clicks continue")
    public void user_choose_payment_method_and_clicks_continue() {
        MobileUtilities.wait(2);
        guestEnPage.ccPaymentMethod.click();
        MobileUtilities.wait(2);
        guestEnPage.continueToNext.click();

    }

    @Then("user fill card details and clicks confirm order")
    public void user_fill_card_details_and_clicks_confirm_order() {
        guestEnPage.cardHolder.sendKeys(ConfigurationReader.get("cardName"));
        guestEnPage.expDate.sendKeys(ConfigurationReader.get("cardExpiryDate"));
        guestEnPage.cardNumber.sendKeys(ConfigurationReader.get("cardNumber"));
        guestEnPage.cvv.sendKeys(ConfigurationReader.get("cardCVV"));

        guestEnPage.confirmOrder.click();

        MobileUtilities.wait(5);
    }


    @Then("user should navigate to shop")
    public void user_should_navigate_to_shop() {
        shop.click();
        MobileUtilities.wait(2);
    }

    @Then("user click on filter, choose games and apply filter")
    public void user_click_on_filter_choose_games_and_apply_filter() {
        guestEnPage.filterButton.click();
        MobileUtilities.wait(2);

        action.moveByOffset(200,450).build();
        action.click();

        //action.moveByOffset( 200, 450).click().build().perform();
        MobileUtilities.wait(5);
        guestEnPage.applyFilters.click();

    }

    @Then("verify the user filtered games")
    public void verify_the_user_filtered_games() {
        MobileUtilities.wait(2);
        Assert.assertTrue(guestEnPage.sumOfFilter.isDisplayed());

    }

    @Then("user searches game")
    public void user_searches_game() {
        guestEnPage.shopSearchBox.sendKeys(ConfigurationReader.get("gameName"));
        MobileUtilities.wait(2);

    }

    @Then("user click on view all button")
    public void user_click_on_view_all_button() {
        guestEnPage.viewAllButton.click();
    }

    @Then("verify the user should see the game")
    public void verify_the_user_should_see_the_game() {
        Assert.assertTrue(guestEnPage.searchResults.isDisplayed());
    }

    @Then("user choose {string} payment method and clicks continue")
    public void user_choose_payment_method_and_clicks_continue(String paymentMethod) {

        switch (paymentMethod){
        case "COD":

            break;

        }
    }


}
