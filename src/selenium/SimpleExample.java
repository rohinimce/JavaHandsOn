package selenium;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SimpleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public void seleniumAction() {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "");
	driver=new ChromeDriver();
	driver.get("");
	driver.findElement(By.id("abd")).click();
}
}