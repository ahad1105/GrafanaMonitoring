package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;



public class DHP {


    WebDriver driver = new ChromeDriver();
    @Given("user opens a particular DHP Dashboard")
    public void DHPdashboard()
    {
        Assert.assertEquals(driver.findElement(By.id("")).getText(), "");
    }

    @And("time is selected for last 24hours")
    public void timeSelected()
    {
        driver.findElement(By.id("")).click();
    }

    @Then("Thread count should be less than 100")
    public void threadCount()
    {
        String thread_threshold = driver.findElement(By.id("")).getText();
        int thread_threshold_value = Integer.parseInt(thread_threshold);
        Assert.assertTrue(thread_threshold_value <= 100, "The value is healthy ");
    }

    @Then("Memory should be less than 6000MB")
    public void memoryCount()
    {
        String memory_threshold = driver.findElement(By.id("")).getText();
        int memory_threshold_value = Integer.parseInt(memory_threshold);
        Assert.assertTrue(memory_threshold_value <= 6000, "The value is healthy ");
    }

    @Then("Handle count should be less than 100")
    public void handleCount()
    {
        String handle_threshold = driver.findElement(By.id("")).getText();
        int handle_threshold_value = Integer.parseInt(handle_threshold);
        Assert.assertTrue(handle_threshold_value <= 100, "The value is healthy ");


    }

    @AfterTest
     public void endTest()
    {
        driver.quit();
    }



}
