import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends Sayfa {
    By productCardLocator=  new By.ByCssSelector("rd-cart-item shoppingcart-item");

    public CartPage(WebDriver chrome) {
        super(chrome);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size()>0;
    }
    private List<WebElement> getProducts(){
        return findAll(productCardLocator);
    }
}
