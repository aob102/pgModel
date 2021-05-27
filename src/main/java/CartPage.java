import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver ;
public CartPage (WebDriver driver){
    this.driver = driver;

}
public String objectTitle() {

    WebElement titleObject = driver.findElement(By.cssSelector(".a-size-medium.a-color-base.sc-product-title"));
     return titleObject.getText();

}
}
