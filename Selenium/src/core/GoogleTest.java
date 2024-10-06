package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleTest extends page {

    public void googleBrowser() throws Exception
    {
        openBrowser("chrome", "https://timesofindia.indiatimes.com/poll.cms");

		/*
		By b = By.name("PRadio");
		WebElement w = driver.findElement(b);
		w.click();
		*/

        driver.findElement(By.name("PRadio")).click(); // Shortcut for the upper command
        Thread.sleep(4000);

        closeBrowser();
    }

    public static void main(String[] args) throws Exception {

        GoogleTest g = new GoogleTest();
        g.googleBrowser();


    }

}