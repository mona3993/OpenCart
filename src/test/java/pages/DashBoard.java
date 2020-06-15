package pages;

import ObjectRepository.ElementRepo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DashBoard {
    public static WebDriver driver = InitiateBrowser.driver;
    public static String imageCount = null;

    public static void clickOnMyAccount() {
        try {
            Wait.waitForPageLoad();
            driver.findElement(ElementRepo.my_account).click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void clickOnRegister() {
        try {
            Wait.waitTillElementIsVisible(ElementRepo.register);
            driver.findElement(ElementRepo.register).click();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void enterPersonalDetails() {
        try {
            //clear first name text field
            driver.findElement(ElementRepo.first_name).clear();

            driver.findElement(ElementRepo.first_name).sendKeys(ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 0));


            //find lastname field
            driver.findElement(ElementRepo.last_name).clear();
            driver.findElement(ElementRepo.last_name).sendKeys(ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 1));


            //find email-ID field
            driver.findElement(ElementRepo.email).clear();
            driver.findElement(ElementRepo.email).sendKeys(ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 2));

            //find telephone
            driver.findElement(ElementRepo.phone).clear();
            driver.findElement(ElementRepo.phone).sendKeys(ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 3));

            //find password
            driver.findElement(ElementRepo.pswd).clear();
            driver.findElement(ElementRepo.pswd).sendKeys(ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 4));

            //find confrm password
            driver.findElement(ElementRepo.conf_pswd).clear();
            driver.findElement(ElementRepo.conf_pswd).sendKeys(ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 4));

            //find subscribe
            Wait.waitTillElementIsClickable(ElementRepo.subscribe);
            driver.findElement(ElementRepo.subscribe).click();

            //find privacyPolicy
            driver.findElement(ElementRepo.check_privacyPolicy).click();

            //find continue button
            driver.findElement(ElementRepo.continue_btn).click();
            //xpath("//input[@class='btn btn-primary']"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void validateAccountCreated() {
        try {
            String account_created_success = driver.findElement(ElementRepo.account_created_text).getText();
            System.out.println("Hiii...." + account_created_success);
            Assert.assertEquals("Your Account Has Been Created!", account_created_success);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void navigateToMyAccountDetailsPage() {
        try {
            driver.findElement(ElementRepo.my_account_tab).click();
            Wait.waitTillElementIsVisible(ElementRepo.edit_my_account_link);
            driver.findElement(ElementRepo.edit_my_account_link).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkForAccountDetails() {
        try {
            Wait.waitTillElementIsVisible(ElementRepo.input_firstname);
            System.out.println("getText: " + driver.findElement(ElementRepo.input_firstname).getText());
            System.out.println("getAttribute: " + driver.findElement(ElementRepo.input_firstname).getAttribute("value"));
            Assert.assertEquals(driver.findElement(ElementRepo.input_firstname).getAttribute("value"), ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 0));

            System.out.println("getAttribute: " + driver.findElement(ElementRepo.input_lastname).getAttribute("value"));
            Assert.assertEquals(driver.findElement(ElementRepo.input_lastname).getAttribute("value"), ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 1));

            System.out.println("getAttribute: " + driver.findElement(ElementRepo.input_email).getAttribute("value"));
            Assert.assertEquals(driver.findElement(ElementRepo.input_email).getAttribute("value"), ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 2));

            System.out.println("getAttribute: " + driver.findElement(ElementRepo.input_telephone).getAttribute("value"));
            Assert.assertEquals(driver.findElement(ElementRepo.input_telephone).getAttribute("value"), ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 3));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void clickOnContactLink() {
        //Wait.waitTillElementIsVisible(ElementRepo.contact_link);
        driver.findElement(ElementRepo.contact_link).click();
    }

    public static void contactUsPage() {
        try {
            Assert.assertEquals(driver.findElement(ElementRepo.fetch_name).getAttribute("value"), ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 0));
            Assert.assertEquals(driver.findElement(ElementRepo.input_email).getAttribute("value"), ExcelUtility.read_from_excel("resource\\RegistrationDetails.xlsx",1, 2));
            System.out.println("Name and email details are automatically filled...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void enquire() {
        try {
            driver.findElement(ElementRepo.type_enquiry).sendKeys("This is to change the address and Phone number");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void click_submitBtn() {
        driver.findElement(ElementRepo.submit_btn).click();
    }

    public static void click_continueBtn() {
        driver.findElement(ElementRepo.contactPage_continue_btn).click();
    }

    public static void clickOn_imageslider() {
        try {
            Wait.waitTillElementIsVisible(ElementRepo.image_slider);
            driver.findElement(ElementRepo.image_slider).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickOn_reviews() {
        ScrollDownPage.scrollDown();
        driver.findElement(ElementRepo.reviews).click();
    }

    public static void checkForExistingReviews() {
        try {
            if (driver.findElements(ElementRepo.no_reviewText).size() != 0) {
                System.out.println("There are no existing reviews");
            } else {
                System.out.println("Reviews already present");
            }
        } catch (Exception e) {
            System.out.println("Review not present " + e.getMessage());
        }
    }

    public static void provideReviewOf20chars() {
        try {
            driver.findElement(ElementRepo.review_comments_txt_field).sendKeys(ExcelUtility.read_from_review_excel(1, 1));
            driver.findElement(ElementRepo.rating_value_3).click();
            driver.findElement(ElementRepo.review_continue_btn).click();
            //System.out.println("provide review");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void provideReviewIn20_100chars() {
        try {
            driver.navigate().refresh();
            driver.findElement(ElementRepo.reviews).click();
            driver.findElement(ElementRepo.review_comments_txt_field).sendKeys(ExcelUtility.read_from_review_excel(2, 1));
            driver.findElement(ElementRepo.rating_value_4).click();
            driver.findElement(ElementRepo.review_continue_btn).click();
            //System.out.println("provide review");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickOnAddToWishlistBtn() {
        try {
            Wait.waitTillElementIsClickable(ElementRepo.wishlist_btn);
            driver.findElement(ElementRepo.wishlist_btn).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkForSuccessMessage() {
        try {
            Wait.waitTillElementIsVisible(ElementRepo.success_mg_box);
            System.out.println("Success message is displayed");
            driver.findElement(ElementRepo.close_success_msg).click();
        } catch (Exception e) {
            System.out.println("Success message is not displayed");
            e.printStackTrace();
        }
    }

    public static void clickOnWishlistLink() {
        try {
            Wait.waitTillElementIsVisible(ElementRepo.wishlist_link);
            driver.findElement(ElementRepo.wishlist_link).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkForTotalItemsInWishList() {
        try {
            String value = driver.findElement(ElementRepo.wishlist_link).getText();
            System.out.println(value);
            String number[] = value.split("[\\(||//)]");
            System.out.println("splitted value" + number[1]);
            int num = Integer.parseInt(number[1]);
            System.out.println(num);
            List<WebElement> rows = driver.findElements(ElementRepo.wishlist_row_count);
            System.out.println(rows.size());
            if (num == rows.size()) {
                System.out.println("total item count in wishlist link and in wishlisttable in wishlist matches");
            } else
                System.out.println("total item count in wishlist link and in wishlisttable in wishlist doest not matches");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void changeUnitPrice_toPounds() throws IOException {

        try {
            driver.findElement(ElementRepo.currency_dropdown).click();
            driver.findElement(ElementRepo.currency_in_pound_sterling).click();
            String price = driver.findElement(ElementRepo.unit_price).getText();
            System.out.println(price);
            if (price.contains("£")) {
                System.out.println("Unit price is displayed in pounds");
                //fw.write(price);
                TextUtility.write_intoTextFile("resource\\\\currency.txt", true, price.concat("\n"));
            } else
                System.out.println("Unit price is not displayed in pounds");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void changeUnitPrice_toEuros() throws Exception {
        try {
            driver.findElement(ElementRepo.currency_dropdown).click();
            driver.findElement(ElementRepo.currency_in_euro).click();
            String price = driver.findElement(ElementRepo.unit_price).getText();
            System.out.println(price);

            if (price.contains("€")) {
                System.out.println("Unit price is displayed in euro");
                TextUtility.write_intoTextFile("resource\\\\currency.txt", true, price.concat("\n"));
                //TextUtility.write_intoTextfile("resource\\currency.txt", true, price.concat("\n"));
            } else
                System.out.println("Unit price is not displayed in euro");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void changeUnitPrice_toDollars() throws Exception {
        try {
            driver.findElement(ElementRepo.currency_dropdown).click();
            driver.findElement(ElementRepo.currency_in_dollars).click();
            String price = driver.findElement(ElementRepo.unit_price).getText();
            System.out.println(price);

            if (price.contains("$")) {
                System.out.println("Unit price is displayed in dollar");
                TextUtility.write_intoTextFile("resource\\\\currency.txt", true, price.concat("\n"));
            } else
                System.out.println("Unit price is not displayed in dollar");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickOn_AddToCart() {
        driver.findElement(ElementRepo.add_to_cart_btn).click();
        checkForSuccessMessage();
//        Wait.waitTillElementIsVisible(ElementRepo.close_success_msg);
//        driver.findElement(ElementRepo.close_success_msg).click();
//
    }

    public static void remove_fromCart() {
        driver.findElement(ElementRepo.remove_from_cart_btn).click();
        checkForSuccessMessage();
        driver.findElement(ElementRepo.continue_btn1).click();
//        Wait.waitTillElementIsVisible(ElementRepo.close_success_msg);
//        driver.findElement(ElementRepo.close_success_msg).click();

    }

    public static void logout() {
        clickOnMyAccount();
        driver.findElement(ElementRepo.log_out_btn).click();
        System.out.println(driver.findElement(ElementRepo.log_out_msg).getText());
    }

    public static void login() {
        try {
            Wait.waitTillElementIsVisible(ElementRepo.login);
            driver.findElement(ElementRepo.login).click();
            Wait.waitTillElementIsVisible(ElementRepo.returning_customer);
            driver.findElement(ElementRepo.email).sendKeys("s.monalisa3993@gmail.com");
            driver.findElement(ElementRepo.pswd).sendKeys("akash@143");
            driver.findElement(ElementRepo.login_btn).click();
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }

    }

    public static void searchText() {
        try {
            Wait.waitForPageLoad();
            Wait.waitTillElementIsClickable(ElementRepo.search_box);
            driver.findElement(ElementRepo.search_box).sendKeys("canon");
            driver.findElement(ElementRepo.search_icon).click();
        } catch (Exception e) {
            System.out.println("Exception e" + e.getMessage());
        }
    }

    public static void filterSearch() {
        try {
            Wait.waitForPageLoad();
            Select dropDown = new Select(driver.findElement(ElementRepo.all_categories));
            dropDown.selectByValue("28");
            driver.findElement(ElementRepo.sub_category_checkbox).click();
            driver.findElement(ElementRepo.search_btn).click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void phone_pda() {

        driver.findElement(ElementRepo.phone_pda_tab).click();
    }

    public static void sort() {
        try {
            Select drop_down = new Select(driver.findElement(ElementRepo.sort_by));
            drop_down.selectByVisibleText("Price (Low > High)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void compareItems() throws IOException {
        try {
            List<By> element_arr = new ArrayList<By>();
            element_arr.add(ElementRepo.compare_btn1);
            element_arr.add(ElementRepo.compare_btn2);
            element_arr.add(ElementRepo.compare_btn3);

            List<By> product_list = new ArrayList<By>();
            product_list.add(ElementRepo.product_name1);
            product_list.add(ElementRepo.product_name2);
            product_list.add(ElementRepo.product_name3);

            List<By> comparisonList = new ArrayList<By>();
            comparisonList.add(ElementRepo.product_displayed_forComparison_1);
            comparisonList.add(ElementRepo.product_displayed_forComparison_2);
            comparisonList.add(ElementRepo.product_displayed_forComparison_3);


            for (int i = 1; i < 4; i++) {

                driver.findElement(element_arr.get(i)).click();
                String msg = driver.findElement(ElementRepo.success_comparison_msg).getText();
                System.out.println(msg);
                driver.findElement(ElementRepo.close_msg).click();
                String pname = driver.findElement(product_list.get(i)).getText();
                TextUtility.write_intoTextFile("resource\\Productlist_for_comparison.txt", true, pname.concat("\n"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


//        String fileName = "/Users/pankaj/source.txt";
//        File file = new File(fileName);
//        FileInputStream fis = new FileInputStream(file);
//        InputStreamReader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
//
//       List<String> data = new ArrayList<String>();
//       String line;
//
//        while((line = br.readLine()) != null){
//            data.add(line);
//        }
//        br.close();
//
//
//        for(int i = 1; i <=comparisonList.size(); i++){
//
//            Assert.assertEquals(comparisonList.get(i).toString(),data.get(i));
//
//            }

//        driver.findElement(ElementRepo.product_comparison_link).click();
//        String item_name = driver.findElement(By.xpath("//strong[contains(text(),'HTC Touch HD')]")).getText();
//        if(item_name.equals())

    }

    public static void clickOn_phoneLink() {
        driver.findElement(ElementRepo.phone_link).click();
    }

    public static void phone_description() {
        String desc = driver.findElement(ElementRepo.phone_feature).getText();
        TextUtility.write_intoTextFile("resource\\phone_description.txt", true, desc);
    }

    public static void clickOn_addToCart() {
        driver.findElement(ElementRepo.addToCArt).click();
        System.out.println(driver.findElement(ElementRepo.successMsg_addToCart).getText());
    }

    public static void clickOn_ShoppingCartLink() {
        driver.findElement(ElementRepo.shopping_cart_link).click();
    }

    public static void clickOn_CheckOut() {
        driver.findElement(ElementRepo.checkOut_btn).click();
    }

    public static void clickOn_OrderhistoryTab() {
        driver.findElement(ElementRepo.order_history).click();
    }

    public static void clickOn_newsletterTab() {
        driver.findElement(ElementRepo.newsletter).click();
        if (driver.findElement(ElementRepo.newsletter_text).getText() != null) {
            System.out.println("Newsletter page is opened...");
        }
    }

    public static void clickOn_specialsTab() {
        driver.findElement(ElementRepo.specials).click();
        if (driver.findElements(ElementRepo.items_size).size() >= 2) {
            System.out.println("atleast 2 items are present");
        }
    }

    public static void toggle_display_forListnGrid() {
        driver.findElement(ElementRepo.list_view).click();
        if (driver.findElements(ElementRepo.list_view).size() != 0) {
            System.out.println("...Page is displayed in list view...");
        }

        driver.findElement(ElementRepo.grid_view).click();
        if (driver.findElements(ElementRepo.grid_view).size() != 0) {
            System.out.println("...Page is displayed in grid view...");
        }
    }

    public static void homepage() {
        try {
            driver.findElement(ElementRepo.home_icon).click();
            Assert.assertEquals(driver.getTitle(), "Your Store");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickOnSamsungGalaxyImage() {
        try {
            Wait.waitForPageLoad();
            driver.findElement(ElementRepo.samsung_galaxy_image_slider).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectTabMainImage() {
        try {
            Wait.waitForPageLoad();
            driver.findElement(ElementRepo.main_image).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getTotalImagesCount() {
        try {
            Wait.waitForPageLoad();
            String count = driver.findElement(ElementRepo.total_images_count).getText();
            String[] value = count.split(" ");
            Wait.waitForPageLoad();
            imageCount = value[2];
            System.out.println("total no. of images present: " + imageCount);
            TextUtility.configFlatFile(" ");
            TextUtility.write_intoTextFile("resource\\add_phone_toCart.txt", true, imageCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void navigateToLastImage() {
        try {
            int num = Integer.parseInt(imageCount);
            for (int i = 0; i <= num; i++) {
                System.out.println("Iterating through image no: " + i);
                driver.findElement(ElementRepo.image_next_btn).click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeImage() {
        try {
            driver.findElement(ElementRepo.image_close_btn).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickOnAddToCartBar() {
        try {
            driver.findElement(ElementRepo.add_to_cart_btn_big).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verifySuccessMessage() {
        try {
            Wait.waitForPageLoad();
            WebElement success_message = driver.findElement(ElementRepo.successMsg_addToCart);
            Assert.assertTrue(success_message.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickOnShoppingCartInSuccessMsgBox() {
        try {
            Wait.waitForPageLoad();
            driver.findElement(ElementRepo.shopping_cart_text).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void checkItemsInCart() {
        try {
           List <WebElement> countItem = driver.findElements(ElementRepo.items_in_carts);
           Assert.assertTrue(countItem.size() > 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void clickOnEstimateShippingAndTaxes() {
        try {
            driver.findElement(ElementRepo.estimate_shipping_and_taxes).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void getQuotesAndApplyShipping(){
        try{
            ScrollDownPage.scrollDown();
           Select country = new Select(driver.findElement(ElementRepo.country));
           country.selectByVisibleText("India");
            Select state = new Select(driver.findElement(ElementRepo.state));
            state.selectByVisibleText("Karnataka");
            driver.findElement(ElementRepo.post_code).sendKeys("560036");
            driver.findElement(ElementRepo.get_quotes_btn).click();
            driver.findElement(ElementRepo.flat_shipping_rate_radio_btn).click();
            String str = "Total cost: "+driver.findElement(ElementRepo.totalCost).getText();
            TextUtility.configFlatFile("resource\\Total_cost.txt");
            TextUtility.write_intoTextFile("resource\\Total_cost.txt",true,str);
            driver.findElement(ElementRepo.apply_shipping_btn).click();
            System.out.println("Yippee!!!..." +driver.findElement(ElementRepo.success_shipping_msg).getText());

        }catch (Exception e){
           e.printStackTrace();
        }
    }

    public static  void clickOn_couponcode_checkOut(){
        try {

            driver.findElement(ElementRepo.couponcode_btn).click();
            driver.findElement(ElementRepo.coupon_txt).sendKeys("AM143");
            driver.findElement(ElementRepo.applyCoupon_btn).click();
            String warning_message = driver.findElement(ElementRepo.warning_msg).getText();
            System.out.println(warning_message);
            TextUtility.configFlatFile("resource\\warning_message.txt");
            TextUtility.write_intoTextFile("resource\\warning_message.txt", true, warning_message);
            driver.findElement(ElementRepo.checkOut).click();

        }catch(Exception e) {
            e.printStackTrace();
        }


    }

    public static void clickOn_giftVoucherTab(){
        driver.findElement(ElementRepo.gift_voucher_tab).click();
        System.out.println(driver.findElement(ElementRepo.gift_purchase_text).getText());
    }

    public static void fill_in_details_forSendingGift(){
        try {
            driver.findElement(ElementRepo.recipient_name).sendKeys(PropertiesData.getDataFromProperties("GiftRecipientDetails","name"));
            driver.findElement(ElementRepo.recipient_email).sendKeys(PropertiesData.getDataFromProperties("GiftRecipientDetails","email"));
              List<WebElement>radio_btns = driver.findElements(ElementRepo.get_all_radio_btns);
             if(PropertiesData.getDataFromProperties("GiftRecipientDetails","message_type").equals("birthday")){
                  radio_btns.get(0).click();
                  driver.findElement(ElementRepo.message).sendKeys(PropertiesData.getDataFromProperties("GiftRecipientDetails","birthday_message"));
             }else if (PropertiesData.getDataFromProperties("GiftRecipientDetails","message_type").equals("christmas")){
                 radio_btns.get(1).click();
                 driver.findElement(ElementRepo.message).sendKeys(PropertiesData.getDataFromProperties("GiftRecipientDetails","christmas_message"));
             }else if (PropertiesData.getDataFromProperties("GiftRecipientDetails","message_type").equals("general")){
                 radio_btns.get(2).click();
                 driver.findElement(ElementRepo.message).sendKeys(PropertiesData.getDataFromProperties("GiftRecipientDetails","general_message"));
             }
            driver.findElement(ElementRepo.amt).clear();
             driver.findElement(ElementRepo.amt).sendKeys(PropertiesData.getDataFromProperties("GiftRecipientDetails","amount"));
            driver.findElement(ElementRepo.check).click();
            driver.findElement(ElementRepo.contd).click();
            Wait.waitForPageLoad();
            System.out.println(driver.findElement(ElementRepo.gift_purchase_aftermsg).getText());
            driver.findElement(ElementRepo.continue_btn_after_purchase_gift).click();
            System.out.println(driver.findElement(ElementRepo.shopping_cart_heading).getText());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static  void clickOn_wishlist_footer(){
        driver.findElement(ElementRepo.wishlistt_footer).click();
       // driver.findElement(ElementRepo.con)
    }

    public static void checkForResult(){
        try{
            Wait.waitForPageLoad();
            ScrollDownPage.ScrollTillElementDisplayed(ElementRepo.product_details);
            if (driver.findElements(ElementRepo.product_details).size()!=0){
                System.out.println("product details is displayed");
            }else {
                System.out.println("product details not found");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void clickOnProductImageAndVerifyProductDetails(){
        try{
           driver.findElement(ElementRepo.product_image).click();
           Wait.waitForPageLoad();
           if (driver.findElements(ElementRepo.product_description).size()!=0){
               System.out.println("Product description is displayed");
           }else{
               System.out.println("Product description is not available");
           }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void enterProductQuantity(){
        try{
            driver.findElement(ElementRepo.input_quantity).sendKeys(ExcelUtility.read_from_excel("resource\\enter_quantity.xlsx",1,0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static  void addThreePhonestoCart(){
        try{
            driver.findElement(ElementRepo.addtocart_btn1).click();
            driver.findElement(ElementRepo.ribbonmsg).getText();
            System.out.println(driver.findElement(ElementRepo.ribbonmsg).getText());
            driver.findElement(ElementRepo.addtocart_btn2).click();
            driver.findElement(ElementRepo.ribbonmsg).getText();
            System.out.println(driver.findElement(ElementRepo.ribbonmsg).getText());
            driver.findElement(ElementRepo.addtocart_btn3).click();
            driver.findElement(ElementRepo.ribbonmsg).getText();
            System.out.println(driver.findElement(ElementRepo.ribbonmsg).getText());



        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void displayMessageBox() {
        try {
            int numberOfLinks = getAllLinks();
            System.out.println("no of links: "+numberOfLinks);
            JavascriptExecutor js = (JavascriptExecutor) driver;
           //s js.executeScript("alert('Number of links present in user homepage is: \+numberOfLinks+\');");
            Thread.sleep(3000);
          //  driver.switchTo().alert().accept();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int getAllLinks(){
        int count = 0;
        try{

            List<WebElement> allLinks = driver.findElements(ElementRepo.countOfLinks);
            count = allLinks.size();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }
}






































