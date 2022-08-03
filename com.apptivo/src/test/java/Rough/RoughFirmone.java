package Rough;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.hc.core5.reactor.AbstractIOSessionPool;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.AppBase;
import Extent.ExtentListeners;
import bsh.Capabilities;
import groovyjarjarantlr4.v4.codegen.model.Action;

public class RoughFirmone extends AppBase {
	
	ChromeOptions option = new ChromeOptions();

	

	@Test(priority = 1)
	public void Login() throws AWTException {

		values("UserEmail_XPATH", "report03@berijam.com");
		ExtentListeners.test.log(Status.INFO, "Entering name");
		values("UserPassword_XPATH", "Test123$");
		click("SignIn_XPATH");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.getProperty("FirmUser"))));
		for(int i=0; i<7; i++){
	        Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_MINUS);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_MINUS);
	        }


	}

	@Test(priority = 2)
	public void contacts() {
		
		driver.get(config.getProperty("ContactsApp"));
		ExtentListeners.test.log(Status.INFO, "Navigating to ContactsApp");
		Actions action = new Actions(driver);
		/*
		 * values("Contacts_Search_XPATH", "cool"); click("Contacts_SearchIcon_XPATH");
		 * wait.until(ExpectedConditions
		 * .visibilityOfElementLocated(By.xpath(variables.getProperty(
		 * "Contacts_Search_Result_XPATH")))); String Expectedresult =
		 * driver.findElement(By.xpath(variables.getProperty(
		 * "Contacts_Search_Result_XPATH"))) .getText(); String Actualresult =
		 * "Search Results (1)"; Assert.assertEquals(Actualresult, Expectedresult);
		 * click("Contacts_SearchSaveViews_XPATH");
		 * values("Contacts_SearchViewName_XPATH", "Temp");
		 * click("Contacts_SearchViewSave_XPATH"); WebElement myview =
		 * driver.findElement(By.xpath(variables.getProperty("Contacts_Myviews_XPATH")))
		 * ; ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);", myview);
		 * click("Contacts_Myviews_XPATH"); click("Contacts_SavedView_XPATH");
		 * click("Contacts_SavedViewDelete_CSS");
		 * click("Contacts_SavedViewDelconfirm_XPATH");
		 * click("Contacts_AdvSearch_XPATH"); values("Contacts_AdvFirstName_XPATH",
		 * "cool"); click("Contacts_AdvSearch_Icon_CSS"); wait.until(ExpectedConditions
		 * .visibilityOfElementLocated(By.xpath(variables.getProperty(
		 * "Contacts_Search_Result_XPATH")))); String Expectedresult1 =
		 * driver.findElement(By.xpath(variables.getProperty(
		 * "Contacts_Search_Result_XPATH"))) .getText(); String Actualresult1 =
		 * "Search Results (1)"; Assert.assertEquals(Actualresult1, Expectedresult1);
		 * click("Contacts_SearchSaveViews_XPATH");
		 * values("Contacts_SearchViewName_XPATH", "Temp");
		 * click("Contacts_AdvsearchViewSave_XPATH"); WebElement myview1 =
		 * driver.findElement(By.xpath(variables.getProperty("Contacts_Myviews_XPATH")))
		 * ; ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);", myview1);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.
		 * getProperty("Contacts_Myviews_XPATH")))) .click();
		 * 
		 * isElementPresent("Contacts_Myviews_XPATH");
		 * click("Contacts_SavedView_XPATH"); click("Contacts_SavedViewDelete_CSS");
		 * click("Contacts_SavedViewDelconfirm_XPATH");
		 *
		 */
		
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("document.body.style.zoom = '25%'");
		 */
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(config.getProperty("assertApp_CSS"))));
		driver.findElement(By.cssSelector(config.getProperty("assertApp_CSS"))).click();
		/*
		 * click("Contacts_Filter_XPATH"); click("Contacts_FilterClear_XPATH");
		 * click("Contacts_FilterCheckbox_XPATH"); click("Contacts_FilterApply_XPATH");
		 * wait.until(ExpectedConditions
		 * .visibilityOfElementLocated(By.xpath(variables.getProperty(
		 * "Contacts_Filter_Result_XPATH")))); String Expectedresult2 =
		 * driver.findElement(By.xpath(variables.getProperty(
		 * "Contacts_Filter_Result_XPATH"))) .getText(); String Actualresult2 =
		 * "Show All (1)"; Assert.assertEquals(Actualresult2, Expectedresult2);
		 */

		click("Contacts_FirstName_Sort_XPATH");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// wait.until(ExpectedConditions
		// .visibilityOfElementLocated(By.xpath(variables.getProperty("Contacts_FirstNameFull_Sort_XPATH"))));
		
		
		
		/*
		 * List<WebElement> confirst = driver
		 * .findElements(By.xpath(variables.getProperty(
		 * "Contacts_FirstNameFull_Sort_XPATH"))); System.out.println(confirst);
		 * List<String> originallist = confirst.stream().map(s ->
		 * s.getText()).collect(Collectors.toList()); System.out.println(originallist);
		 * // click("Contacts_FirstName_Sort_XPATH");
		 * 
		 * List<String> sortlist =
		 * originallist.stream().sorted().collect(Collectors.toList());
		 * System.out.println(sortlist);
		 * 
		 * Assert.assertTrue(originallist.equals(sortlist));
		 */
		List<String> con12;
		do
		{
			List<WebElement> confirst23 = driver.findElements(By.xpath(variables.getProperty("Contacts_FirstNameFull_Sort_XPATH")));
		//List<WebElement> con11 = driver.findElements(By.xpath(variables.getProperty("Contacts_Type_XPATH")));
		con12 = confirst23.stream().filter(s -> s.getText().contains("Dineshkumar")).map(a -> getcontype(a))
				.collect(Collectors.toList());
		/*
		 * System.out.println(con12); int hin =(int) con12.size();
		 * System.out.println("count " + hin++);
		 */


		if ( con12.size()<1) {
			
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-default  next\"]")));
			
			
			WebElement next = driver.findElement(By.xpath("//a[@class=\"btn btn-default  next\"]"));
			action.click(next).perform();
		}
		}
		while(con12.size()<1);
		

	}

	
	public static String getcontype(WebElement a) {
		// TODO Auto-generated method stub

		String contacttype = a.findElement(By.xpath(variables.getProperty("Contacts_Type_XPATH"))).getText();
		
		return contacttype;
	}

}
