import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Succesfulpage {
    WebDriver driver;

    public Succesfulpage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage GotoCart() {

        driver.findElement(By.id("hlb-view-cart-announce")).click();

        return  new CartPage(driver);
    }
}
