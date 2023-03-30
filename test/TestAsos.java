package selenium.Project.Asos.test;

import org.openqa.selenium.chrome.ChromeDriver;
import selenium.Project.Asos.pages.AdidasGazelleBold;
import selenium.Project.Asos.pages.Olaplex;
import selenium.SeleniumBase;

public class TestAsos {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBase   base = new SeleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.asos.com/search/?q=olaplex");
        Olaplex olaplex = new Olaplex(driver);
        AdidasGazelleBold adidas = new AdidasGazelleBold(driver);

        olaplex.clickOnMenuBtn();
        Thread.sleep(5000);
        olaplex.Favourite();
        Thread.sleep(5000);
        olaplex.searchAdidas("Adidas Gazelle Bold");
        Thread.sleep(5000);
       adidas.getPrice();
        Thread.sleep(5000);
        adidas.getProduct();
        Thread.sleep(5000);
        adidas.getPrices();

        base.seleniumClose(driver);
    }
}

