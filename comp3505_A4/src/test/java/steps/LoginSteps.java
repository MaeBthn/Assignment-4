package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    WebDriver driver;

    @Given("I open Chrome browser")
    public void open_browser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\G\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("I navigate to JPetStore login page")
    public void open_login_page() {

        driver.get("http://localhost:8080/jpetstore");
    }

    @When("I enter username {string} and password {string}")
    public void enter_credentials(String username, String password) {

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("signon")).click();
    }

    @Then("I should see the homepage")
    public void verify_login() {

        System.out.println("Login test executed");

        driver.quit();
    }
}

