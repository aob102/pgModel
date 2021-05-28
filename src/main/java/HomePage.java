import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
By Bar = By.id("twotabsearchtextbox") ;
By ButtonOk= By.id("nav-search-submit-button");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultPage enterSearchedobject(String data) {
        driver.findElement(Bar).sendKeys(data);
        driver.findElement(ButtonOk).click();
        return new ResultPage(driver);
    }




}
