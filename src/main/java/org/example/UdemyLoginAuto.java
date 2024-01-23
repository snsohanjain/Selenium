package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;

public class UdemyLoginAuto {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        chromeDriver.get("https://www.udemy.com/join/login-popup/");
        chromeDriver.findElement(By.xpath("(//input[@id='form-group--1'])[1]")).sendKeys("otsuser108@gmail.com");
        chromeDriver.findElement(By.xpath("(//input[@id='form-group--3'])[1]")).sendKeys("Juij*&565$D");
        chromeDriver.findElement(By.xpath("(//button[@class='ud-btn ud-btn-large ud-btn-brand ud-heading-md helpers--auth-submit-button--2K2dh'])[1]")).click();

    }
}
