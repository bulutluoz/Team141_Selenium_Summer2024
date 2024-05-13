package tests.day03_webDriverMethodlari_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locators {

    public static void main(String[] args) throws InterruptedException {

        /*
            driver method'lari ile yapabilecegimiz islemler sinirlidir

            biz testlerimizi otomasyon ile calistirmak istedigimizde
            driver'a uzerinde calismasini istedigimiz webelement'leri tarif edebilmeliyiz

            Selenium driver'a webelement'leri tarif edebilecegimiz
            8 adet tarif edici (locator) olusturmustur

            ilk 6 tanesi webelement'in HTML kodlarina bagimlidir
            - By.id() : HTML kodunda id attibute'u varsa kullanabiliriz, yoksa kullanamayiz
            - By.className()
            - By.name() : HTML kodunda name attibute'u varsa kullanabiliriz, yoksa kullanamayiz
            - By.tagName()
            - By.linkText()
            - By.partialLinkText()

            son 2 tanesi ise her turlu webElement'te calisacak sekilde dizayn edilmistir
             - By.xpath()
             - By.cssSelector()

             bu locator'lar sayesinde driver'a webelement'i tarif edebiliriz

         */

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // arama kutusunu locate edip, bir webelement olarak kaydedin

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        // arama kutusuna phone yazip, aratin

        aramaKutusu.sendKeys("phone");

        Thread.sleep(3000);

        aramaKutusu.submit();


        Thread.sleep(3000);
        driver.quit();

    }
}
