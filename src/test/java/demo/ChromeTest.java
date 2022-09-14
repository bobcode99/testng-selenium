package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test()
public class ChromeTest {

    WebDriver driver = null;
    String projectPath = System.getProperty("user.dir");

    @Test
    public void openGoogle()throws Exception{
        System.out.println("I am inside openGoogle test | " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void openDdg()throws Exception{
        System.out.println("I am inside openGoogle test | " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://duckduckgo.com");
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void openSideex()throws Exception{
        System.out.println("I am inside openGoogle test | " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://sideex.io");
        Thread.sleep(3000);
        driver.close();
    }
//    @Test
//    public void redTest() throws Exception{
//        System.out.println("I am inside Test 1 | " + Thread.currentThread().getId());
//
//        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://sideex.github.io/example/webpage_under_test/input-form-for-date-range-color.html");
//        driver.findElement(By.cssSelector(".demoDiv > div")).click();
//        driver.findElement(By.id("color")).click();
//        driver.findElement(By.id("color")).sendKeys("#ff0019");
//        driver.findElement(By.id("date")).click();
//        driver.findElement(By.id("date")).click();
//        driver.findElement(By.id("date")).sendKeys("2022-09-21");
//        driver.findElement(By.id("datetime-local")).click();
//        driver.findElement(By.id("datetime-local")).sendKeys("2022-09-12T01:04");
//        driver.findElement(By.id("month")).click();
//        driver.findElement(By.id("month")).sendKeys("2022-07");
//        {
//            WebElement element = driver.findElement(By.id("range"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).clickAndHold().perform();
//        }
//        {
//            WebElement element = driver.findElement(By.id("range"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).perform();
//        }
//        {
//            WebElement element = driver.findElement(By.id("range"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).release().perform();
//        }
//        driver.findElement(By.id("range")).sendKeys("1");
//        driver.findElement(By.id("range")).click();
//        driver.findElement(By.id("time")).click();
//        driver.findElement(By.id("time")).sendKeys("13:09");
//        driver.findElement(By.id("week")).click();
//        driver.findElement(By.id("week")).sendKeys("2021-W37");
//
//        Thread.sleep(3000);
//        driver.close();
//    }
//
//    @Test
//    public void yellowTest() throws Exception {
//        System.out.println("I am inside Test 2 | " + Thread.currentThread().getId());
//        System.setProperty("webdriver.chrome.driver", projectPath + "/selenium-server/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://sideex.github.io/example/webpage_under_test/input-form-for-date-range-color.html");
//        driver.findElement(By.cssSelector(".demoDiv > div")).click();
//        driver.findElement(By.id("color")).click();
//        driver.findElement(By.id("color")).sendKeys("#eeff00");
//        driver.findElement(By.id("date")).click();
//        driver.findElement(By.id("date")).click();
//        driver.findElement(By.id("date")).sendKeys("2022-09-21");
//        driver.findElement(By.id("datetime-local")).click();
//        driver.findElement(By.id("datetime-local")).sendKeys("2022-09-12T01:04");
//        driver.findElement(By.id("month")).click();
//        driver.findElement(By.id("month")).sendKeys("2022-07");
//        {
//            WebElement element = driver.findElement(By.id("range"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).clickAndHold().perform();
//        }
//        {
//            WebElement element = driver.findElement(By.id("range"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).perform();
//        }
//        {
//            WebElement element = driver.findElement(By.id("range"));
//            Actions builder = new Actions(driver);
//            builder.moveToElement(element).release().perform();
//        }
//        driver.findElement(By.id("range")).sendKeys("7");
//        driver.findElement(By.id("range")).click();
//        driver.findElement(By.id("time")).click();
//        driver.findElement(By.id("time")).sendKeys("01:07");
//        driver.findElement(By.id("week")).click();
//        driver.findElement(By.id("week")).sendKeys("2022-W37");
//
//        Thread.sleep(3000);
//        driver.close();
//    }
}