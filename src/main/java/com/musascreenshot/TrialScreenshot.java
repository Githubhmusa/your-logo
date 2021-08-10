package com.musascreenshot;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TrialScreenshot {

	public static void main(String[] args) throws Exception{ 
//		TakesScreenshot ts =(TakesScreenshot)driver;
//		File source=ts.getScreenshotAs(OutputType.FILE);
//		String currentDir = System.getProperty("user.dir");
//		
		//set the path to the chrome driver executabe
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		//instantiate a chrome session
		WebDriver driver = new ChromeDriver(); //fire fox
		//open browser and go to home page
		driver.get("http://automationpractice.com/index.php");
		//declare implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	

    driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
    WebElement abc = driver.findElement(By.xpath("(//*[contains(text(),'Authentication')])[1]"));
            // Explicit wait below giving
    WebDriverWait wait = new WebDriverWait(driver, 30);
    wait.until(ExpectedConditions.visibilityOf(abc));
	
		//System.out.println("Screen shot taken");
		System.out.println(ScreenShot.captureScreenShot(driver, "automationpractice"));
		//return destination;
	}

	}


