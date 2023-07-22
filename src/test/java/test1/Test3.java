package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement box = driver.findElement(By.name("q"));
		String s = box.getCssValue("font-size");
		String c = box.getCssValue("color");
		System.out.println(s);
		System.out.println(c);
	//	box.sendKeys("Ballari"+Keys.ENTER);
	//	box.sendKeys(Keys.ENTER);

	}

}
