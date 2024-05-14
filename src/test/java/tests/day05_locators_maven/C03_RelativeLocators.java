package tests.day05_locators_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_RelativeLocators {

    public static void main(String[] args) throws InterruptedException {

        /*
            Relative locator selenium 4 ile tanitilan yeni bir ozellik

            EGER
            bir webElement'i gordugumuz ve HTML kodlarina ulastigimiz halde
            locate'imiz calismiyor ve webElement'i kullanamiyorsak

            ve etrafinda kullanabildigimiz baska webElementler varsa

            bu webelementi ulastigimiz bir bilgisi ve
            etrafindaki kullanabildigimiz webElementler sayesinde kullanabiliriz

            WebElement abc = elementin id'si "idAbc" ve suResmin altinda
         */

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1 ) https://testotomasyonu.com/relativeLocators adresine gidin

        driver.get("https://testotomasyonu.com/relativeLocators");

        //2 ) DSLR Camera’yi  etrafindaki elementleri kullanarak
        //    3 farkli relative locator ile locate edip tiklayin

            // relative locater'i kullanmak icin
            // A- kullanmak istediginiz webElement'e ait bir locate bilgisi
            //    <img id="pic7_thumb" src="https://testotomasyonu.com/uploads/product/1688040635pexels-pixabay-274973-removebg-preview.png" alt="">
            //    biz id = "pic7_thumb" kullanalim


            // B- etrafinda kullanilabilecek bir webElement'e ihtiyacimiz var
        WebElement appleKullaklik = driver.findElement(By.xpath("//*[@id='pic6_thumb']"));

        WebElement dslrCamera1 = driver.findElement(
                                    RelativeLocator.with(By.id("pic7_thumb"))
                                    .toRightOf(appleKullaklik)
                                        );

        dslrCamera1.click();

        //3 ) Acilan urunun DSLR Camera oldugunu test edin.

        WebElement urunIsimElementi = driver.findElement(By.xpath("//div[@class=' heading-sm mb-4']"));

        String expectedIsim = "DSLR Camera";
        String actualisim = urunIsimElementi.getText();

        if (expectedIsim.equals(actualisim)){
            System.out.println("DSLR camera testi PASSED");
        }else  System.out.println("DSLR camera testi FAILED");

        Thread.sleep(3000);
        driver.quit();
    }



}
