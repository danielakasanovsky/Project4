package selenium.Project.Asos.test;

import org.openqa.selenium.chrome.ChromeDriver;
import selenium.Project.Asos.pages.AdidasPage;
import selenium.Project.Asos.pages.OlaplexPage;
import selenium.SeleniumBase;

public class TestAsos {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase   base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.asos.com/search/?q=olaplex");
        OlaplexPage olaplex = new OlaplexPage(driver);
        AdidasPage adidas = new AdidasPage(driver);

        olaplex.clickOnMenuBtn();
        olaplex.Favourite();
        olaplex.searchAdidas("Adidas Gazelle Bold");
        Thread.sleep(3000); //without "sleep" it doesn't continue
        adidas.getPrice();
        adidas.getProduct();
        adidas.getPrices();

        base.seleniumClose(driver);
    }
}

