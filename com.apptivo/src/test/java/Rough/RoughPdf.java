package Rough;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoughPdf {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions cap = new ChromeOptions();
		cap.addArguments("headless");

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(cap);

		driver.get("file:///C:/Users/Dinesh/Desktop/AppLoading/08JUN22/report.html#totals");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Pdf pdf = ((PrintsPage) driver).print(new PrintOptions());
		Files.write(Paths.get("C:\\Users\\Dinesh\\Desktop\\AppLoading\\Report Pdf/08Jun22.pdf"), OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		
		driver.close();

	}

}
