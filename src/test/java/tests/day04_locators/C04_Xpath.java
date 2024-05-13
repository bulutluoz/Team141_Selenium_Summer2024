package tests.day04_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Xpath {

    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://www.testotomasyonu.com/addremove/");
        //2- Add Element butonuna basin
        // WebElement addButonu = driver.findElement(By.xpath("//button[@id='sub-btn']"));
        // addButonu.click();

        driver.findElement(By.xpath("//button[@id='sub-btn']"))
                .click();

        //3- Remove butonu’nun gorunur oldugunu test edin

        WebElement removeButonu = driver.findElement(By.xpath("//button[@class='remove-btn']"));

        if (removeButonu.isDisplayed()){
            System.out.println("remove butonu gorunme testi PASSED");
        }else System.out.println("remove butonu gorunme testi FAILED");

        //4- Remove tusuna basin
        removeButonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//h2"));
        //WebElement addRemoveYaziElementi = driver.findElement(By.tagName("h2"));

        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add remove yazisi gorunme testi PASSED");
        }else System.out.println("Add remove yazisi gorunme testi FAILED");

        Thread.sleep(2000);
        driver.quit();

    }


}
