package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginToTeachableCourse {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://sso.teachable.com/secure/146684/identity/login/password");
        driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("snsohandjain@gmail.com");
        driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("7892406097");
//        driver.findElement(By.xpath("(//input[@id='remember_me'])[1]")).click();

        driver.findElement(By.xpath("(//input[@name='commit'])[1]")).click();
    }
}
