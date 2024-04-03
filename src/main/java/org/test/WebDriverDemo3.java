package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); //setting the path for chrome driver

        WebDriver driver = new ChromeDriver(); //creating object for chrome driver

        driver.get("http://www.urn.su/ui/basic_test/"); //opens the browser and navigates to the URL

        WebElement renovationLink =
                driver.findElements(By.linkText("Renovation")).get(0);
        renovationLink.click();
    }
}