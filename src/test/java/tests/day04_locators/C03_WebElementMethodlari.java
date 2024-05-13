package tests.day04_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMethodlari {

    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        // aramaKutusu.sendKeys("phone"); webelement'e yazi yollar

        // aramaKutusu.click(); webelement'e click yapar

        // aramaKutusu.getText(); webelement uzerindeki text'i alir

        // aramaKutusu.submit(); webelement'de ENTER'a basmak ile ayni islemi yapar

        // aramaKutusu.clear(); // webelement'de yazi varsa siler

        // aramaKutusu.isDisplayed(); // true-false webelement gorunuyor mu sorusunun cevabini verir

        // System.out.println(aramaKutusu.isEnabled()); // true-false webelement erisilebiliyor mu sorusunun cevabini verir

        // aramaKutusu.isSelected(); // true-false
        // webelement checkbox veya radio button ise secili mi sorusunun cevabini verir

        System.out.println(aramaKutusu.getAttribute("id")); // global-search
        System.out.println(aramaKutusu.getAttribute("class")); // search-input
        System.out.println(aramaKutusu.getAttribute("naber")); // null


        Thread.sleep(1000);
        driver.quit();

    }
}
