package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	public static WebDriver getChromeDriver(String a)
	{
		if(a.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();    // Here we are using WebDriverManager to set chromedriver

			//System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browsers\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browsers\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browsers\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browsers\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browsers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();     //upcasting
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			return driver;
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\Browsers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();     //upcasting
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			return driver;
		}	
		
		
		
		
	}
}
