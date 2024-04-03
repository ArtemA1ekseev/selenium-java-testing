package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class WebDriverDemo10 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); //setting the path for chrome driver

        WebDriver driver = new ChromeDriver(); //creating object for chrome driver

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 50);

        driver.get("http://www.urn.su/search.php"); //opens the browser and navigates to the URL

        try {
            WebElement yandexField =
                    wait.until(presenceOfElementLocated(By.name("text")));
            yandexField.sendKeys("java");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            WebElement yButton =
                    wait.until(presenceOfElementLocated(By.className("ya-site-form__submit")));
            yButton.click();
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
