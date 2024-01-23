package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;

public class LoginSelenium {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //Login
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("snsohanjain");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("snsohanjain@123456");
        driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
        driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
//        driver.quit();
        driver.findElement(By.xpath("(//a[normalize-space()='Forgot your password?'])[1]")).click();
        Thread.sleep(1000);
        // Forgot Password
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("iamsohanjain");
        driver.findElement(By.xpath("(//input[@placeholder='Email'])[1]")).sendKeys("iamsohanjain@gmail.com");
        driver.findElement(By.xpath("(//input[@placeholder='Phone Number'])[1]")).sendKeys("8880638514");
        driver.findElement(By.xpath("(//button[normalize-space()='Reset Login'])[1]")).click();

        Thread.sleep(2000);
        String password = getPassword(driver.findElement(By.xpath("(//p[@class='infoMsg'])[1]")).getText());
        driver.findElement(By.xpath("(//button[normalize-space()='Go to Login'])[1]")).click();

        //Login
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rahul");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText() );
        Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText(),"You are successfully logged in.");
//        driver.quit();
        Thread.sleep(5000);
        driver.findElement(By.className("logout-btn")).click();
    }
    public static String getPassword(String str){
       String [] text1 = str.split("'");
       String [] text2 = text1[1].split("'");
       return text2[0].toString();

    }
}
