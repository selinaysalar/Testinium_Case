import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends Sayfa{
    By searchBocLocator = By.id("search_input");
    By submitLocator = By.id("search");

    public SearchBox(WebDriver chrome) {
        super(chrome);
    }

    public void search(String text) {
        type(searchBocLocator,text);
        click(submitLocator);
    }
}
