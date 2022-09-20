package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechParag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Selenium\\src\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.greenstechnologys.com/");
		WebElement header =driver.findElementByXPath("//*[@id=\"article-wrapper\"]/p[2]");
		String text=header.getText();
		System.out.println(text);
		driver.quit();

	}

}
