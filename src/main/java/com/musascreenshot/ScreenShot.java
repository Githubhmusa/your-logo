package com.musascreenshot;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static String captureScreenShot(WebDriver driver, String ScreenShotName) throws Exception{
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Date date = new Date();
	   String dateTime = dateFormat.format(date.getTime());
		//String destination=".//RCO_Regression/Screenshot"+ScreenShotName+"-"+dateTime+".png";
		String destination=currentDir +"//screenShot//"+dateTime+"//" +ScreenShotName + ".png";
		FileUtils.copyFile(source, new File(destination));
		
		System.out.println("Screen shot taken");
		
		return destination;
	
	      }
}


//-----------------------------------------------------------
//https://github.com/jahidulusa/SmartTech_Jahid_Automation/blob/master/src/test/java/com/jahid/smarttech/ScreenShot.java  ===for screen shot java from github
//package com.musascreenshot;
//import java.io.File;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//public class ScreenShot {
//WebDriver driver;
//public static String captureScreenShot("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe") throws Exception{
//public static String captureScreenShot(WebDriver driver, String ScreenShotName) throws Exception{	

//TakesScreenshot ts =(TakesScreenshot)driver;
//File source=ts.getScreenshotAs(OutputType.FILE);
//String currentDir = System.getProperty("user.dir");
//
////System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
////WebDriver driver = new ChromeDriver(); //fire fox
//driver.get("http://automationpractice.com/index.php");
//
//DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
//Date date = new Date();
//String dateTime = dateFormat.format(date.getTime());
//String destination=".//RCO_Regression/Screenshot"+ScreenShotName+"-"+dateTime+".png";
////String destination=currentDir +"//screenShot//"+dateTime+"//" +ScreenShotName + ".png";
//FileUtils.copyFile(source, new File(destination));
//
//System.out.println("Screen shot taken");
//
//return destination;  //
//---------------------------------------
//package com.jahid.smarttech;
//import java.io.File;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//public class ScreenShot {
//	
//	
//public static String captureScreenShot(WebDriver driver, String ScreenShotName) throws Exception{
//		
//		TakesScreenshot ts =(TakesScreenshot)driver;
//		File source=ts.getScreenshotAs(OutputType.FILE);
//		String currentDir = System.getProperty("user.dir");
//		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
//		Date date = new Date();
//	   String dateTime = dateFormat.format(date.getTime());
//		//String destination=".//RCO_Regression/Screenshot"+ScreenShotName+"-"+dateTime+".png";
//		String destination=currentDir +"//screenShot//"+dateTime+"//" +ScreenShotName + ".png";
//		FileUtils.copyFile(source, new File(destination));
//		
//		System.out.println("Screen shot taken");
//		
//		return destination;
//	
//	      }
//}
