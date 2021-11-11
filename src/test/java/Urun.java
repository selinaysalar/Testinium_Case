import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Order;

public class Urun extends Testler {

    HomePage homePage;
    ProductsPage productsPage;
    ProductsDetailPage detailPage;
    CartPage cartPage;

    public Urun(WebDriver chrome) {
    }


        @Test
        @Order(1)
        public void search_a_product() {
        homePage = new HomePage (chrome);
        productsPage =new ProductsPage(chrome);
        homePage.searchBox().search("Pantolon");
        Assertions.assertTrue(productsPage.isOnProductsPage(), "Urun sayfasında değil!");
        }
        @Test
        @Order(2)
        public void select_a_product() {
        detailPage= new ProductsDetailPage(chrome);
        productsPage.selectProduct(1);
        Assertions.assertTrue(detailPage.isOnProductsDetailPage(),"Urun detay sayfasında değil!");
        }
        @Test
        @Order(3)
        public void add_product_to_cart () {
            detailPage.addToCart();
            Assertions.assertTrue(homePage.isProductCountUp(),"Urun sayısı artmadı!");

        }
        @Test
        @Order(4)
        public void go_to_cart () {
            cartPage= new CartPage(chrome);
            homePage.goToCart();
            Assertions.assertTrue(cartPage.checkIfProductAdded(),"Urun sepete eklenemedi!");

        }
    }

