package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

    WebDriver driver = null;  // Global

    public void openChrome()
    {
        // ChromeDriver chrome = new ChromeDriver(); // (This is also correct)
        driver = new ChromeDriver();
        driver.get("https://timesofindia.indiatimes.com/poll.cms");

		/*
		WebDriver.Options o = driver.manage();
		WebDriver.Window w =  o.window();
		w.maximize();
		*/

        driver.manage().window().maximize();  //  This is the shortcut for upper command



    }

    public void openFirefox()
    {
        // FirefoxDriver fire = new FirefoxDriver(); // (This is also correct)
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/search?gs_ssp=eJzj4tDP1Tcwii9JNmD0EkvNS8_JLM5QKChKzc1MLVLISU1ML00FALtgC5g&q=english+premier+league&oq=&gs_lcrp=EgZjaHJvbWUqCQgAEC4YJxjqAjIJCAAQLhgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQLhgnGOoCMgkIBxAjGCcY6gLSAQk0NzMwOGowajeoAgiwAgE&sourceid=chrome&ie=UTF-8#cobssid=s");
        // fire.navigate();
    }

    public void openEdge()
    {
        // EdgeDriver edge = new EdgeDriver(); // (This is also correct)
        driver = new EdgeDriver();
        driver.get("https://www.manutd.com/");
    }

    public static void main(String[] args) {

        Test1 t = new Test1();
        t.openChrome();
        // t.openEdge();
        // t.openFirefox();
        // TODO Auto-generated method stub

    }

}