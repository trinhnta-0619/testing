package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class MyCompany {
	 public static void main(String[] args) {
		    //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    	WebDriver driver = new FirefoxDriver();
	        String baseUrl = "http://www.facebook.com";
	        String tagName = "";
	        
	        driver.get(baseUrl);
	        driver.findElement(By.id("email"));
	        System.out.println(tagName);
	        driver.close();
	        System.exit(0);
	        
	    }
}
