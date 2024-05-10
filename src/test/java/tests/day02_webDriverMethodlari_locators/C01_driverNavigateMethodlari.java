package tests.day02_webDriverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();

        // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // url'in testotomasyonu icerdigini test edin

        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Testotomasyonu url testi PASSED");
        }else System.out.println("Testotomasyonu url testi FAILED");
        Thread.sleep(2000);
        // youtube sayfasina gidin
        driver.navigate().to("https://www.youtube.com");

        // url'in youtube icerdigini test edin

        expectedUrlIcerik = "youtube";
        actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Youtube url testi PASSED");
        }else System.out.println("Youtube url testi FAILED");
        Thread.sleep(2000);
        // yeniden test otomasyonu sayfasina donun
        driver.navigate().back();

        // title'in "Test Otomasyonu" icerdigini test edin
        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Testotomasyonu title testi PASSED");
        }else System.out.println("Testotomasyonu title testi FAILED");
        Thread.sleep(2000);
        // bir daha youtube sayfasina gidin
        driver.navigate().forward();

        // title'in YouTube icerdigini test edin
        expectedTitleIcerik = "YouTube";
        actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Youtube title testi PASSED");
        }else System.out.println("Youtube title testi FAILED");


        Thread.sleep(2000);
        driver.quit();
    }
}
