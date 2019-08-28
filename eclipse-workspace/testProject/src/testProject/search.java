package testProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class search {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		ChromeOptions objChromeExt=new ChromeOptions();
		objChromeExt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		objChromeExt.setExperimentalOption("useAutomationExtension",false);
		
		WebDriver driver=new ChromeDriver(objChromeExt);
		driver.get("https://www.google.com/");
//		driver.close();
	}
}
