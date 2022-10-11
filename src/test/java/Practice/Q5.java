package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q5 {
    public static void main(String[] args) throws InterruptedException {
    /*
        1-Driver olusturalim
        2-Java class'imiza chromedriver.exe'yi tanitalim
        3-Driver'in tum ekrani kaplamasini saglayalim
        4-Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
           söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        5-"https://www.amazon.com" adresine gidelim
        6.Amazon sayfasinda arama kismina nutella yazdirip aratalim
        7.Cikan ekranda herhangi bir nutella ilanina tiklayalim
        8.sayfayi yenileyelim
        9.Title ve Url ini alalim
        10.bir sayfa geri donelim
        11.driver in tum sayfalarini kapatarak islemimizi bitirelim

     */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");




    }
}
