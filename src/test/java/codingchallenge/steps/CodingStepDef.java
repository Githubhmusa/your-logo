package codingchallenge.steps;
//import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import codingchallenge.pages.CodingchallengePage;
//import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;

public class CodingStepDef {
	WebDriver driver;
	CodingchallengePage codingPage;	
	
	@Given("^user go to your logo homepage$")                     //----------------1
	public void user_go_to_your_logo_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");   
        driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); 
		codingPage = new CodingchallengePage(driver);
	}

	@Given("^click on the Sign in button$")
	public void click_on_the_Sign_in_button() throws Throwable {
		codingPage.clickOnSigninButton();                     //-------------------2
	 }

	@When("^user enter valid Email address and password$")
	public void user_enter_valid_Email_address_and_password() throws Throwable {
	    codingPage.enterEmailaddressAndPassword();            //-------------------3a,3b
	}

	@When("^user click on the Sign in button$")
	public void user_click_on_the_Sign_in_button() throws Throwable {
		codingPage.clickOnLoginButton();                       //----------------------4
	}

	@Then("^user nevigate to welcome page$")
	public void user_nevigate_to_welcome_page() throws Throwable {
	//codingPage.verifyWelcomeWord();                      //----------------------5
	}
	
	@Then("^user verify the page title as \"([^\"]*)\"$")
	public void user_verify_the_page_title_as(String title) throws Throwable {
		String expected= title; 
	    String actual= driver.getTitle().trim();  
	    Assert.assertTrue("Title does not match",actual.contains(expected));//----6
	}

	@Then("^user click on the upper left corner Dresses$")
	public void user_click_on_the_upper_left_corner_Dresses() throws Throwable {
		codingPage.clickUpperleftcornerDresses();                   //------------------7
	   
	}

	@Then("^click on sort by$")
	public void click_on_sort_by() throws Throwable {
		
		Thread.sleep(3000);
		
		List<WebElement> AllPrices = driver.findElements(By.xpath("//*[@class='product-desc']/following-sibling::div[1]")); /*(actualTitle));*/
        ArrayList<String> NewList = new ArrayList<String>();
           
		    for (int i = 0; i < AllPrices.size(); i++) {
                NewList.add(AllPrices.get(i).getText().toString());
                }
		 
		//sorting ArrayList in desending order;
		Collections.sort(NewList, Collections.reverseOrder());
        System.out.println("List of the prices in sorted order: " + NewList);
		
      String SecondPrice = NewList.get(1);
		System.out.println("Price of second dress: " + SecondPrice);
		
		driver.findElement(By.xpath("(//*[contains(text(),'" + SecondPrice + "')])[2] ")).click();
	//	Thread.sleep(3000);
	//driver.findElement(By.xpath("(//*[contains(text(),'Proceed to checkout')])")).click();

	//driver.findElement(By.xpath("(//*[@id='category'])")).click();
		
		
		Double expected = Double.parseDouble(SecondPrice.replace("$", "")) + 2;
		System.out.println("The Expected price is: " + expected);
		
//		Thread.sleep(2000);
//	     Double actual = Double.parseDouble(driver.findElement(By.xpath("//*[@id='total_price']")).getText().replace("$", ""));
//	     Assert.assertTrue("Price does not match", actual.equals(expected));
		
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@class='logout']")).click();
	    // driver.quit();
         codingPage.clickOnSortedOrders();
          driver.quit();
		
	}

	@Then("^select Hightest first$")
	public void select_Hightest_first() throws Throwable {
		codingPage.clickHightestFirst();
	}

	@Then("^user select the second dress from the list$")
	public void user_select_the_second_dress_from_the_list() throws Throwable {
	    codingPage.clickSecondDress();
    }

	@Then("^user click on Add to cart$")
	public void user_click_on_Add_to_cart() throws Throwable {
	   codingPage.clickAddToCart(); 
	}

	@Then("^user verify Total price with shipping is there$")
	public void user_verify_Total_price_with_shipping_is_there() throws Throwable {
		codingPage.clickTotelPriceWithShipping();
	   
	}

	@Then("^user sign out$")
	public void user_sign_out() throws Throwable {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     codingPage.SignOut();                      //---------------------------13a
	   
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		driver.close();                        //----------------------------13b or 14 
	    //driver.quit();   
		codingPage.CloseBrowser();
	
}}

//-----------------------------------------------------
//http://automationpractice.com/index.php?id_category=8&controller=category
//-------------------------------------------------------
//  @When("^user click on the log in button$")
//  public void user_click_on_the_log_in_button() throws Throwable {
//	   dashPage = new DashboardPage(driver);
//	   dashPage.clickOnLoginButton();
//	}
//
//  @When("^user enter valid username and password$")
//  public void user_enter_valid_username_and_password() throws Throwable {
//	   DashboardPage dashPage = new DashboardPage(driver);
//     dashPage.enterUsernameAndPassword(); 
//   }
//
//  @Then("^user navigate to the welcome page$")
//  public void user_navigate_to_the_welcome_page() throws Throwable {
//      dashPage.verifyWelcomeWord1();
//   }
//
//  @Then("^user verify the page title as \"([^\"]*)\"$")
//  public void user_verify_the_page_title_as(String title) throws Throwable {
//	   String expected = title;
//	   String actual = driver.getTitle();
//	   Assert.assertTrue("Title does not match",actual.contains(expected));
//   }
//
//  @Then("^user verify user name is displays at top right$")
//  public void user_verify_user_name_is_displays_at_top_right() throws Throwable {
//     dashPage.verifyUserName();
//   }
//
//  @Then("^user log out$")
//  public void user_log_out() throws Throwable {
//	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//     dashPage.logOut();
//   }
//
//  @Then("^user close browser$")
//  public void user_close_browser() throws Throwable {
//     driver.close();
//     driver.quit();
//   }
//}
//-----------------------------------------------------------------  
//   @Then("^print price value in desendeing sorted order$")
//    public void print_price_value_in_desendeing_sorted_order() throws Throwable {
//        logopages.printpriceindesendingorder();
//	 
//  List<WebElement> AllPrices = driver.findElements(By.xpath("//*[@class='product-desc']/following-sibling::div[1]")); /*(actualTitle));*/
//         ArrayList<String> NewList = new ArrayList<String>();
//            for (int i = 0; i < AllPrices.size(); i++) {
//            NewList.add(AllPrices.get(i).getText().toString());
//   }
//		ArrayList<String> Allprice=new ArrayList<String>();
//		Allprice.add("$26.00");
//		Allprice.add("$50.99");
//		Allprice.add("$28.98");
//		Allprice.add("$30.50");
//		Allprice.add("$16.40");
//	Collections.sort(Allprice,Collections.reverseOrder());
//
//		System.out.println(Allprice);
//
//		 //sorting ArrayList in desending order
//		Collections.sort(NewList, Collections.reverseOrder());
//
//		System.out.println("List of the prices in sorted order: " + NewList);
//		String SecondPrice = NewList.get(1);
//		System.out.println("Price of second dress: " + SecondPrice);
//     }
//


//package coadingchallange.steps;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import coadingchallange.pages.CoadingchallangePage;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import org.junit.Assert;
//
//public class CoadingchallangeStep {
//
//	WebDriver driver;
//	CoadingchallangePage codingPage;
//
//	@Given("^user go to your logo homepage$")
//	public void user_go_to_your_logo_homepage() throws Throwable {
//
//		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
//         driver = new ChromeDriver();
//
//		driver.get("http://automationpractice.com/index.php");
//      driver.manage().window().maximize();
//        //codingPage = new CoadingchallangePage(driver);
//      }
//  @Given("^click on the Sign in button$")
//	public void click_on_the_Sign_in_button() throws Throwable {
//      codingPage = new CoadingchallangePage (driver);
//		codingPage.clickOnSignInButton();
//      }
//
//	@When("^user enter valid Email address and password$")
//	public void user_enter_valid_Email_address_and_password() throws Throwable {
//      codingPage = new CoadingchallangePage(driver);
//		codingPage.enterEmailAddressAndPassword();
//      }
//
//	@When("^user click on the Sign in button$")
//	public void user_click_on_the_Sign_in_button() throws Throwable {
//       codingPage.userClickOnSignInButton();
//	     }
//
//	@Then("^user nevigate to welcome page$")
//	public void user_nevigate_to_welcome_page() throws Throwable {
//      //codingPage.userNevigateToWelcomePage();
//       }
//
//	@Then("^user verify the page title as \"([^\"]*)\"$")
//	public void user_verify_the_page_title_as(String title) throws Throwable {
//
//		String expected = title;
//		String actual = driver.getTitle();
//		Assert.assertTrue("Title does not match", actual.contains(expected));
//	     }
//
//	@Then("^user click on the upper left corner Dresses$")
//	public void user_click_on_the_upper_left_corner_Dresses() throws Throwable {
//       codingPage.clickOnTheUpperLeftCornerDresses();
//	     }
//
//	@Then("^price print value decending sorted order$")
//	public void price_print_value_decending_sorted_order() throws Throwable {
//	
//  List<WebElement> AllPrices = driver.findElements(By.xpath("//[@class='product-desc']/following-sibling::div[1]")); /(actualTitle));*/
//        ArrayList<String> NewList = new ArrayList<String>();
//           
//		    for (int i = 0; i < AllPrices.size(); i++) {
//                NewList.add(AllPrices.get(i).getText().toString());
//                }
//		 
//		//sorting ArrayList in desending order;
//		Collections.sort(NewList, Collections.reverseOrder());
//        System.out.println("List of the prices in sorted order: " + NewList);
//		
//        String SecondPrice = NewList.get(1);
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
//		
//		Double actual = Double.parseDouble(driver.findElement(By.xpath("//*[@id='total_price']")).getText().replace("$", ""));
//	    Assert.assertTrue("Price does not match", actual.equals(expected));
//		
//		
//		//driver.findElement(By.xpath("//*[@id='total_price']")).click();
//		//String actual= driver.getTitle().trim();  
//		
//        driver.findElement(By.xpath("//*[@class='logout']")).click();
//		//codingPage.clickSortedOrders();
//		
//		 List<WebElement> AllPrices = driver.findElements(By.xpath("//[@class='product-desc']/following-sibling::div[1]")); /(actualTitle));*/
//
//			ArrayList<String> NewList = new ArrayList<String>();
//
//			for (int i = 0; i < AllPrices.size(); i++) {
//
//				NewList.add(AllPrices.get(i).getText().toString());
//
//			}
//			ArrayList<String> Allprice=new ArrayList<String>();
//			Allprice.add("$26.00");
//			Allprice.add("$50.99");
//			Allprice.add("$28.98");
//			Allprice.add("$30.50");
//			Allprice.add("$16.40");
//		Collections.sort(Allprice,Collections.reverseOrder());
//
//			System.out.println(Allprice);
//
//			 //sorting ArrayList in desending order
//			Collections.sort(NewList, Collections.reverseOrder());
//
//			System.out.println("List of the prices in sorted order: " + NewList);
//			String SecondPrice = NewList.get(1);
//			System.out.println("Price of second dress: " + SecondPrice);
//
//		}  
//	
//
//	@Then("^user select the second dress from the list$")
//	public void user_select_the_second_dress_from_the_list() throws Throwable {
//
//		//codingPage.SelectTheSecondDressFromTheList();
//
//	}
//
//	@Then("^user click on Add to cart$")
//	public void user_click_on_Add_to_cart() throws Throwable {
//
//		//codingPage.ClickOnAddToCart();
//	}
//
//	@Then("^user verify Total price with shipping is there$")
//	public void user_verify_Total_price_with_shipping_is_there() throws Throwable {
//
//		//codingPage.verifyTotalPriceWithShippingIsThere();
//
//	}
//
//	@Then("^user sign out$")
//	public void user_sign_out() throws Throwable {
//
//		codingPage.signOut();
//
//	}
//
//	@Then("^user close the browser$")
//	public void user_close_the_browser() throws Throwable {
//
//		driver.close();
//		driver.quit();
//	}
