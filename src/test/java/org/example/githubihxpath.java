package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class githubihxpath {

    @Test
    public void github(){

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://github.com/login");
        highlight(driver,driver.findElement(By.xpath("//h1")));
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("gadikotalithesh@gmail.com");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Lithesh55");

        driver.findElement(By.xpath("//a[@data-ga-click='Sign in, switch to sign up']")).click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gadikotalithesh@gmail.com");

        highlight(driver,driver.findElement(By.xpath("//p[@class='mb-0']")));


    }

    private void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor JsExecutor = (JavascriptExecutor) driver;
        JsExecutor.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid black;');", element);
    }

}
