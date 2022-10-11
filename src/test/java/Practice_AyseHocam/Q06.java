package Practice_AyseHocam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q06 {
    public static void main(String[] args) {
        /*
        /* ...Exercise4...
          Navigate to  https://testpages.herokuapp.com/styled/index.html
          Click on  Calculater under Micro Apps
          Type any number in the first input
          Type any number in the second input
          Click on Calculate
          Get the result
          Print the result
 */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/index.html");


        WebElement ClickonCalculate= driver.findElement(By.id("calculatetest"));
        ClickonCalculate.click();

        WebElement FirstImput= driver.findElement(By.id("number1"));
        FirstImput.sendKeys("123456");

        WebElement SecondInput= driver.findElement(By.id("number2"));
        SecondInput.sendKeys("67890");

        WebElement calculate= driver.findElement(By.id("calculate"));
        calculate.click();
    }
}
