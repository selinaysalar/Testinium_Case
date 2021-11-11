import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class ProductsPage extends Sayfa {

    By shippingOptionLocator = By.id("filter-label");
    By productNameLocator= By.id("container");
    public ProductsPage(WebDriver chrome) {
        super(chrome);
    }
    public boolean isOnProductsPage() {
        return isDisplayed(shippingOptionLocator);
    }


    public void selectProduct(int i) {
        getAllProduct().get(i).click();

    }

   private List<WebElement> getAllProduct(){
       return findAll(productNameLocator);
   }
}
