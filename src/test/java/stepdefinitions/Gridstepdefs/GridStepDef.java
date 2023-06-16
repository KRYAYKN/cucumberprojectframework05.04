package stepdefinitions.Gridstepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GridStepDef {
    WebDriver driver;

    @Given("user is on he homepage {string} by chrome")
    public void user_is_on_he_homepage_by_chrome(String url) throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444"), new ChromeOptions());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }



    @Then("verify title has {string}")
    public void verify_title_has(String title) {
        assertTrue(driver.getTitle().contains(title));

    }

    @Then("close the remote driver")
    public void close_the_remote_driver() {
        driver.quit();

    }
    @Given("user is on he homepage {string} by edge")
    public void user_is_on_he_homepage_by_edge(String url) throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444"), new EdgeOptions());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Given("user is on he homepage {string} by firefox")
    public void user_is_on_he_homepage_by_firefox(String url) throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444"), new FirefoxOptions());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
}
