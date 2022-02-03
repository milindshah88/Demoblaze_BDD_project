package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features="C:\\Users\\mkuma\\eclipse-workspace\\Demoblaze_BDD_framework\\src\\test\\java\\Shoppingcart.feature", glue= {"Stepdef"},plugin= {"pretty","json:C:\\Users\\mkuma\\eclipse-workspace\\Cucumber\\target\\cucuberreport.json"}, 
monochrome=true , publish = true)
public class Testrunner {

}
