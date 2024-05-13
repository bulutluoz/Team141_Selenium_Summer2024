package tests.day02_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WebDriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getCurrentUrl());
        // driver'in icinde oldugu sayfanin Url'ini getirir
        // https://www.testotomasyonu.com/

        System.out.println(driver.getTitle());
        // driver'in icinde oldugu sayfanin title'ini getirir
        // Test Otomasyonu - Test Otomasyonu

        System.out.println("=======Sayfa Kaynagi=======");
        System.out.println(driver.getPageSource());
        // butun sayfa kaynagini getirir
        // testlerde cok kullanilmaz


        System.out.println(driver.getWindowHandle()); // 026C84971E9F31F34D30DF26890EAB53
        System.out.println(driver.getWindowHandles()); // [026C84971E9F31F34D30DF26890EAB53]

        /*
            Bunu ayri bir konu olarak isleyecegiz
            getWindowHandle() driver'in icinde oldugu sayfaya atadigi
            unique WindowHandleDegerini getirir

            eger test sirasinda
            birden fazla browser acilirsa
            acilan tum sayfalarin WindowHandleDegerlerini
            bir Set olarak bize getirir

         */


        Thread.sleep(3000);
        driver.quit();
    }
}
