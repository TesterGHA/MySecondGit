package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	static WebDriver driver;
	@Given("I am on Facebook sign-in page")
	public void i_am_on_facebook_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ghaza\\git\\repositorytoframework\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
	    
	}

	@When("I entered username {string} into the field")
	public void i_entered_username_into_the_field(String string) {
	   System.out.println("This is username:"+string);
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("email")).sendKeys("Gholi@gmail.com");
	    
	}

	@And("I entered password {string} into the field")
	public void i_entered_password_into_the_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is password:"+string);
	}

	@And("I clicked on Sign-in button")
	public void i_clicked_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

}
