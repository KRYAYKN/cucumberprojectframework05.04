package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TechproPage {
    public TechproPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

}
