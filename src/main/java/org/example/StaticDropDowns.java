package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropDowns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise");
        WebElement staticDropdown = driver.findElement(By.xpath("(//select[@id='ctl00_mainContent_DropDownListCurrency'])[1]"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        dropdown.selectByValue("INR");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"INR");


    }
}
