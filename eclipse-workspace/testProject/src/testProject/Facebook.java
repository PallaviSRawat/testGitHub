package testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		ChromeOptions objChromeExt=new ChromeOptions();
		objChromeExt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		objChromeExt.setExperimentalOption("useAutomationExtension",false);
		
		WebDriver driver=new ChromeDriver(objChromeExt);
//		String baseUrl="https://www.bbc.com";
//		String expectedTitle="BBC - Homepage";
//		String actualTitle="";
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("pallavirawat11@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//li[12]/a/span/span")).click();
		
//		actualTitle=driver.getTitle();
//		System.out.println("Actual Title: "+actualTitle);
//		
//		if(actualTitle.contentEquals(expectedTitle)) {
//			System.out.println("pass");
//			
//		}else {
//			System.out.println("Fails");
//		}
//		driver.get("https://www.google.com/");
//		driver.close();
	}
}
