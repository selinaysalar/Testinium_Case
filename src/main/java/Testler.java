import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class Testler {
    WebDriver chrome;
    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chrome = new ChromeDriver();
        chrome.get("https://www.lcwaikiki.com/tr-TR/TR");
    }
    @AfterAll
    public void tearDown(){
        chrome.quit();
    }

}
