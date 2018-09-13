import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(id="js-link-box-en")
    WebElement buttonLanguage;




    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public HomeEnglishPage openEnglishWikipedia()
    {
        buttonLanguage.click();
        return new HomeEnglishPage(driver);
    }
}
