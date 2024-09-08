
package Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;


public class LoginSteps {

    WebDriver driver = new ChromeDriver();
    String pageTitle;

    @Given("I navigate to the login page")
    public void GoToLoginPage()
    {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
        driver.get("https://grafana.com/auth/sign-in");

    }

    @When("I enter valid username and password")
    public void ValidCredentials()
    {

        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("ahad1105jon@gmail.com");
        driver.findElement(By.id("submit")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("System@1234");

    }

    @And("I click the login button")
    public void ClickLoginButton()
    {
        driver.findElement(By.id("submit")).click();
    }

    @Then("I should be redirected to dashboard page")
    public void Dashboard()
    {
        pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Grafana Cloud - Sign In");
    }



}

