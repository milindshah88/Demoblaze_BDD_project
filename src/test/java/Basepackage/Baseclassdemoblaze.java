package Basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import Utility.TimeUtil;

public class Baseclassdemoblaze {
	
	public static  Properties prop = new Properties();
	public static TakesScreenshot ts;
	public static WebDriver driver;

	 public void BaseDemoblazeClass() throws FileNotFoundException {
		 try {
		 FileInputStream file = new FileInputStream("C:\\Users\\mkuma\\eclipse-workspace\\Demoblaze_BDD_framework\\src\\test\\java\\EnvironmentPackage\\config.properties");
		 prop.load(file);
		  }
		 
		 catch (FileNotFoundException e)
		 
		 
		 {
			 e.printStackTrace();
			 
		 }
		 catch (IOException a ) {
			 
			 a.printStackTrace();
		 }
		 
		
	 
	 }
		 public static void initiate() {
			 
		
		
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mkuma\\eclipse-workspace\\Demoblaze_TDD_framework\\chromedriver.exe");
				driver  =new ChromeDriver();
				
			
			
			
			driver.manage().window().maximize();
	
		
			
	
			}
			 
			 
		
		public  void capturescreenshot() throws IOException {

TakesScreenshot ts = (TakesScreenshot) driver;
File ss =ts.getScreenshotAs(OutputType.FILE); 
String currenttest = new Object(){}.getClass().getEnclosingMethod().getName(); 
File trg = new File
("C:\\Users\\mkuma\\eclipse-workspace\\Demoblaze_BDD_framework\\Screenshots\\"+currenttest+".png");
	FileHandler.copy(ss, trg);
				
			}
		 

}
