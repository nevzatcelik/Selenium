package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGETmethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getWindowHandle());
        // bize acilan browser in handle degerini dondurur
        /*
        -Eger testimiz sirasinda birden fazla pencere acilirsa, acilan tum windowlarin window handle
        degerlerini bir set olarak bize dondurur
        -Windowlar arasi gecisi bu handle degerleri ile yapariz
         */

        System.out.println(driver.getWindowHandles());

        System.out.println(driver.getPageSource());

        driver.close();
    }
}
