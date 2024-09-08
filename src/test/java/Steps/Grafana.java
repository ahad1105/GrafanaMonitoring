package Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Grafana {

    WebDriver driver = new ChromeDriver();

    @When("User will search for proper enterprise name")

    public void enterpriseSearch()
    {
        driver.findElement(By.id("")).click();
        driver.findElement(By.id("")).sendKeys();

    }

    @Then("User should click on the enterprise")

    public void clickEnterprise()
    {
        driver.findElement(By.id("")).click();
    }

    @And("Select appropriate DHP")

    public void selectDHP()
    {
        driver.findElement(By.id("")).click();
    }


















}
