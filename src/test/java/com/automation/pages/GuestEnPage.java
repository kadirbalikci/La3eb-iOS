package com.automation.pages;

import com.automation.utilities.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestEnPage extends BasePage{

    public GuestEnPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()), this);
    }


    @FindBy(id = "SingleRowProductCell.titleLabel")
    public MobileElement selectProduct;

    @FindBy(id = "ProductDetailCTAView.addToCartButton")
    public MobileElement addToCartButton;

    @FindBy(id = "BadgeBarButtonItem.shopBarButton")
    public MobileElement cart;

    @FindBy(id = "CartController.UIBarButtonItem")
    public MobileElement editCart;

    @FindBy(id = "CartItemCell.checkboxButton")
    public MobileElement markFirstProduct;

    @FindBy(id = "TabSelectionView.rightButton")
    public MobileElement addToWishlistFromCart;

    @FindBy(id = "TopNotifyView.descriptionLabel")
    public MobileElement addedWishlistTopUpMsg;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    public MobileElement backToPDP;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Welcome La3eb\"]")
    public MobileElement backSearchBox;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public MobileElement cancelSearch;

    @FindBy(id = "BadgeBarButtonItem.wishlistBarButton")
    public MobileElement wishlistButton;

    @FindBy(id = "WishlistCell.0")
    public MobileElement wishlistItem;

    @FindBy(id = "TabbarController.Optional(\"Shop\")")
    public MobileElement shop2;

    @FindBy(id = "ProductDetailCTAView.favoriteButton")
    public MobileElement getAddToWishlistFromPDP;

    @FindBy(id = "GamesHubController.GamesHubFeedCell.1")
    public MobileElement secondChannel;

    @FindBy(id = "GameImageCell.0")
    public MobileElement gameImageConnect;

    @FindBy(id = "PaymentOverlayView.nextStepButton")
    public MobileElement checkout;

    @FindBy(id = "ShippingAddressCell.firstNameTextField")
    public MobileElement firstName;

    @FindBy(id = "ShippingAddressCell.lastNameTextField")
    public MobileElement lastName;

    @FindBy(id = "ShippingAddressCell.emailTextField")
    public MobileElement email;

    @FindBy(id = "PhoneNumberView.phoneNumberTextField")
    public MobileElement phoneNumber;

    @FindBy(id = "ShippingAddressCell.countryTextField")
    public MobileElement country;


    @FindBy(id = "ShippingAddressCell.cityTextField")
    public MobileElement city;

    @FindBy(id = "SearchableItemTableViewCell.0")
    public MobileElement citySelection;

    @FindBy(id = "SearchableItemTableViewCell.0")
    public MobileElement districtSelection;

    @FindBy(id = "ShippingAddressCell.districtTextField")
    public MobileElement district;

    @FindBy(id = "ShippingAddressCell.address1TextField")
    public MobileElement street;

    @FindBy(id = "ShippingController.$__lazy_storage_$_nextStepButton")
    public MobileElement continueToNextStep;

    @FindBy(id = "OrderConfirmView.confirmOrderButton")
    public  MobileElement continueToNext;

    @FindBy(id = "CreditCardInputCell.ownerNameTextField")
    public MobileElement cardHolder;

    @FindBy(id = "CreditCardInputCell.expireDateTextField")
    public MobileElement expDate;

    @FindBy(id = "CreditCardInputCell.cardNumberTextField")
    public MobileElement cardNumber;

    @FindBy(id = "CreditCardInputCell.cvvTextField")
    public MobileElement cvv;

    @FindBy(id = "OrderConfirmView.confirmOrderButton")
    public MobileElement confirmOrder;

    @FindBy(id = "DynamicPageController.Optional<UITextField>")
    public MobileElement shopSearchBox;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"plp filter\"]")
    public MobileElement filterButton;

    @FindBy(id = "HeaderView.viewAllButton")
    public MobileElement viewAllButton;

    @FindBy(xpath = "//*[@text='Games']")
    public MobileElement gamesFilter;

    @FindBy(id = "BlueButton")
    public MobileElement applyFilters;

    @FindBy(id = "(2)")
    public MobileElement sumOfFilter;

    @FindBy(className = "UICollectionView")
    public MobileElement searchResults;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Cash On Delivery\"]")
    public MobileElement codPayment;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Credit\"]" )
    public MobileElement ccPayment;

    @FindBy(id = "OrderConfirmView.subTotalDescriptionLabel")
    public MobileElement subtotal;

    @FindBy(id = "OrderConfirmView.codTitleLabel")
    public MobileElement codFee;

    @FindBy(id = "GradientImageCell.titleLabel")
    public MobileElement firstPLP;

    @FindBy(id = "HeaderView.titleLabel")
    public MobileElement headerPLP;

    @FindBy(className = "UITableTextAccessibilityElement")
    public MobileElement homePage;

    @FindBy(id = "FeaturedCell.pageControl")
    public MobileElement homePage2;





}
