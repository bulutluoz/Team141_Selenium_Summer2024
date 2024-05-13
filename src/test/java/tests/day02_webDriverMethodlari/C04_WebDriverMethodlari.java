package tests.day02_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_WebDriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();

        //1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com/");
        //2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin

        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
        }

        //4. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.

        String expectedUrl = "https://testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();

         if (expectedUrl.equals(actualUrl)){
             System.out.println("Url testi PASSED");
         }else {
             System.out.println("Url testi FAILED");
             System.out.println("Expected url : " + expectedUrl);
             System.out.println("Actual Url : " + actualUrl);
         }

        //6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin

        String expectedSayfaKaynagiIcerigi = "otomasyon";
        String actualSayfaKaynagi = driver.getPageSource();

        if (actualSayfaKaynagi.contains(expectedSayfaKaynagiIcerigi)){
            System.out.println("sayfa kaynagi testi PASSED");
        }else {
            System.out.println("Sayfa kaynagi testi FAILED");
        }

        //8. Sayfayi kapatin.
        driver.quit();
    }
}
