import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultPage enterSearchedobject() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nitendo switch");
        driver.findElement(By.id("nav-search-submit-button")).click();
        return new ResultPage(driver);
    }




}
