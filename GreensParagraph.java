package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensParagraph {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Selenium\\src\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://greenstech.in/selenium-course-content.html");
//		System.out.println("velmurugan");
		WebElement header =driver.findElementByXPath("/html/body/section[1]/div/div/div[1]/div/p[2]");
		String text=header.getText();
		System.out.println("velmurugan " +text);
		driver.quit();
}

}
