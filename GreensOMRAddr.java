package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensOMRAddr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Selenium\\src\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement header =driver.findElementByXPath("/html/body/footer/div[1]/div[1]/div[2]/h6");
		WebElement header1 =driver.findElementByXPath("/html/body/footer/div[1]/div[1]/div[2]/ul/li/p");
		String text=header.getText();
		System.out.println("OMR Address: " +text);
		String text1=header1.getText();
		System.out.println(text1);
		driver.quit();
	}

}
