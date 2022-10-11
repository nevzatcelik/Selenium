package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C02_IlkTest {
    public static void main(String[] args) {
        /*
        Gerekli ayarlamalari yapip amazon ana sayfaya gidin
        sayfa basligi amazon icermeli
        2- sayfa url inde "Amazon" kelimesi olmali

         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        String expectedTitleIcerik="amazon";
        String expectedUrlIcerik="Amazon";

        String actualUrl= driver.getCurrentUrl();
        String actualTitle= driver.getTitle();

        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Url test PASSED");

        }else {
            System.out.println("URL test FAILED");
            System.out.println("actual URL : "+ actualUrl);
            System.out.println("actual URL aranan " + expectedUrlIcerik + " kelimesini icermiyor");
        }

        // title test

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Title Test PASSED");
        } else {
            System.out.println("Title test FAILED");
            System.out.println("actual title : " + actualTitle);
            System.out.println("actual title aranan " + actualTitle + " kelimesini icermiyor");
        }

        driver.quit();
        /*
        Driver.close sadece acik olan vrowser i kapatir
        Driver.quit ise test calisirken acilan tum  browserlari kapatir
         */



    }
}
