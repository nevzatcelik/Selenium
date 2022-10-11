package day03_webElements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_LocatorTesti {
    public static void main(String[] args) {
        /*
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
 a.web sayfasına gidin. https://www.amazon.com/
 b. Search(ara) “city bike”
 c. Amazon’da görüntülenen ilgili sonuçların sayısını yazdırın
 d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement aramasayfasi=driver.findElement(By.name("field-keywords"));
        aramasayfasi.sendKeys("city bike" + Keys.ENTER);

       List<WebElement> result= driver.findElements(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        System.out.println(result.size());
        System.out.println(result.get(0).getText());

        driver.findElement(By.className("s-image")).click();

        /*
        Eger bir locate ile birden fazla element bulunuyorsa
        selenium ilk elementi kullanir.
         */
        driver.close();


    }
}
