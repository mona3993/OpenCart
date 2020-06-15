package ObjectRepository;

import org.openqa.selenium.By;

public class ElementRepo {

    //dashboardpage
   // public static  By my_account= By.xpath("//ul[@class='list-inline']//a[@class='dropdown-toggle']");
    public static By my_account= By.xpath("//span[contains(text(),'My Account')]");
    public static By register = By.xpath("//a[contains(text(),'Register')]");
    public static By login = By.xpath("//a[contains(text(),'Login')]");
    public static By first_name = By.id("input-firstname");
    public static By last_name = By.id("input-lastname");
    public static By email = By.id("input-email");
    public static By phone = By.id("input-telephone");
    public static By pswd = By.id("input-password");
    public static By conf_pswd = By.id("input-confirm");
    public static By subscribe = By.xpath("//div[@class='form-group']//div[@class='col-sm-10']//label[1]");
    public static By check_privacyPolicy = By.xpath("//input[@name='agree']");
    public static By continue_btn = By.xpath("//input[@value='Continue']");
    public static By account_created_text = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]\n");

    //My Account
    public static By my_account_tab = By.xpath("//a[@class='list-group-item' and contains(text(),'My Account')]");
    public static By edit_my_account_link=By.xpath("//a[contains(text(),'Edit your account information')]");
    public static By input_firstname = By.xpath("//input[@id='input-firstname']");
    public static By input_lastname = By.xpath("//input[@id='input-lastname']");
    public static By input_email = By.xpath("//input[@id='input-email']");
    public static By input_telephone = By.xpath("//input[@id='input-telephone']");

    //Contact Page
    public static By contact_link = By.xpath("//i[@class='fa fa-phone']");
    public static By fetch_name = By.id("input-name");
    public static By type_enquiry = By.id("input-enquiry");
    public static By submit_btn = By.xpath("//input[@class='btn btn-primary']");
    public static By contactPage_continue_btn = By.xpath("//a[@class='btn btn-primary']");

    //Image sliding part
    public static By image_slider =By.xpath("//div[@class='swiper-slide text-center swiper-slide-duplicate swiper-slide-active']");
    public static By reviews = By.xpath("//a[contains(text(),'Reviews (0)')]");
    public static By no_reviewText = By.xpath("//p[contains(text(),'There are no reviews for this product.')]");
    public static By review_comments_txt_field = By.xpath("//textarea[@id='input-review']");
    public static By rating_value_1 = By.xpath("//div[@class='col-sm-12']/input[@type ='radio' and @value='1']");
    public static By rating_value_2 = By.xpath("//div[@class='col-sm-12']/input[@type ='radio' and @value='2']");
    public static By rating_value_3 = By.xpath("//div[@class='col-sm-12']/input[@type='radio' and @value = '3']");
    public static By rating_value_4 = By.xpath("//div[@class='col-sm-12']/input[@type ='radio' and @value='4']");
    public static By rating_value_5 = By.xpath("//div[@class='col-sm-12']/input[@type='radio' and @value = '5']");
    public static By review_continue_btn = By.id("button-review");
    public static By wishlist_btn = By.xpath("//div[@class='btn-group']//i[contains(@class,'fa fa-heart')]");
    public static By success_message_icon = By.xpath("//div[contains(@class,'alert alert-success alert-dismissible')]/i[contains(@class,'fa fa-check-circle')]");
    public static By success_mg_box = By.xpath("//div[contains(text(),'Success:')]");
    public static By close_success_msg = By.xpath("//div[contains(@class,'alert alert-success alert-dismissible')]/button[@class='close']");
    public static By wishlist_link = By.xpath("//a[@id='wishlist-total']");
    public static By wishlist_row_count = By.xpath("//table[contains(@class,'table table-bordered table-hover')]//tbody//tr");

    //Currency
    public static By currency_dropdown = By.xpath("//span[contains(text(),'Currency')]");
    public static By currency_in_pound_sterling = By.xpath("//button[@name='GBP']");
    public static By unit_price = By.xpath("//div[@class='price']");
    public static By currency_in_euro = By.xpath("//button[@name='EUR']");
    public static By currency_in_dollars = By.xpath("//button[@name='USD']");

    //Add to cart
    public static By add_to_cart_btn = By.xpath("//button[contains(@onclick,'cart.add')]");
    public static By remove_from_cart_btn = By.xpath("//a[@data-original-title='Remove']");
    public static By continue_btn1 = By.xpath("//a[text()='Continue']");


    //logout
    public static By log_out_btn = By.xpath("//a[contains(text(),'Logout')]");
    public static By log_out_msg = By.xpath("//h1[contains(text(),'Account Logout')]");

    //loginand

    public static By login_tab = By.xpath("//div[@class='list-group']/a[contains(text(),'Login')]");
    public static By returning_customer = By.xpath("//h2[contains(text(),'Returning Customer')]");
    public static By login_btn = By.xpath("//input[@value='Login']");


    //public static By  search_box = By.xpath("//div[@id='search']"); ////i[@class='fa fa-search']
    public static By  search_box = By.xpath("//input[@placeholder='Search']");
    public static By search_icon = By.xpath("//i[contains(@class,'fa fa-search')]");
    public static By all_categories = By.xpath("//select[@name='category_id']");
    public static By sub_category_checkbox = By.xpath("//input[@name='sub_category']");
    public static By search_btn = By.xpath("//input[@id='button-search']");
    public static By total_items = By.xpath("//div[contains(@class,'product-layout product-grid')]");
    public static By phone_pda_tab = By.xpath("//ul[@class='nav navbar-nav']//a[contains(text(),'Phones & PDAs')]");
    public static By sort_by = By.id("input-sort");

    //Product Comparison
    public static By compare_btn1 = By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]");
    public static By compare_btn2 = By.xpath("//body//div[@class='row']//div[@class='row']//div[2]//div[1]//div[2]//div[2]//button[3]");
    public static By compare_btn3 = By.xpath("//div[3]//div[1]//div[2]//div[2]//button[3]");
    public static By success_comparison_msg = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public static By close_msg = By.xpath("//button[@class='close']");
    public static By product_name1 = By.xpath("//div[@class='caption']//a[contains(text(),'Palm Treo Pro')]");
    public static By product_name2 = By.xpath("//a[contains(text(),'iPhone')]");
    public static By product_name3 = By.xpath("//a[contains(text(),'HTC Touch HD')]");
    public static By product_comparison_link = By.xpath("//a[contains(text(),'product comparison')]");
    public static By product_displayed_forComparison_1 = By.xpath("//strong[contains(text(),'HTC Touch HD')]");
    public static By product_displayed_forComparison_2 = By.xpath("//strong[contains(text(),'iPhone')]");
    public static By product_displayed_forComparison_3 = By.xpath("//strong[contains(text(),'Palm Treo Pro')]");
    public static  By phone_link = By.xpath("//body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[@class='row']/div[1]/div[1]/div[1]/a[1]");
    public static  By phone_feature = By.xpath("//li[contains(text(),'3.8-inch TFT-LCD flat touch-sensitive screen with')]");
    public static By addToCArt = By.id("button-cart");
    public static By successMsg_addToCart = By.xpath("//div[contains(@class,'alert alert-success alert-dismissible')]");
    public static By shopping_cart_link = By.xpath("//a[contains(text(),'shopping cart')]");
    public static By checkOut_btn = By.xpath("//a[@class='btn btn-primary']");
    public static By continueShopping_after_checkout = By.xpath("//div[@class='buttons clearfix']//div[@class='pull-left']"); ////a[@class='btn btn-default']
    public static By order_history = By.xpath("//a[contains(text(),'Order History')]");
    public static By newsletter = By.xpath("//a[contains(text(),'Newsletter')]");
    public static By newsletter_text = By.xpath("//h1[contains(text(),'Newsletter Subscription')]");
    public static By specials = By.xpath("//a[contains(text(),'Specials')]");
    public static By grid_view = By.xpath("//div[contains(@class,'btn-group btn-group-sm')]/button[@id='grid-view' and contains(@class,'btn btn-default active')]");
    public static By list_view = By.xpath("//div[contains(@class,'btn-group btn-group-sm')]/button[@id='list-view' and contains(@class,'btn btn-default active')]");
    public static By items_size = By.xpath("//div[contains(@class,'product-layout product-list col-xs-12')]");

    //hompage
    public static By home_icon = By.xpath("//i[contains(@class,'fa fa-home')]");
    public static By samsung_galaxy_image_slider = By.xpath("//div[contains(@class,'swiper-slide text-center swiper-slide-duplicate swiper-slide-active')]//img[contains(@alt,'iPhone 6') and @class='img-responsive']");
    public static By main_image = By.xpath("//ul[@class='thumbnails']//li[1]//a[1]");
    public static By total_images_count = By.xpath("//div[@class='mfp-counter']");
    public static By image_next_btn = By.xpath("//button[contains(@class,'mfp-arrow mfp-arrow-right mfp-prevent-close')]");
    public static By image_close_btn= By.xpath("//button[@class='mfp-close']");
    public static By add_to_cart_btn_big = By.xpath("//button[@id='button-cart']");
    public static By  shopping_cart_text = By.xpath("//a[contains(text(),'shopping cart')]");
    public static By items_in_carts = By.xpath("//div[@class='table-responsive']//tbody/tr");
    public static By estimate_shipping_and_taxes = By.xpath("//a[contains(text(),'Estimate Shipping & Taxes')]");
    public static By country = By.xpath("//select[@id='input-country']");
    public static By state = By.xpath("//select[@id='input-zone']");
    public static By post_code = By.xpath("//input[@id='input-postcode']");
    public static By get_quotes_btn = By.xpath("//button[@id='button-quote']");
    public static By flat_shipping_rate_radio_btn = By.xpath("//input[@name='shipping_method']");
    public static By totalCost = By.xpath("//div[@class='col-sm-4 col-sm-offset-8']//td[@class='text-right'][contains(text(),'$1,905.92')]");
    public static By apply_shipping_btn = By.xpath("//input[@id='button-shipping']");
    public static By success_shipping_msg = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public static By couponcode_btn = By.xpath("//a[@class='accordion-toggle']");
    public static By coupon_txt = By.id("input-coupon");
    public static By applyCoupon_btn = By.id("button-coupon");
    public static By warning_msg = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
    public static  By checkOut = By.xpath("//a[@class='btn btn-primary']");








//testcase 5:
    public static By gift_voucher_tab = By.xpath("//a[contains(text(),'Gift Certificates')]");
    public static By gift_purchase_text = By.xpath("//h1[contains(text(),'Purchase a Gift Certificate')]");
    public static By recipient_name = By.id("input-to-name");
    public static By recipient_email = By.id("input-to-email");
    ///radiobttns to be included
    public static By get_all_radio_btns = By.xpath("//input[@type='radio' and @name='voucher_theme_id']");
    public static By message = By.id("input-message");
    public static By amt = By.id("input-amount");
    public static By check = By.xpath("//input[@name='agree']");
    public static By contd  = By.xpath("//input[@value='Continue']");
    public static By gift_purchase_aftermsg= By.xpath("//p[contains(text(),'Thank you for purchasing a gift certificate! Once')]");
    public static By continue_btn_after_purchase_gift = By.xpath("//div[@class='pull-right']");
    public static By shopping_cart_heading = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    public static By contd_shopping = By.xpath("//a[@class='btn btn-default']");
    public static By wishlistt_footer = By.xpath("//ul[@class='list-unstyled']//a[contains(text(),'Wish List')]");

   // testcase 6
    public static By product_details = By.xpath("//div[contains(@class,'product-layout product-list col-xs-12')]");
    public static By product_image = By.xpath("//div[contains(@class,'product-layout product-list col-xs-12')]//div[@class='image']");
    public static By product_description = By.xpath("//a[contains(text(),'Description')]");
    public static By input_quantity = By.xpath("//input[@id='input-quantity']");
    public static By add_to_cart_button = By.xpath("//span[contains(text(),'Add to Cart')]");



//testcase : 7
    public static By addtocart_btn1 = By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]");
    public static  By ribbonmsg = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public static  By addtocart_btn2 = By.xpath("//body//div[@class='row']//div[@class='row']//div[2]//div[1]//div[2]//div[2]//button[1]");
    public static  By addtocart_btn3 = By.xpath("//div[3]//div[1]//div[2]//div[2]//button[1]");
    public static  By countOfLinks = By.tagName("a");











}
