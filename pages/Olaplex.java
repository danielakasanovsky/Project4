package selenium.Project.Asos.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Olaplex {
    private WebDriver driver;
    @FindBy(id= "chrome-search")
    WebElement search;
    @FindBy(css = "button[type='submit']")
    WebElement submit;

    @FindBy(className= "title_pbGFT")
    WebElement ProductType;

    @FindBy(id = "plp_web_sort_price_low_to_high")
    WebElement LowToHigh;
    @FindBy (className = "container_p0yFn")
    WebElement Favourite;
    public Olaplex(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void searchAdidas (String searchToType){
        search.click();
        search.clear();
        search.sendKeys(searchToType);
        submit.click();

    }
    public void clickOnMenuBtn() throws InterruptedException {
        ProductType.click();
        LowToHigh.click();

    }
    public void Favourite() throws InterruptedException {
        Favourite.click();

    }

}
