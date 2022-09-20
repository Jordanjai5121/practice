package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Selenium\\src\\Driver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
			driver.findElementById("email").sendKeys("jordanjai1928@gmail.com",Keys.TAB);
			driver.findElementById("pass").sendKeys("premrajjai",Keys.TAB);
//			WebElement usrname=driver.findElement(By.xpath("//input[@type='text']"));
			WebElement usrname=driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
			usrname.getText();
			String atri=usrname.getAttribute("placeholder");
			System.out.println(atri);
			WebElement pas=driver.findElementByXPath("//input[@type='password']");
			
			String atri2=pas.getAttribute("aria-label-password");
			System.out.println(atri2);
			driver.findElementByName("login").click();
			
	}

}
