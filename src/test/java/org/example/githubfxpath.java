package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class githubfxpath {

    @Test
    public void github(){

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://github.com/login");

        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("gadikotalithesh@gmail.com");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Lithesh55");

        driver.findElement(By.xpath("//input[@name='commit']")).click();

        System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());


    }
}
