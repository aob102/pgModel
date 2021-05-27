import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public Succesfulpage addProducttoCart() {
     driver.findElement(By.id("add-to-cart-button")).click();

    return new Succesfulpage(driver) ;
    }
}