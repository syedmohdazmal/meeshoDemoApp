package meesho.webautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MeeshoSignUpTest {
	WebDriver driver = null;

	@BeforeClass
	public void initMethod() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://meesho.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void signUp() throws InterruptedException {
		driver.findElement(By.xpath(
				"//div[@class='Card__BaseCard-sc-b3n78k-0 cWVjzZ TabWrapper-sc-1edf3ww-0 Header__StyledProfileMenu-sc-1qdannb-2 bdFBCn dmVzoI TabWrapper-sc-1edf3ww-0 Header__StyledProfileMenu-sc-1qdannb-2 bdFBCn dmVzoI']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='Text__StyledText-sc-oo0kvp-0 jNFjuh'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='Input__InputContainer-sc-1goybxj-0 bRwZjT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9701195395");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//button[@class='BaseButton-sc-1e0kf5s-0 dQddST Auth__StyledButton-sc-f9huj5-0 kGRPuy Auth__StyledButton-sc-f9huj5-0 kGRPuy']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//button[@class='BaseButton-sc-1e0kf5s-0 kVzEut OtpVerifystyled__StyledButton-sc-iajphr-0 bKJqoh OtpVerifystyled__StyledButton-sc-iajphr-0 bKJqoh']"))
				.click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//input[@class='Text__StyledText-sc-oo0kvp-0
		// ZkhsR TextSearch__Input-sc-n7qqmw-2 hPATZW search-input-elm
		// TextSearch__Input-sc-n7qqmw-2 hPATZW search-input-elm']")).sendKeys("wireless
		// head phone");
		// Thread.sleep(2000);

	}

	@AfterClass
	public void quitDriver() {
		driver.quit();
	}
}