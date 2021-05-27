import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage chooseProduct() {

        driver.findElement(By.cssSelector("[data-uuid='s-searchgrid-carousel:0']")).click();

    return  new ProductPage(driver);
    }
}