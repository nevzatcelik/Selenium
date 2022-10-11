package Practice_AyseHocam;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    public static void main(String[] args) {

        /* ...Exercise2...
 1 - Driver olusturalim
 2 - Java class'imiza chromedriver.exe'yi tanitalim
 3 - Driver'in tum ekrani kaplamasini saglayalim
 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
 5 - "https://www.otto.de" adresine gidelim
 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
 8 - Ardindan "https://wisequarter.com/" adresine gidelim
 9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
     kontrol edelim
 10- Bir onceki web sayfamiza geri donelim
 11- Sayfayi yenileyelim
 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
 13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();


        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.otto.de");


        driver.getTitle();

        if (driver.getTitle().contains("OTTO")){
            System.out.println("Title contains OTTO");
        }else {
            System.out.println(driver.getTitle());
        }


        driver.getCurrentUrl();
       if (driver.getCurrentUrl().contains("OTTO")){
            System.out.println("Title contains OTTO");
       }else {
           System.out.println(driver.getCurrentUrl());
       }

       driver.navigate().to("https://wisequarter.com/");

       driver.getTitle();
        if (driver.getTitle().contains("Quarter")){
            System.out.println("Title contains QUARTER");
        }else {
            System.out.println(driver.getTitle());
        }

        driver.navigate().back();

        driver.navigate().refresh();

        driver.navigate().forward();

        driver.close();

        driver.quit();

    }
}
