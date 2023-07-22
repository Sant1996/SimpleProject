package test1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Current IST Time");
		
		List<WebElement> optns = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		
		String st = "current ist time";
		Thread.sleep(3000);
		int count=optns.size();
		for(int i=0;i<count;i++)
		{
			String text = optns.get(i).getText();
			if(st.equalsIgnoreCase(text))
			{
				optns.get(i).click();
				break;
			}
		}
		String act = driver.findElement(By.xpath("//div[@class='gsrt vk_bk FzvWSb YwPhnf']")).getText();
		System.out.println(act);
		
		String act1 = act.substring(0, 4);
		System.out.println(act1);
		
		DateFormat d1=new SimpleDateFormat("hh:mm:ss");
		Date d=new Date();
		String exp = d1.format(d);
		System.out.println(exp);
		String exp1 = exp.substring(0, 4);
		
		
        Assert.assertEquals(exp, act);
        driver.close();
		
	}

}
