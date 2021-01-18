package com.automation.step_definitions;

import com.automation.pages.BasePage;
import com.automation.pages.ConnectPage;
import com.automation.pages.MorePage;
import com.automation.pages.ShopPage;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import com.automation.utilities.MobileUtilities;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;



public class GuestUserEnStepDefinitions extends BasePage{

    Actions action = new Actions(Driver.get());
    ConnectPage connectPage = new ConnectPage();
    ShopPage shopPage = new ShopPage();
    MorePage morePage = new MorePage();

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
        shopPage.selectProduct.click();
        MobileUtilities.wait(2);
    }

    @Then("user add product to cart")
    public void user_add_product_to_cart() {
        shopPage.addToCartButton.click();
        MobileUtilities.wait(2);
        shopPage.cart.click();
    }

    @Then("user adds item to wishlist")
    public void user_adds_item_to_wishlist() {
        MobileUtilities.wait(2);
        shopPage.editCart.click();
        shopPage.markFirstProduct.click();
        shopPage.addToWishlistFromCart.click();
    }

    @Then("user navigates back to wishlist from cart")
    public void user_navigates_back_to_wishlist_from_cart() {
        Assert.assertTrue(shopPage.addedWishlistTopUpMsg.isDisplayed());
        shopPage.backToPDP.click();
        shopPage.backSearchBox.click();
        shopPage.cancelSearch.click();
        MobileUtilities.wait(2);
        shopPage.shop2.click();
        shopPage.wishlistButton.click();
    }

    @Then("user navigates back to wishlist")
    public void user_navigates_back_to_wishlist() {
        Assert.assertTrue(shopPage.addedWishlistTopUpMsg.isDisplayed());
        shopPage.backSearchBox.click();
        shopPage.cancelSearch.click();
        MobileUtilities.wait(2);
        shopPage.shop2.click();
        shopPage.wishlistButton.click();
    }


    @Then("verify product added to wishlist")
    public void verify_product_added_to_wishlist() {

        Assert.assertTrue(shopPage.wishlistItem.isDisplayed());
    }

    @Then("user click on add to wishlist button")
    public void user_click_on_add_to_wishlist_button() {
        shopPage.getAddToWishlistFromPDP.click();
    }

    @Then("user navigates back to Connect")
    public void user_navigates_back_to_Connect() {
        connect.click();
    }

    @Then("verify the user should see the channels")
    public void verify_the_user_should_see_the_channels() {
        Assert.assertTrue(connectPage.secondChannel.isDisplayed());
        MobileUtilities.wait(2);
        connectPage.secondChannel.click();
        MobileUtilities.wait(2);
        Assert.assertTrue(connectPage.gameImageConnect.isDisplayed());
    }

    @Then("user navigates to cart and clicks checkout")
    public void user_navigates_to_cart_and_clicks_checkout() {
        shopPage.checkout.click();
    }

    @Then("user should fill address details and clicks continue")
    public void user_should_fill_address_details_and_clicks_continue() {
        shopPage.firstName.sendKeys(ConfigurationReader.get("firstName"));
        shopPage.lastName.sendKeys(ConfigurationReader.get("lastName"));
        shopPage.email.sendKeys(ConfigurationReader.get("email2"));
        shopPage.phoneNumber.sendKeys(ConfigurationReader.get("phoneNumber"));


        connectPage.nextButton.click();
        MobileUtilities.wait(2);
        shopPage.countrySelection.click();
        MobileUtilities.wait(2);
        shopPage.citySelection.click();
        MobileUtilities.wait(2);
        shopPage.districtSelection.click();
        MobileUtilities.wait(2);
        shopPage.street.sendKeys(ConfigurationReader.get("street"));
        MobileUtilities.wait(2);
        shopPage.continueToNextStep.click();

    }

    @Then("user fill card details and clicks confirm order")
    public void user_fill_card_details_and_clicks_confirm_order() {
        shopPage.cardHolder.sendKeys(ConfigurationReader.get("cardName"));
        shopPage.expDate.sendKeys(ConfigurationReader.get("cardExpiryDate"));
        shopPage.cardNumber.sendKeys(ConfigurationReader.get("cardNumber"));
        shopPage.cvv.sendKeys(ConfigurationReader.get("cardCVV"));

        shopPage.confirmOrder.click();

        MobileUtilities.wait(5);
    }


    @Then("user should navigate to shop")
    public void user_should_navigate_to_shop() {
        shop.click();
        MobileUtilities.wait(2);
    }

    @Then("user click on filter, choose games and apply filter")
    public void user_click_on_filter_choose_games_and_apply_filter() {
        shopPage.filterButton.click();
        MobileUtilities.wait(2);

        shopPage.gamesFilter.click();
//        action.moveByOffset(200,450).build();
//        action.click();

        //action.moveByOffset( 200, 450).click().build().perform();
        MobileUtilities.wait(2);
        shopPage.applyFilters.click();

    }

    @Then("verify the user filtered games")
    public void verify_the_user_filtered_games() {
        MobileUtilities.wait(2);
        Assert.assertTrue(shopPage.filterResults.isDisplayed());

    }

    @Then("user searches game")
    public void user_searches_game() {
        shopPage.shopSearchBox.sendKeys(ConfigurationReader.get("gameName"));
        MobileUtilities.wait(2);

    }

    @Then("user click on view all button")
    public void user_click_on_view_all_button() {
        shopPage.viewAllButton.click();
    }

    @Then("verify the user should see the game")
    public void verify_the_user_should_see_the_game() {
        Assert.assertTrue(shopPage.searchResults.isDisplayed());
    }

    @Then("user choose {string} payment method")
    public void user_choose_payment_method_and_clicks_continue(String paymentMethod) {
        MobileUtilities.wait(5);

        switch (paymentMethod){
        case "COD":
            shopPage.codPayment.click();
            break;
        case "CC":
            shopPage.ccPayment.click();
            break;
        }
    }

    @Then("user clicks continue to next step")
    public void user_clicks_continue_to_next_step() {
        MobileUtilities.wait(2);
        shopPage.continueToNext.click();
    }

    @Then("verify the user should see shopping fee and COD fee")
    public void verify_the_user_should_see_shopping_fee_and_COD_fee() {
        MobileUtilities.wait(1);
        Assert.assertTrue(shopPage.subtotal.isDisplayed());
        Assert.assertTrue(shopPage.subtotal.isDisplayed());
    }

    @Then("user should choose category for PLP")
    public void user_should_choose_category_for_PLP() {
        shopPage.firstPLP.click();

    }

    @Then("verify the user on PLP")
    public void verify_the_user_on_PLP() {
        MobileUtilities.wait(2);
        Assert.assertTrue(shopPage.headerPLP.isDisplayed());
    }

    @Then("verify the user proceed as a guest user")
    public void verify_the_user_proceed_as_a_guest_user() {
        MobileUtilities.wait(5);
        System.out.println("shopPage.homePage.isDisplayed() = " + shopPage.homePage.isDisplayed());
//        System.out.println("shopPage.homePage2.isDisplayed() = " + shopPage.homePage2.isDisplayed());
        System.out.println("searchBox = " + searchBox.isDisplayed());
        //Assert.assertTrue(shopPage.homePage.isDisplayed());
    }

    @Then("user will navigates to settings and changes language")
    public void user_will_navigates_to_settings_and_changes_language() {
        moreButton.click();
        morePage.settings.click();
        morePage.changeLanguage.click();
        morePage.arabicLanguage.click();


    }

    @Then("verify language changed")
    public void verify_language_changed() {
        MobileUtilities.wait(3);
        System.out.println("homeHeaderArabic.isDisplayed() = " + homeHeaderArabic.isDisplayed());
        Assert.assertTrue(homeHeaderArabic.isDisplayed());

    }

}
