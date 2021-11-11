import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsDetailPage extends Sayfa {
    By addToCardButtonLocator = By.id("pd_add_to_cart");
    public ProductsDetailPage(WebDriver chrome) {
        super(chrome);
    }

    public boolean isOnProductsDetailPage() {
        return isDisplayed(addToCardButtonLocator);

    }

    public void addToCart() {
        click(addToCardButtonLocator);
    }
}
