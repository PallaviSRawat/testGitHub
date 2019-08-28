package testProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class One_WebDriverExample {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		ChromeOptions objChromeExt=new ChromeOptions();
		objChromeExt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		objChromeExt.setExperimentalOption("useAutomationExtension",false);
		
		WebDriver driver=new ChromeDriver(objChromeExt);
		String baseUrl="https://www.bbc.com";
		String expectedTitle="BBC - Homepage";
		String actualTitle="";
		
		driver.get(baseUrl);
		
		actualTitle=driver.getTitle();
		System.out.println("Actual Title: "+actualTitle);
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("pass");
			
		}else {
			System.out.println("Fails");
		}
//		driver.get("https://www.google.com/");
		driver.close();
	}
}





