import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    WebDriver driver;
By ProductElement = By.cssSelector("[data-uuid='s-searchgrid-carousel:0']");
    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage chooseProduct() {

        driver.findElement(ProductElement).click();

    return  new ProductPage(driver);
    }
}