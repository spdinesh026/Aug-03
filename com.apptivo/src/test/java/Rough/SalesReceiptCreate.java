package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.AppBase;
import Extent.ExtentListeners;

public class SalesReceiptCreate extends AppBase {

	@Test(priority = 1)
	public void Login() {

		values("UserEmail_XPATH", "sir04@berijam.com");
		ExtentListeners.test.log(Status.INFO, "Entering name");
		values("UserPassword_XPATH", "Test123$");
		click("SignIn_XPATH");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.getProperty("FirmUser"))));
	}

	@Test(priority = 2 , invocationCount=5000)
	public void CreateSales() {

		driver.get("https://staging.apptivo.net/app/salesreceipts.jsp#/create/34/0/3/");
		click("Customer_Search_XPATH");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(variables.getProperty("Customer_Select_XPATH"))));
		click("Customer_Select_XPATH");
		/*
		 * WebElement serviceline =
		 * driver.findElement(By.xpath(variables.getProperty("Service_Line_XPATH")));
		 * ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);", serviceline);
		 * click("Service_Line_XPATH"); try { Thread.sleep(500); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } values("Service_Taskname1_XPATH", "Testservice" +
		 * random.nextInt());
		 * //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.
		 * getProperty("Service_Taskhour1_XPATH")))); WebElement servicetaskhour1 =
		 * driver.findElement(By.xpath(variables.getProperty("Service_Taskhour1_XPATH"))
		 * ); ((JavascriptExecutor) driver).executeScript("arguments[0].value='2'",
		 * servicetaskhour1);
		 * 
		 * //values("Service_Taskhour1_XPATH", "2");
		 * //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.
		 * getProperty("Service_Taskrate2_XPATH")))); WebElement servicetaskrate1 =
		 * driver.findElement(By.xpath(variables.getProperty("Service_Taskrate2_XPATH"))
		 * ); ((JavascriptExecutor) driver).executeScript("arguments[0].value='24.22'",
		 * servicetaskrate1);
		 * 
		 * //values("Service_Taskrate2_XPATH", "24.22"); click("Service_Line_XPATH");
		 * //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.
		 * getProperty("Service_Taskname2_XPATH"))));
		 * 
		 * values("Service_Taskname2_XPATH", "Testservicesec" + random.nextInt());
		 * //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.
		 * getProperty("Service_Taskhour3_XPATH")))); WebElement servicetaskhour2 =
		 * driver.findElement(By.xpath(variables.getProperty("Service_Taskhour3_XPATH"))
		 * ); ((JavascriptExecutor) driver).executeScript("arguments[0].value='5'",
		 * servicetaskhour2);
		 * 
		 * //values("Service_Taskhour3_XPATH", "5");
		 * //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.
		 * getProperty("Service_Taskrate4_XPATH")))); WebElement servicetaskrate2 =
		 * driver.findElement(By.xpath(variables.getProperty("Service_Taskrate4_XPATH"))
		 * ); ((JavascriptExecutor) driver).executeScript("arguments[0].value='12'",
		 * servicetaskrate2);
		 * 
		 * //values("Service_Taskrate4_XPATH", "12");
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.
		 * getProperty("Promo_XPATH"))));
		 */
		WebElement serviceline = driver.findElement(By.xpath(variables.getProperty("Item_Line_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", serviceline);
		click("Item_Line_XPATH");
		click("Item_Search_XPATH");
		click("Item_Selet_XPATH");

		WebElement createsales = driver.findElement(By.xpath(variables.getProperty("Create_Sales_XPATH")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createsales);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(variables.getProperty("Create_Sales_XPATH"))));
		click("Create_Sales_XPATH");

	}

}
