package testscripts;

import org.testng.annotations.*;
import pages.DashBoard;
import pages.OpenApplication;
import utils.TextUtility;


public class OpenCartApplication {

    @BeforeTest
    public static void beforeTestExecution(){
        System.out.println("before");

    }

    @AfterTest
    public static void afterTestExecution(){
        System.out.println("closing browser");
     //   closeBrowser.endBrowserSession();
    }
    @BeforeMethod
    public static void beforeMethod(){
        System.out.println("beforeMethod");

    }
    @AfterMethod
    public static void afterMethod(){
        System.out.println("closing browser after testcase is executed");
      //  CloseBrowser.endBrowserSession();
    }

  //  @Test
    public static void tc_001_RegistrationAndAddtoCart(){
        try {
            OpenApplication.openAplication();
            DashBoard.clickOnMyAccount();
            DashBoard.clickOnRegister();
            DashBoard.enterPersonalDetails();
            DashBoard.validateAccountCreated();
            DashBoard.navigateToMyAccountDetailsPage();
            DashBoard.checkForAccountDetails();
            DashBoard.clickOnContactLink();
            DashBoard.contactUsPage();
            DashBoard.enquire();
            DashBoard.click_submitBtn();
            DashBoard.click_continueBtn();
            DashBoard.clickOn_imageslider();
            DashBoard.clickOn_reviews();
            DashBoard.checkForExistingReviews();
            DashBoard.provideReviewOf20chars();
            DashBoard.provideReviewIn20_100chars();
            DashBoard.clickOnAddToWishlistBtn();
            DashBoard.checkForSuccessMessage();
            DashBoard.clickOnWishlistLink();
            DashBoard.checkForTotalItemsInWishList();
            TextUtility.configFlatFile("\"resource\\\\currency.txt\"");
            DashBoard.changeUnitPrice_toPounds();
            DashBoard.changeUnitPrice_toEuros();
            DashBoard.changeUnitPrice_toDollars();
            TextUtility.closeFile();
            DashBoard.clickOn_AddToCart();
            DashBoard.remove_fromCart();
            DashBoard.logout();

        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

   // @Test
    public static  void tc_002_ProductComparison()
    {
        try{
            OpenApplication.openAplication();
            DashBoard.clickOnMyAccount();
            DashBoard.login();
            DashBoard.searchText();
            DashBoard.filterSearch();
            DashBoard.phone_pda();
            DashBoard.sort();
            TextUtility.configFlatFile("resource\\Productlist_for_comparison.txt");
            DashBoard.compareItems();
            TextUtility.closeFile();
            DashBoard.clickOn_phoneLink();
            TextUtility.configFlatFile("resource\\phone_description.txt");
            DashBoard.phone_description();
            TextUtility.closeFile();
            DashBoard.clickOn_addToCart();
            DashBoard.clickOn_ShoppingCartLink();
            DashBoard.clickOn_CheckOut();
            DashBoard.clickOn_OrderhistoryTab();
            DashBoard.clickOn_newsletterTab();
            DashBoard.clickOn_specialsTab();
            DashBoard.logout();




        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //@Test
    public static void tc_003_addPhoneToCartFromHomePage()
    {
        try {
            OpenApplication.openAplication();
            DashBoard.clickOnMyAccount();
            DashBoard.login();
            DashBoard.homepage();
            DashBoard.clickOnSamsungGalaxyImage();
            DashBoard.selectTabMainImage();
            DashBoard.getTotalImagesCount();
            DashBoard.navigateToLastImage();
            DashBoard.closeImage();
            DashBoard.clickOnAddToCartBar();
            DashBoard.verifySuccessMessage();
            DashBoard.clickOnShoppingCartInSuccessMsgBox();
            DashBoard.checkItemsInCart();
            DashBoard.clickOnEstimateShippingAndTaxes();
            DashBoard.getQuotesAndApplyShipping();
            DashBoard.clickOn_couponcode_checkOut();
            DashBoard.logout();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    //@Test
    public static void tc_004_OrderHistory(){
        try{
            OpenApplication.openAplication();
            DashBoard.clickOnMyAccount();
            DashBoard.login();
            DashBoard.homepage();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public static void tc_005_GiftVoucher(){
        try{
            OpenApplication.openAplication();
            DashBoard.clickOnMyAccount();
            DashBoard.login();
            DashBoard.homepage();
            DashBoard.clickOn_giftVoucherTab();
            DashBoard.fill_in_details_forSendingGift();
            DashBoard.clickOnContactLink();
            DashBoard.contactUsPage();
            DashBoard.enquire();
            DashBoard.click_submitBtn();
            DashBoard.click_continueBtn();



        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public static void tc_006_PerformingActionsOnTotalAmt(){
        try{
            OpenApplication.openAplication();
            DashBoard.clickOnMyAccount();
            DashBoard.login();
            DashBoard.searchText();
            DashBoard.checkForResult();
            DashBoard.clickOnProductImageAndVerifyProductDetails();
            DashBoard.enterProductQuantity();
            DashBoard.clickOnAddToCartBar();




        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static  void tc_007_AddingProducts_fromCategory(){
        try {
            OpenApplication.openAplication();
            DashBoard.clickOnMyAccount();
            DashBoard.login();
            DashBoard.phone_pda();
            DashBoard.addThreePhonestoCart();
            DashBoard.clickOn_ShoppingCartLink();
            DashBoard.clickOn_CheckOut();


            DashBoard.logout();
        }

        catch(Exception e){
                e.printStackTrace();
            }
    }
    @Test
    public static  void tc_008_AddingProducts_fromCategory(){
        OpenApplication.openAplication();
        DashBoard.clickOnMyAccount();
        DashBoard.login();
        DashBoard.displayMessageBox();
    }
}
