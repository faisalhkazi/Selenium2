package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleTest extends page {

    public void googleBrowser() throws Exception
    {
        openBrowser("chrome", "https://www.google.com/");

		/*
		By b = By.name("PRadio");
		WebElement w = driver.findElement(b);
		w.click();
		*/
        driver.findElement(By.xpath("//*[@role = 'combobox']")).sendKeys("Manchester");
        // Thread.sleep(4000); Not prefered
        // wait is prefered
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // This is explicit wait
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text() = ' united f.c. standings']"))).click();
        driver.findElement(By.xpath("//*[text() = ' united f.c. standings']")).click();

        // Thread.sleep(100);

        // closeBrowser();
    }

    public static void main(String[] args) throws Exception {

        GoogleTest g = new GoogleTest();
        g.googleBrowser();


    }

}