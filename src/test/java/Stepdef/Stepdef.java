package Stepdef;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Basepackage.Baseclassdemoblaze;
import Pompackage.Homepage;
import Pompackage.Pomlogin;
import Utility.TimeUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef extends Baseclassdemoblaze {
	Pomlogin Log;
	Homepage Hp;

	public Stepdef () throws FileNotFoundException   {
		super();
		
		
		
	}
@Given("The user must be on homepage url {string}")
public void the_user_must_be_on_homepage_url(String string) throws FileNotFoundException  {
	initiate();
	driver.get(string);
	driver.manage().timeouts().pageLoadTimeout(TimeUtil.Timepage, TimeUnit.SECONDS);
	Log = new Pomlogin();
	Hp =new Homepage();
	
}

@Given("User is logged in into the account")
public void user_is_logged_in_into_the_account() throws InterruptedException, IOException {	
	
	Log.clicklogin();
	Thread.sleep(5000);
	 FileInputStream file = new FileInputStream("C:\\Users\\mkuma\\eclipse-workspace\\Demoblaze_BDD_framework\\src\\test\\java\\EnvironmentPackage\\config.properties");
	 prop.load(file);
	  Log.typeusername(prop.getProperty("Username"));
	  Log.typepassword(prop.getProperty("Password"));
	  Log.clickloginbutton();
Thread.sleep(2000);



	
}

@When("User clicks on the Laptops option")
public void user_clicks_on_the_laptops_option() throws FileNotFoundException, InterruptedException {

	Thread.sleep(2000);

	


}

@When("User selects Macbook air product by clicking on the item")
public void user_selects_macbook_air_product_by_clicking_on_the_item() throws InterruptedException, IOException {
	 Hp.purchaseproduct();
	
	 Thread.sleep(3000);
}

@Then("New page should open with image of the Laptop and ADD to CART button")
public void new_page_should_open_with_image_of_the_laptop_and_add_to_cart_button() throws InterruptedException, IOException {
	 capturescreenshot();
}

@Then("User clciks on the Add to cart button")
public void user_clciks_on_the_add_to_cart_button() throws InterruptedException, IOException {
	
}

@Then("A pop up should generate")
public void a_pop_up_should_generate() {

	
	 driver.switchTo().alert().accept();
}

@Then("Navigate to the cart page and verify the Macbook air is added to the cart")
public void navigate_to_the_cart_page_and_verify_the_macbook_air_is_added_to_the_cart() throws InterruptedException {
	 Thread.sleep(10000);
	  Hp.checkthecart();
	  Thread.sleep(10000);
	  Hp.verifycart();
	  driver.close();
}


}
