package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFucntions {
	public static WebDriver driver;
	 
	
	public static void waitforElement(String Locator){
	    	WebDriverWait wait = new WebDriverWait(driver, 15);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Locator)));
	    }

	
	
	public void inputtextfield(WebElement element,String Text){
		element.clear();
		element.sendKeys(Text);
		
	}
}
