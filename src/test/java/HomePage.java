import org.openqa.selenium.WebDriver;

import java.util.Stack;
import org.openqa.selenium.By;

public class HomePage extends Sayfa{
    SearchBox searchBox;
    By cartCountLocator = By.id("spanCart");
    By cartLocator = By.id("divCartSlider");


    public HomePage(WebDriver chrome) {
        super(chrome);
        searchBox = new SearchBox(chrome);
    }

    public SearchBox searchBox() {

        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount()>0 ;
    }

    public void goToCart() {
    }
    private int getCartCount(){
      String count =  find(cartCountLocator).getText();
      return Integer.parseInt(count);

    }
}

