package TestPage;

import org.openqa.selenium.*;

import core.page;

import java.util.Scanner;

public class PollingTest extends page{

    public void polling()
    {
        openBrowser("chrome", "https://timesofindia.indiatimes.com/poll.cms");

        String txt = driver.findElement(By.xpath("(//*[@class = 'normtxt']) [1]")).getText();

        System.out.println(txt);

        Scanner sc = new Scanner(System.in);
        System.out.println("Yes or No");
        String input = sc.next();
        if (input.equals("yes"))
        {
            driver.findElement(By.xpath("(//*[@ class = 'radio1']) [1]")).click();
        }
        else
        {
            driver.findElement(By.xpath("//*[@id=\"pollform\"]/table/tbody/tr[2]/td/input[2]")).click();
        }


    }

    public static void main(String[] args) {

        PollingTest p = new PollingTest();
        p.polling();

    }

}
