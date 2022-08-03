package Rough;

import static io.restassured.RestAssured.given;

import java.time.Duration;

import javax.mail.internet.ContentType;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.AppBase;
import Extent.ExtentListeners;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ApiRough extends AppBase {

	public static String key1;

	@Test(priority = 1)
	public void Login() {

		/*
		 * values("UserEmail_XPATH", "kmn03a@berijam.com");
		 * ExtentListeners.test.log(Status.INFO, "Entering name");
		 * values("UserPassword_XPATH", "Test123$"); click("SignIn_XPATH");
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(variables.
		 * getProperty("FirmUser"))));
		 */

		/*
		 * ((JavascriptExecutor)
		 * driver).executeScript("console.log('userData.sessionKey')"); String key1 =
		 * (String) ((JavascriptExecutor)
		 * driver).executeScript("return userData.sessionKey;");
		 * System.out.println(key1);
		 */

		values("Firstname_XPATH", "Test2");
		values("Lasttname_XPATH", "Live");
		values("Email_XPATH", "rain" + random.nextInt() + "@berijam.com");
		//values("Email_XPATH", "ran57@berijam.com");
		values("Password_XPATH", "Test123$");
		click("signup_XPATH");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(variables.getProperty("Welcome_XPATH"))));
		values("Businessname_XPATH", "Auto Test");
		values("Businessphone_XPATH", "9876543210");
		click("Businesscag_XPATH");
		click("BusinessCagVal_XPATH");
		click("Country_XPATH");
		click("CountryValue_XPATH");
		click("Timezone_XPATH");
		click("TimezoneValue_XPATH");
		click("User_XPATH");
		click("Demo_XPATH");
		click("Started_XPATH");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(variables.getProperty("Tooltip_XPATH"))));
		click("TooltipSkip_XPATH");

		String FirmId = (String) ((JavascriptExecutor) driver).executeScript("return userData.emailId;");
		System.out.println("Firm Id -" + FirmId);
		System.out.println("Password - Test123$");

		long userid = (long) ((JavascriptExecutor) driver).executeScript("return userData.userId;");
		key1 = (String) ((JavascriptExecutor) driver).executeScript("return userData.sessionKey;");
		System.out.println("Session Key " + key1);

		RestAssured.baseURI = "https://dpandiaraja:p1if6p@staging.apptivo.net";

		/*
		 * String response = given().header("Accept",
		 * ContentType.JSON.getAcceptHeader()).body(
		 * "\"{\"a\":\"sl\",\"emailId\":\"sir05@berijam.com\",\"isWebLogin\":\"true\",\"pwd\":\"Test123$\"}}\"")
		 * .filter(session).when().post("/app/loginservlet").then().statusCode(200).
		 * extract().asString();
		 * 
		 * System.out.println(response);
		 */

		// given().get("https://staging.apptivo.net/app/login.jsp");

		/*
		 * String response = given() .header("Accept",
		 * ContentType.JSON.getAcceptHeader()).queryParams("a", "save")
		 * .queryParams("employeeData",
		 * EmployeePayload.createEmployee()).queryParams("apiKey",
		 * "a6ba35e4-b1e1-43ff-97d2-feebb258a1c8").queryParams("accessKey"
		 * ,"2762h51a8f8W81JRm18d8V4f99k38176") .when()
		 * .log().all().post("/app/dao/v6/employees").asString();
		 * 
		 * System.out.println("Response"+response);
		 * 
		 * JsonPath js =new JsonPath(response); String access = js.getString(response);
		 * System.out.println(access);
		 */

		/*
		 * String response = given() .header("Accept",
		 * ContentType.JSON.getAcceptHeader()).queryParams("a", "save")
		 * .queryParams("employeeData",
		 * EmployeePayload.createEmployee()).queryParams("sessionKey",key1) .when()
		 * .log().all().post("/app/dao/v6/employees").asString();
		 * 
		 * System.out.println(response);
		 */

		String response = given().urlEncodingEnabled(false).log().all().queryParams("a", "deleteAccount")
				.queryParam("reqUserId", userid).queryParams("canContact", "Y")
				.queryParam("deleteReason", "%7B%22id%22:%5B%5D%7D").queryParams("sessionKey", key1).when().log().all()
				.get("/app/dao/appsservlet").asString();

		System.out.println(response);

		/*
		 * JsonPath js =new JsonPath(response); String access =
		 * js.getString("data.employeeId");
		 * 
		 * System.out.println("Employee Id " +access);
		 */
	}

}
