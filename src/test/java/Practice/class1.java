package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class class1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.yves-rocher.com/");

        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[1]/div[1]/span/span[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[1]/div[1]/div/ul/li[4]/p")).click();

        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[1]/div[2]/span/span[1]")).click();

      WebElement kutucuguActi=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[1]/div[2]/div[4]/ul/li[34]/p"));
        JavascriptExecutor down = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("2","4");







    }

}
