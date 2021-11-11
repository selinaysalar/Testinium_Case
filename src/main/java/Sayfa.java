import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Sayfa extends Testler {
    WebDriver chrome;
    public Sayfa(WebDriver chrome){
        this.chrome=chrome;
    }

    public WebElement find (By locator){
        return chrome.findElement(locator);
    }
    public List<WebElement> findAll(By locator){
        return chrome.findElements(locator);
    }
    public void click (By locator){
        find(locator).click();
    }
    public void type (By locator, String text) {
        find(locator).sendKeys(text);

    }
    public boolean isDisplayed (By locator){
        return find(locator).isDisplayed();
    }

}
