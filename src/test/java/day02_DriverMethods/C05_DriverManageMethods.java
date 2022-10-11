package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        /*
        wait konusu ilerde daha genis anlatilacak
        Implicitly wait driver in aradigi elementleri bulabilmesi icin kendisine verdigimiz arastirma suresidir
        o sure icersinde aradigi elementi bulamazsa hata verir
         */

        driver.manage().window().fullscreen();

        System.out.println("Fullscreen position " +driver.manage().window().getPosition());
        System.out.println("Fullscreen size "+driver.manage().window().getSize());

        Thread.sleep(2000);

        driver.manage().window().maximize();
        System.out.println("Maksimize position " +driver.manage().window().getPosition());
        System.out.println("Maksimize size "+driver.manage().window().getSize());

        Thread.sleep(2000);

        driver.manage().window().maximize();
        System.out.println("Minimize position " +driver.manage().window().getPosition());
        System.out.println("Minimize size "+driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.close();
    }
}
