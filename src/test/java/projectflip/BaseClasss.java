package projectflip;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasss {

	
	public static WebDriver driver;
	
	
//	public static WebDriver chromeBrowser() {
//		 WebDriverManager.chromedriver().setup();
//		  driver =new ChromeDriver();
//		 return driver;
//	}
//	
//	public static  WebDriver edgeBrowser() {
//		WebDriverManager.edgedriver().setup();
//		return driver =new EdgeDriver();
//		}
	
	
	public static WebDriver browserLaunch(String browserName) {
		
		switch(browserName) {
		case "chrome":
			WebDriverManager.chromedriver().driverVersion("107").setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
		    driver =new EdgeDriver();
		    driver.manage().window().maximize();
		    break;
		case "firefox":
		     WebDriverManager.firefoxdriver().setup();
	         driver =new FirefoxDriver();
	         driver.manage().window().maximize();
		break;
		}
		return driver;
		
	}
	// url launch
	public static void urlLaunch(String url) {
	driver.get(url);
	}
	
	//send keys
	public static void sendkeys(WebElement e,String data) {
		e.sendKeys(data);
	}
	
	//click
	public static void click(WebElement e) {
		e.click();
	}
	
	// get title
	public static String getTitle() {
	String title =driver.getTitle();
	return title;
	}
	
	//get current url
	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
}
	//quit
	public static void quit() {
		driver.quit();
}
	//maximize
	public static void maximize() {
		driver.manage().window().maximize();
}
	//wait
	public static void implicityWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
}
	
	// find element
	public static WebElement findElement(String locatorName,String value) {
		WebElement values =null;
		if(locatorName.equals("id")) {
		values = driver.findElement(By.id(value));
		}
		else if (locatorName.equals("name")) {
		values = driver.findElement(By.name("value"));
		}
		else if (locatorName.equals("xpath")) {
		values = driver.findElement(By.xpath("value"));
		}
		return values;
		 }
	
	
	
	// get text
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;

	}
	//get attribute by value
	public static String getAttribute(WebElement e) {
	String attribute = e.getAttribute("value");
	return attribute;
	}
	
	// move to element
	public static void moveToElement(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
}
	//drag and drop
	public static  void dragAndDrop(WebElement src,WebElement target ) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, target).perform();
		}
	
	//select by index
	public static void selectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
}
	// double click
	public static  void doubleClick(WebElement e) {
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
	}
	// context click or right click
	public static void contextClick(WebElement e) {
		Actions a=new Actions(driver);
	}
	
	// Alert and accept
	public static void acceptAlert() {
    Alert al = driver.switchTo().alert();	
    al.accept();
}
	// Alert dismiss
	public static void dismissAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	// select by value
	private void selectByValue(WebElement e) {
    Select s=new Select(e);
    s.selectByValue("value");

	}
	// select by visible text
	private void selectByVisibleText(WebElement e) {
		Select s=new Select(e);
		s.selectByVisibleText("text");
}
	// get options
	private   void getOptions(WebElement e) {
		Select s=new Select(e);
       List<WebElement> options = s.getOptions();
        
	}
	
}	
	
