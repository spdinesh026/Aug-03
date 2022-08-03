package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.AppBase;
import Extent.ExtentListeners;

public class OneFirmData extends AppBase {

	@Test(priority = 1)
	public void Login() {

		values("UserEmail_XPATH", "automationapp01@berijam.com");
		ExtentListeners.test.log(Status.INFO, "Entering name");
		values("UserPassword_XPATH", "Test123$");
		click("SignIn_XPATH");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.getProperty("FirmUser"))));
	}

	@Test(priority = 2)
	public void contacts() {
		driver.get(config.getProperty("ContactsApp"));
		ExtentListeners.test.log(Status.INFO, "Navigating to ContactsApp");
		values("Contacts_Search_XPATH", "cool");
		click("Contacts_SearchIcon_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Contacts_Search_Result_XPATH"))));
		String Expectedresult = driver.findElement(By.xpath(variables.getProperty("Contacts_Search_Result_XPATH")))
				.getText();
		String Actualresult = "Search Results (1)";
		Assert.assertEquals(Actualresult, Expectedresult);
		click("Contacts_SearchSaveViews_XPATH");
		values("Contacts_SearchViewName_XPATH", "Temp");
		click("Contacts_SearchViewSave_XPATH");
		WebElement myview = driver.findElement(By.xpath(variables.getProperty("Contacts_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview);
		click("Contacts_Myviews_XPATH");
		click("Contacts_SavedView_XPATH");
		click("Contacts_SavedViewDelete_CSS");
		click("Contacts_SavedViewDelconfirm_XPATH");
		click("Contacts_AdvSearch_XPATH");
		values("Contacts_AdvFirstName_XPATH", "cool");
		click("Contacts_AdvSearch_Icon_CSS");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Contacts_Search_Result_XPATH"))));
		String Expectedresult1 = driver.findElement(By.xpath(variables.getProperty("Contacts_Search_Result_XPATH")))
				.getText();
		String Actualresult1 = "Search Results (1)";
		Assert.assertEquals(Actualresult1, Expectedresult1);
		click("Contacts_SearchSaveViews_XPATH");
		values("Contacts_SearchViewName_XPATH", "Temp");
		click("Contacts_AdvsearchViewSave_XPATH");
		WebElement myview1 = driver.findElement(By.xpath(variables.getProperty("Contacts_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview1);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.getProperty("Contacts_Myviews_XPATH"))))
				.click();

		isElementPresent("Contacts_Myviews_XPATH");
		click("Contacts_SavedView_XPATH");
		click("Contacts_SavedViewDelete_CSS");
		click("Contacts_SavedViewDelconfirm_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(config.getProperty("assertApp_CSS"))));
		driver.findElement(By.cssSelector(config.getProperty("assertApp_CSS"))).click();
		click("Contacts_Filter_XPATH");
		click("Contacts_FilterClear_XPATH");
		click("Contacts_FilterCheckbox_XPATH");
		click("Contacts_FilterApply_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Contacts_Filter_Result_XPATH"))));
		String Expectedresult2 = driver.findElement(By.xpath(variables.getProperty("Contacts_Filter_Result_XPATH")))
				.getText();
		String Actualresult2 = "Show All (1)";
		Assert.assertEquals(Actualresult2, Expectedresult2);

	}

	@Test(priority = 3)
	public void customers() {
		driver.get(config.getProperty("CustomersApp"));
		ExtentListeners.test.log(Status.INFO, "Navigating to CustomersApp");
		values("Customers_Search_XPATH", "cool");
		click("Customers_SearchIcon_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Customers_Search_Result_XPATH"))));
		String Expectedresult = driver.findElement(By.xpath(variables.getProperty("Customers_Search_Result_XPATH")))
				.getText();
		String Actualresult = "Search Results (1)";
		Assert.assertEquals(Actualresult, Expectedresult);
		click("Customers_SearchSaveViews_XPATH");
		values("Customers_SearchViewName_XPATH", "Temp");
		click("Customers_SearchViewSave_XPATH");

		WebElement myview = driver.findElement(By.xpath(variables.getProperty("Customers_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview);
		click("Customers_Myviews_XPATH");
		click("Customers_SavedView_XPATH");
		click("Customers_SavedViewDelete_CSS");
		click("Customers_SavedViewDelconfirm_XPATH");
		click("Customers_AdvSearch_XPATH");
		// isElementPresent("Customers_AdvName_XPATH", "cool");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Customers_AdvName_XPATH"))))
				.sendKeys("cool");
		click("Customers_AdvSearch_Icon_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Customers_Search_Result_XPATH"))));
		String Expectedresult1 = driver.findElement(By.xpath(variables.getProperty("Customers_Search_Result_XPATH")))
				.getText();
		String Actualresult1 = "Search Results (1)";
		Assert.assertEquals(Actualresult1, Expectedresult1);
		click("Customers_SearchSaveViews_XPATH");
		values("Customers_SearchViewName_XPATH", "Temp");
		click("Customers_SearchViewSave_XPATH");
		WebElement myview1 = driver.findElement(By.xpath(variables.getProperty("Customers_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview1);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.getProperty("Customers_Myviews_XPATH"))))
				.click();

		isElementPresent("Customers_Myviews_XPATH");
		click("Customers_SavedView_XPATH");
		click("Customers_SavedViewDelete_CSS");
		click("Customers_SavedViewDelconfirm_XPATH");

	}

	@Test(priority = 4)
	public void Leads() {
		driver.get(config.getProperty("LeadsApp"));
		ExtentListeners.test.log(Status.INFO, "Navigating to LeadsApp");

		values("Leads_Search_XPATH", "cool");
		click("Leads_SearchIcon_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Leads_Search_Result_XPATH"))));
		String Expectedresult = driver.findElement(By.xpath(variables.getProperty("Leads_Search_Result_XPATH")))
				.getText();
		String Actualresult = "(1)";
		Assert.assertEquals(Actualresult, Expectedresult);
		click("Leads_SearchSaveViews_XPATH");
		values("Leads_SearchViewName_XPATH", "Temp");
		click("Leads_SearchViewSave_XPATH");

		WebElement myview = driver.findElement(By.xpath(variables.getProperty("Leads_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview);
		click("Leads_Myviews_XPATH");
		click("Leads_SavedView_XPATH");
		click("Leads_SavedViewDelete_CSS");
		click("Leads_SavedViewDelconfirm_XPATH");

		click("Leads_AdvSearch_XPATH");

		WebElement referrer = driver.findElement(By.xpath(variables.getProperty("Leads_AdvStatusDrop_XPATH")));
		Actions actions = new Actions(driver);
		actions.doubleClick(referrer).perform();
		click("Leads_AdvStatus_XPATH");

		click("Leads_AdvSearch_Icon_XPATH");

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Leads_Search_Result_XPATH"))));
		String Expectedresult1 = driver.findElement(By.xpath(variables.getProperty("Leads_Search_Result_XPATH")))
				.getText();
		String Actualresult1 = "(1)";
		Assert.assertEquals(Actualresult1, Expectedresult1);
		click("Leads_SearchSaveViews_XPATH");
		values("Leads_SearchViewName_XPATH", "Temp");
		click("Leads_SearchViewSave_XPATH");
		WebElement myview1 = driver.findElement(By.xpath(variables.getProperty("Leads_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview1);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.getProperty("Leads_Myviews_XPATH"))))
				.click();

		isElementPresent("Leads_Myviews_XPATH");
		click("Leads_SavedView_XPATH");
		click("Leads_SavedViewDelete_CSS");
		click("Leads_SavedViewDelconfirm_XPATH");

	}

	@Test(priority = 5)
	public void Opportunities() {
		driver.get(config.getProperty("OpportunitiesApp"));
		ExtentListeners.test.log(Status.INFO, "Navigating to LeadsApp");
		values("Oppos_Search_XPATH", "cool");
		click("Oppos_SearchIcon_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Oppos_Search_Result_XPATH"))));
		String Expectedresult = driver.findElement(By.xpath(variables.getProperty("Oppos_Search_Result_XPATH")))
				.getText();
		String Actualresult = "Search Results (1)";
		Assert.assertEquals(Actualresult, Expectedresult);
		click("Oppos_SearchSaveViews_XPATH");
		values("Oppos_SearchViewName_XPATH", "Temp");
		click("Oppos_SearchViewSave_XPATH");

		WebElement myview = driver.findElement(By.xpath(variables.getProperty("Oppos_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview);
		click("Oppos_Myviews_XPATH");
		click("Oppos_SavedView_XPATH");
		click("Oppos_SavedViewDelete_CSS");
		click("Oppos_SavedViewDelconfirm_XPATH");
		click("Oppos_AdvSearch_XPATH");
		// isElementPresent("Customers_AdvName_XPATH", "cool");
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(variables.getProperty("Oppos_AdvName_XPATH"))))
				.sendKeys("cool");
		;
		click("Oppos_AdvSearch_Icon_XPATH");
		String Expectedresult1 = driver.findElement(By.xpath(variables.getProperty("Oppos_Search_Result_XPATH")))
				.getText();
		String Actualresult1 = "Search Results (1)";
		Assert.assertEquals(Actualresult1, Expectedresult1);
		click("Oppos_SearchSaveViews_XPATH");
		values("Oppos_SearchViewName_XPATH", "Temp");
		click("Oppos_SearchViewSave_XPATH");
		WebElement myview1 = driver.findElement(By.xpath(variables.getProperty("Oppos_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview1);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.getProperty("Oppos_Myviews_XPATH"))))
				.click();

		// isElementPresent("Oppos_Myviews_XPATH");
		click("Oppos_SavedView_XPATH");
		click("Oppos_SavedViewDelete_CSS");
		click("Oppos_SavedViewDelconfirm_XPATH");

	}

	@Test(priority = 6)
	public void Orders() {
		driver.get(config.getProperty("OrdersApp"));
		ExtentListeners.test.log(Status.INFO, "Navigating to Orders");
		values("Orders_Search_XPATH", "cool");
		click("Orders_SearchIcon_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Orders_Search_Result_XPATH"))));
		String Expectedresult = driver.findElement(By.xpath(variables.getProperty("Orders_Search_Result_XPATH")))
				.getText();
		String Actualresult = "Search Results (1)";
		Assert.assertEquals(Actualresult, Expectedresult);
		click("Orders_SearchSaveViews_XPATH");
		values("Orders_SearchViewName_XPATH", "Temp");
		click("Orders_SearchViewSave_XPATH");

		WebElement myview = driver.findElement(By.xpath(variables.getProperty("Orders_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview);
		click("Orders_Myviews_XPATH");
		click("Orders_SavedView_XPATH");
		click("Orders_SavedViewDelete_CSS");
		click("Orders_SavedViewDelconfirm_XPATH");
		click("Orders_AdvSearch_XPATH");
		// isElementPresent("Customers_AdvName_XPATH", "cool");
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(variables.getProperty("Orders_AdvName_XPATH"))))
				.sendKeys("1000");
		;
		click("Orders_AdvSearch_Icon_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Orders_Search_Result_XPATH"))));
		String Expectedresult1 = driver.findElement(By.xpath(variables.getProperty("Orders_Search_Result_XPATH")))
				.getText();
		String Actualresult1 = "Search Results (1)";
		Assert.assertEquals(Actualresult1, Expectedresult1);
		click("Orders_SearchSaveViews_XPATH");
		values("Orders_SearchViewName_XPATH", "Temp");
		click("Orders_AdvSearchViewSave_XPATH");
		WebElement myview1 = driver.findElement(By.xpath(variables.getProperty("Orders_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview1);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.getProperty("Orders_Myviews_XPATH"))))
				.click();

		// isElementPresent("Oppos_Myviews_XPATH");
		click("Orders_SavedView_XPATH");
		click("Orders_SavedViewDelete_CSS");
		click("Orders_SavedViewDelconfirm_XPATH");

	}
	
	@Test(priority = 7)
	public void Cases() {
		driver.get(config.getProperty("CasesApp"));
		ExtentListeners.test.log(Status.INFO, "Navigating to Cases");
		values("Cases_Search_XPATH", "cool");
		click("Cases_SearchIcon_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Cases_Search_Result_XPATH"))));
		String Expectedresult = driver.findElement(By.xpath(variables.getProperty("Cases_Search_Result_XPATH")))
				.getText();
		String Actualresult = "Search Results (1)";
		Assert.assertEquals(Expectedresult, Actualresult);
		click("Cases_SearchSaveViews_XPATH");
		values("Cases_SearchViewName_XPATH", "Temp");
		click("Cases_SearchViewSave_XPATH");

		WebElement myview = driver.findElement(By.xpath(variables.getProperty("Cases_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview);
		click("Cases_Myviews_XPATH");
		click("Cases_SavedView_XPATH");
		click("Cases_SavedViewDelete_CSS");
		click("Cases_SavedViewDelconfirm_XPATH");
		click("Cases_AdvSearch_XPATH");
		// isElementPresent("Customers_AdvName_XPATH", "cool");
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(variables.getProperty("Cases_AdvName_XPATH"))))
				.sendKeys("1");
		click("Cases_AdvSearch_Icon_XPATH");
		Actions actions = new Actions(driver);
		String Expectedresult1 = driver.findElement(By.xpath(variables.getProperty("Cases_Search_Result_XPATH")))
				.getText();
		String Actualresult1 = "Search Results (1)";
		Assert.assertEquals(Expectedresult1, Actualresult1);
		click("Cases_SearchSaveViews_XPATH");
		values("Cases_SearchViewName_XPATH", "Temp");
		click("Cases_SearchViewSave_XPATH");
		WebElement myview1 = driver.findElement(By.xpath(variables.getProperty("Cases_Myviews_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myview1);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.getProperty("Cases_Myviews_XPATH"))))
				;
		actions.click(myview1).perform();

		// isElementPresent("Cases_Myviews_XPATH");
		click("Cases_SavedView_XPATH");
		click("Cases_SavedViewDelete_CSS");
		click("Cases_SavedViewDelconfirm_XPATH");

	}

}
