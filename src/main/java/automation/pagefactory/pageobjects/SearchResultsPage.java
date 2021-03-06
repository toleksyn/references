package automation.pagefactory.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends PageObjectPage {
    @FindBy(xpath = ".//*[@id='logocont']//a")
    private WebElement googleLogo;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HomePage clickGoogleLogo() {
        googleLogo.click();

        return new HomePage(driver);
    }
}
