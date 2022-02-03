package Pompackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Basepackage.Baseclassdemoblaze;
import junit.framework.Assert;

public class Homepage extends Baseclassdemoblaze {
	public Homepage() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath ="//a[contains(text(),'Laptops')] ")
	WebElement Laptops;
	
   @FindBy (id ="cartur")
   WebElement cart;

   @FindBy (xpath ="//a[contains(text(),'MacBook air')]")
   WebElement Macbookair;
   @FindBy (xpath ="//a[contains(text(),'Sony vaio i5')]")
   WebElement sonyvio;
   @FindBy (xpath ="//a[contains(text(),'Add to cart')]")
   WebElement addtocartbutton;
   @FindBy (className="table-responsive")
	WebElement shoppingtable;
   public void purchaseproduct () throws InterruptedException
   
   {
	   @SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 50);
wait.until(ExpectedConditions.elementToBeClickable(Laptops)).click();


wait.until(ExpectedConditions.elementToBeClickable(Macbookair)).click();
  
wait.until(ExpectedConditions.elementToBeClickable(addtocartbutton)).click();
	 
	    
   }
	
   public void checkthecart()
   {cart.click();
	   
   }
   
   public void verifyalert()
   {
	   try 
	    { 
	       driver.switchTo().alert(); 
	       Assertions.assertEquals(true, true);
	     
	    }   
	    catch (NoAlertPresentException Ex) 
	    { 
	    	Assertions.assertEquals(false, true);
	    }   
   }
   
   public  void verifycart() {
		String observedtext =shoppingtable.getText();
		
		
if (observedtext.contains("MacBook air"))
{boolean result = true;
Assertions.assertEquals(result, true);
	}
else {boolean result =false;

Assertions.assertEquals(result, true);
}


   }




}
