package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C01_DriverMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver Driver=new ChromeDriver();

        // Driver objesi olusturunca selenium webDriver bilgisayarimizdaki chrome browser'dan bir bos sayfa actirir
        //Eger firefox veya safari gibi baska bir browser kullanmak istesek o browseri selenium sitesinden web driverini
        // indirip o projemizin icine eklememiz gerekir.

        Driver.get("https://amazon.com");
        //eger kodlarimizi belirli bir sure bekletmek istersek ;;
        Thread.sleep(5000); // yazilan milisaniye kadar kodlari bekletir

        System.out.println("Sayfa URL : "+Driver.getCurrentUrl());

        System.out.println("Sayfanin Title i : "+Driver.getTitle());




        Driver.close();
    }
}
