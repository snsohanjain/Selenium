package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumIntro {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.get("https://www.google.com");
        System.out.println(chromeDriver.getTitle());
        System.out.println(chromeDriver.getCurrentUrl());
        chromeDriver.close();


    }
}
