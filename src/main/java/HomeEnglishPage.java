import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeEnglishPage {
    WebDriver driver;

    @FindBy(name="search")
    WebElement barreRecherche;

    @FindBy(id="searchButton")
    WebElement buttonRecherche;

    public HomeEnglishPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ArticlePage rechercheAvecEntry(String text) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        barreRecherche.sendKeys(text);
        barreRecherche.sendKeys(Keys.ENTER);
        return new ArticlePage(driver);
    }
}
