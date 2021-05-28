import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
By TitleElement = By.id("title") ;
    public String getTitle () {
     String Title =driver.findElement(TitleElement).getText();

    return Title ;
    }
}