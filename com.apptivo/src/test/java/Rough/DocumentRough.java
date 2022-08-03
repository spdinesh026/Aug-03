package Rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.AppBase;
import Extent.ExtentListeners;

public class DocumentRough extends AppBase {

	@Test(priority = 1)
	public void Login() {

		values("UserEmail_XPATH", "automationapp01@berijam.com");
		ExtentListeners.test.log(Status.INFO, "Entering name");
		values("UserPassword_XPATH", "Test123$");
		click("SignIn_XPATH");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.getProperty("FirmUser"))));
	}

	@Test(priority = 2)
	public void customersGlobalSearch() {
		driver.get(config.getProperty("CustomersApp"));
		ExtentListeners.test.log(Status.INFO, "Navigating to CustomersApp");
		values("Customers_Search_XPATH", "cool");
		click("Customers_SearchIcon_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Customers_Search_Result_XPATH"))));
		String ActualResult = driver.findElement(By.xpath(variables.getProperty("Customers_Search_Result_XPATH"))).getText();
		String ExpectedResult = "cool";
		Assert.assertEquals(ActualResult, ExpectedResult);
		List <WebElement> Search = (List<WebElement>) driver.findElements(By.xpath(variables.getProperty("Customers_Search_Result_XPATH")));
		Integer ActualResult1 = Search.size();
		Integer ExpectedResult1 = 1;
		Assert.assertEquals(ActualResult1, ExpectedResult1);
		String NameVar = generator.generate(6);
		click("Customers_SearchSaveViews_XPATH");
		values("Customers_SearchViewName_XPATH", NameVar );
		click("Customers_SearchViewSave_XPATH");
		WebElement myview = driver.findElement(By.xpath(variables.getProperty("Customers_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview);
		click("Customers_Myviews_XPATH");
		System.out.println(NameVar);
		WebElement myview1 = driver.findElement(By.xpath("//a[normalize-space()="+ "\"" + NameVar + "\"" + "]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview1);
		driver.findElement(By.xpath("//a[normalize-space()="+ "\"" + NameVar + "\"" + "]")).click();
		//click("Contacts_SavedView_XPATH");
		String ActualResult2 = driver.findElement(By.xpath(variables.getProperty("Customers_Search_Result_XPATH"))).getText();
		String ExpectedResult2 = "cool";
		Assert.assertEquals(ActualResult2, ExpectedResult2);
		List <WebElement> Search1 = (List<WebElement>) driver.findElements(By.xpath(variables.getProperty("Customers_Search_Result_XPATH")));
		Integer ActualResult3 = Search1.size();
		Integer ExpectedResult3 = 1;
		Assert.assertEquals(ActualResult3, ExpectedResult3);
		click("Customers_SavedViewDelete_CSS");
		click("Customers_SavedViewDelconfirm_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Customers_AdvSearch_XPATH"))));
	}
	/*@Test(priority = 3)
	public void contactsAdvancedSearch() {
		
		click("Contacts_AdvSearch_XPATH");
		values("Contacts_AdvFirstName_XPATH", "cool");
		click("Contacts_AdvSearch_Icon_CSS");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Contacts_Search_Result_XPATH"))));
		String ActualResult4 = driver.findElement(By.xpath(variables.getProperty("Contacts_FirstNameFull_Sort_XPATH")))
				.getText();
		String ExpectedResult4 = "Cool";
		Assert.assertEquals(ActualResult4, ExpectedResult4);
		List <WebElement> Search2 = (List<WebElement>) driver.findElements(By.xpath(variables.getProperty("Contacts_FirstNameFull_Sort_XPATH")));
		Integer ActualResult5 = Search2.size();
		Integer ExpectedResult5 = 1;
		Assert.assertEquals(ActualResult5, ExpectedResult5);
		String NameVar1 = generator.generate(6);
		click("Contacts_SearchSaveViews_XPATH");
		values("Contacts_SearchViewName_XPATH", NameVar1 );
		
		click("Contacts_AdvsearchViewSave_XPATH");
		driver.navigate().refresh();
		WebElement myview2 = driver.findElement(By.xpath(variables.getProperty("Contacts_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview2);
		
		click("Contacts_Myviews_XPATH");
		System.out.println(NameVar1);
		WebElement myview3 = driver.findElement(By.xpath("//span[normalize-space()="+ "\"" + NameVar1 + "\"" + "]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview3);
		driver.findElement(By.xpath("//span[normalize-space()="+ "\"" + NameVar1 + "\"" + "]")).click();
		//click("Contacts_SavedView_XPATH");
		String ActualResult6 = driver.findElement(By.xpath(variables.getProperty("Contacts_FirstNameFull_Sort_XPATH"))).getText();
		String ExpectedResult6 = "Cool";
		Assert.assertEquals(ActualResult6, ExpectedResult6);
		List <WebElement> Search3 = (List<WebElement>) driver.findElements(By.xpath(variables.getProperty("Contacts_FirstNameFull_Sort_XPATH")));
		Integer ActualResult7 = Search3.size();
		Integer ExpectedResult7 = 1;
		Assert.assertEquals(ActualResult7, ExpectedResult7);
		click("Contacts_SavedViewDelete_CSS");
		click("Contacts_SavedViewDelconfirm_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(config.getProperty("assertApp_CSS"))));
		driver.findElement(By.cssSelector(config.getProperty("assertApp_CSS"))).click();
	}
		@Test(priority = 4)
		public void contactsFilter() {
		click("Contacts_Filter_XPATH");
		click("Contacts_FilterClear_XPATH");
		click("Contacts_Filter_Billing_XPATH");
		click("Contacts_FilterApply_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Contacts_Filter_Result_XPATH"))));
		String ActualResult8 = driver.findElement(By.xpath(variables.getProperty("Contacts_FirstNameFull_Sort_XPATH"))).getText();
		String ExpectedResult8 = "Cool";
		Assert.assertEquals(ActualResult8, ExpectedResult8);
		List <WebElement> Search4 = (List<WebElement>) driver.findElements(By.xpath(variables.getProperty("Contacts_FirstNameFull_Sort_XPATH")));
		Integer ActualResult9 = Search4.size();
		Integer ExpectedResult9 = 1;
		Assert.assertEquals(ActualResult9, ExpectedResult9);
		
		
		
		
	}*/
	

}
