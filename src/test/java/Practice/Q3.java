package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        /* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname
    fill the lastname
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Antartica
    choose your command  -> Browser Commands
    click submit button
 */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.manage().deleteAllCookies();

        driver.findElement(By.name("firstname")).sendKeys("Nevzat");
        Thread.sleep(1000);

       driver.findElement(By.name("lastname")).sendKeys("Celik");
        Thread.sleep(1000);
       driver.findElement(By.name("sex")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("exp-6")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("datepicker")).sendKeys("05/10/2022");
        Thread.sleep(1000);
        driver.findElement(By.id("profession-1")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("input-xlarge")).sendKeys("Europe");
        Thread.sleep(1000);
        driver.findElement(By.id("selenium_commands")).click();
        Thread.sleep(1000);

        driver.quit();






    }
}
