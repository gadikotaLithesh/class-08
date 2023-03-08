package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class githubfcss {

    @Test
    public void github(){

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://github.com/login");

        driver.findElement(By.cssSelector("input[name='login']")).sendKeys("gadikotalithesh@gmail.com");

        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Lithesh55");

        driver.findElement(By.cssSelector("input[name='commit']")).click();

        System.out.println(driver.findElement(By.cssSelector("div[role='alert']")).getText());


    }
}
