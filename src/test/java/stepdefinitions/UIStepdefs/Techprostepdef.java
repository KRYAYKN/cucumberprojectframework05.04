package stepdefinitions.UIStepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class Techprostepdef {
    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }
    @When("sayfa basligi yazdirilir")
    public void sayfa_basligi_yazdirilir() {
        System.out.println(Driver.getDriver().getTitle());
    }
    @Then("sayfa basliginda {string} oldugu dogrulanir")
    public void sayfa_basliginda_oldugu_dogrulanir(String string) {
     assertTrue(Driver.getDriver().getTitle().contains(string));
        }

    @Then("sayfa kapatilir")
    public void sayfa_kapatilir() {
Driver.closeDriver();
    }

}
