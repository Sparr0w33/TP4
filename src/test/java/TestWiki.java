import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestWiki {
    WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void testWiki()
    {

        HomePage homePage = new HomePage(driver);
        String resultatAttendu = "France";

        HomeEnglishPage homeEnglishPage = homePage.openEnglishWikipedia();
        ArticlePage articlePage = homeEnglishPage.rechercheAvecEntry("France");

        String resultatReel = articlePage.getArticleTitre();

        Assert.assertEquals(resultatAttendu,resultatReel);

    }
}
