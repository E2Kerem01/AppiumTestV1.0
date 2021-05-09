import com.Pages.BasketPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.ProductPage;
import org.junit.Test;




public class StepImplementation extends BaseTest {



    @Test
    public void sampleTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.hesabımaTıkla();
        loginPage.hesapBilgileriniGir();

        HomePage homePage = new HomePage(driver);
        homePage.kategorilereTıkla();
        homePage.BilgisayarSec();

        ProductPage productPage = new ProductPage(driver);
        productPage.urunOzellikleriniSec();

        BasketPage basketPage = new BasketPage(driver);
        basketPage.urunSayisiniArttirma();
        basketPage.urunuSilme();
        basketPage.hesaptanCıkısYapma();



    }



}
