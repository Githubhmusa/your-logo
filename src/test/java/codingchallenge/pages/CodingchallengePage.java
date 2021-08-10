package codingchallenge.pages;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import org.openqa.selenium.By;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CodingchallengePage {
      //private WebDriver driver;
      // WebDriver driver;		
       WebDriver driver;	
  
       public CodingchallengePage(WebDriver driver) {
    	     PageFactory.initElements(driver,this);             // home page-------1
     	} 	  	 
   	
	
	@FindBy(how = How.XPATH,using = "//*[@class=\"login\"]")//-----------------2
	private static WebElement signin;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"email\"]")      //--------------------3a
	private static WebElement Emailaddress;
	
	@FindBy(how = How.XPATH,using = "//*[@type=\"password\"]")      //---------------3b
	private static WebElement password;
	
	@FindBy(how = How.XPATH,using = "//*[contains(@class,'icon-lock left')]")//-------4
	private static WebElement signinBtn;

	@FindBy(how = How.XPATH,using="(//*[@title='Dresses'])[2]")   //-------------------7
	private static WebElement DressesBtn;
	
	@FindBy(how = How.XPATH,using="//*[@id='history']")    //--------------------------6
	//using = "//*[@class=\"account\"]")//*[@alt="My Store"]//*[@id='history']
     private static WebElement welcomeWord;
	
	 //@FindBy(how = How.XPATH,using="(//*[contains(text(),'Proceed to checkout')])")
	 //private static WebElement click;
	
	// @FindBy(how = How.XPATH,using = "//*[@class='logout']") //-------------13a,13b or 14
	// private static WebElement signout;
	
	
//	 @FindBy(how = How.XPATH,using = "//*[@id='my-account']") //-----0
//   private static WebElement Dresses;

//   @FindBy(how = How.XPATH,using = "//*[@for='selectProductSort']") //-----0
//   private static WebElement sortby;
	
//	 @FindBy(how = How.XPATH,using = "//*[@class='product-desc']/following-sibling::div[1]")
//    private static WebElement sortby;
	
//   @FindBy(how = How.XPATH,using = " (//*[@itemprop=\"price\"])[2]") 
//   private static WebElement prize2;
	
//   @FindBy(how = How.XPATH,using = "//*[@id='total_price']")
//   private static WebElement prize3;
	
//	 @FindBy(how = How.XPATH,using="//*[@id='category']")
//	 private static WebElement checkoutprize4;
	
//   @FindBy(how = How.XPATH,using="//*[@title='Contact Us']")  //-----0 
//   private static WebElement title;
//    @FindBy(how = How.XPATH,using="//*[@for='selectProductSort']")
//    private static WebElement sortby;//*[@for='selectProductSort']
	  //    using = "//*[@class='home']") //--------- 0
      //    using = "//*[@id=\"authentication\"]")  //---------0
      //private static WebElement title;
      // //*[@title='Dresses']     //*[@alt="My Store"]  //*[@class='logout'] (//*[@itemprop="price"])[2]
	
	
	
   
	public void clickOnSigninButton() {
	        signin.click();		                           //------------2	
	}

	public void enterEmailaddressAndPassword() {
		Emailaddress.sendKeys("musasamina607@gmail.com");  //------------3a
		password.sendKeys("Musasamina1969");               //------------3b
	}

	public void clickOnLoginButton() {                    
		signinBtn.click();                              //----4 (this is email and password Login button click)
	}
	
	public void clickUpperleftcornerDresses() {
		DressesBtn.click();                             //----------------7
	}
	
	public void verifyWelcomeWord() {		

		String expected = "Welcome";
		String actual = welcomeWord.getText().trim();  //-------------------5
        Assert.assertTrue("Word does not match",actual.contains(expected));
	}
	
	public void user_verify_the_page_title_as(String title) throws Throwable { 
	    String expected= title;  //---0
	    String actual= driver.getTitle().trim();  //----6
	    Assert.assertTrue("Title does not match",actual.contains(expected));//----6
    }

	public void clickOnSortedOrders()  {		

		//		//Thread.sleep(3000);
//		List<WebElement> AllPrices = driver.findElements(By.xpath("//*[@class='product-desc']/following-sibling::div[1]")); /*(actualTitle));*/
//	   
//	      ArrayList<String> NewList = new ArrayList<String>();
//           for (int i = 0; i < AllPrices.size(); i++) {
//              NewList.add(AllPrices.get(i).getText().toString());
//           }
//		 
//		//sorting ArrayList in desending order;
//		Collections.sort(NewList, Collections.reverseOrder());
//		System.out.println("List of the prices in sorted order: " + NewList);
//		
//		String SecondPrice = NewList.get(1);
//		System.out.println("Price of second dress: " + SecondPrice);
//		
//		driver.findElement(By.xpath("(//*[contains(text(),'" + SecondPrice + "')])[2] ")).click();
//		//Thread.sleep(3000);
//		driver.findElement(By.xpath("(//*[contains(text(),'Proceed to checkout')])")).click();
//
//		
//		//driver.findElement(By.xpath("(//*[@id='category'])")).click();
//		
//		Double expected = Double.parseDouble(SecondPrice.replace("$", "")) + 2;
//		System.out.println("The Expected price is: " + expected);
//		 
//		// Double actual = Double.parseDouble(driver.findElement(By.xpath("//*[@id='total_price']")).getText().replace("$", ""));
//         //Assert.assertTrue("Price does not match", actual.equals(expected));
//      
//        driver.findElement(By.xpath("//*[@id='total_price']")).click();
//		 //String actual= driver.getTitle().trim();  
//		 // driver.findElement(By.xpath("//*[@class='logout']")).click();
//		// sortby.click();
//        // checkoutprize4.click();
          //driver.quit();
	
    
	}
  
	public void clickHightestFirst() {
	//checkoutprize4.click();
	}
	
	public void clickAddToCart() {
		//click.click();
     }

	public void clickTotelPriceWithShipping() {
		//prize3.click();
	}
	
	public void clickSecondDress() {
		//prize2.click();
	}  
	
	public void SignOut() {
		//welcomeWord.click();
     	//signout.click();	 
     	//driver.quit();               // ---------------------------------13a,13b or 14
	}

	public void CloseBrowser() {
		//driver.close();
		//driver.quit();	
   }
}	
	
//------------------------------------------------------------------	

//@FindBy(how = How.XPATH,using = "//*[@name=\"txtUsername\"]")
//private static WebElement username;
//@FindBy(how = How.XPATH,using = "//*[@name=\"txtPassword\"]")
//private static WebElement password;
//@FindBy(how = How.XPATH,using = "//*[@type='submit']")
//private static WebElement loginBtn;
//@FindBy(how = How.XPATH,using = "//*[@id=\"my-account\"]")
//private static WebElement welcomeWord;
//@FindBy(how = How.XPATH,using = "//*[@href=\"/index.php/auth/logout\"]")
//private static WebElement logoutBtn;

//public void enterUsernameAndPassword() {
//	username.sendKeys("Admin");
//	password.sendKeys("admin123");
//}
//public void clickOnLoginButton() {
//	loginBtn.click();
//}
//public void verifyWelcomeWord1() {
//	String expected = "Welcome";
//	String actual = welcomeWord.getText().trim();
//	Assert.assertTrue("Word does not match",actual.contains(expected));
//}
// public void verifyUserName() {
//	String expected = "Welcome";
//	String actual = welcomeWord.getText().trim();
//	Assert.assertTrue("Word does not match",actual.contains(expected));
//}
//public void logOut() {
//	welcomeWord.click();
//	logoutBtn.click();	
//}}
//-------------------------------------------
//package coadingchallange.pages;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;

//public class CoadingchallangePage {
//       WebDriver driver;		
//	     private WebElement welcomePage;
//
//      public CoadingchallangePage(WebDriver driver) {	
//		PageFactory.initElements(driver, this); 
//}
//
//   @FindBy (how = How.XPATH,using = "//*[@class='login']")
//   private static WebElement SignInButton;
//
//   @FindBy (how = How.XPATH,using = "//*[@id='email']" )
//   private static WebElement emailaddress;
//
//   @FindBy (how = How.XPATH,using = "//*[@type='password']")      
//	 private static WebElement password;
//
//   @FindBy (how = How.XPATH,using = "//*[@id='SubmitLogin']")
//   private static WebElement SignInBtn1; 
//
//  // @FindBy (how = How.XPATH,using = "//*[@title = 'Contact Us']")
//  // private static WebElement welcomePage1;
//
//   @FindBy (how = How.XPATH,using = "(//*[@title='Dresses'])[2]")   
//   private static WebElement DressesBtn;
//
//   @FindBy (how = How.XPATH, using= ("//[@class='product-desc']/following-sibling::div[1]")) /(actualTitle));*/
//   private static WebElement price5;
//	
 
//  public void clickOnSignInButton() {
//	   SignInButton.click();	
//	}
//
//  public void enterEmailAddressAndPassword() {
//    emailaddress.sendKeys("zamankabir1571@gmail.com");
//	  password.sendKeys("Tanishatayma1$");
//  }
//
//  public void userClickOnSignInButton() {
//	   SignInBtn1.click();
//	}
//
//  public void userNevigateToWelcomePage() {
//     welcomePage.click();
//   }
//
//  public void clickOnTheUpperLeftCornerDresses() {
//     DressesBtn.click(); 
//	}
//  public void pricevaluedecendingshortedorder() {
//	List<WebElement> AllPrices = driver.findElements(By.xpath("//[@class='product-desc']/following-sibling::div[1]")); /(actualTitle));*/
//    ArrayList<String> NewList = new ArrayList<String>();
//       
//		    for (int i = 0; i < AllPrices.size(); i++) {
//            NewList.add(AllPrices.get(i).getText().toString());
//            }
//		 
//		//sorting ArrayList in desending order;
//		Collections.sort(NewList, Collections.reverseOrder());
//    System.out.println("List of the prices in sorted order: " + NewList);
//		
//    String SecondPrice = NewList.get(1);
//		System.out.println("Price of second dress: " + SecondPrice);
//		
//		driver.findElement(By.xpath("(//*[contains(text(),'" + SecondPrice + "')])[2] ")).click();
//		//Thread.sleep(3000);
//		//driver.findElement(By.xpath("(//*[contains(text(),'Proceed to checkout')])")).click();
//
//		driver.findElement(By.xpath("(//*[@id='category'])")).click();
//		
//		
//		Double expected = Double.parseDouble(SecondPrice.replace("$", "")) + 2;
//		System.out.println("The Expected price is: " + expected);
//		
//		driver.findElement(By.xpath("//*[@class='logout']")).click();
//		
//	 price5.click();	
//	 
//	 driver.quit();
//	}
//
//   public void SelectTheSecondDressFromTheList() {
//    }
//
//   public void ClickOnAddToCart() {
//    }
//
//   public void verifyTotalPriceWithShippingIsThere() {
//	  }
//
//   public void signOut() {
//	  }
