
// Umut Emre Çelik
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    @Test
    public void Searchingandfilter() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/emre/Desktop/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("sf-MenuItems-5_2RN")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Telefon & Telefon Aksesuarları")).click();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("ul.items>:nth-child(1)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("ul.items >:nth-child(2)")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='En az']")).sendKeys("0");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='En çok']")).sendKeys("1000");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='button small']")).click();



    }

    @Test
    public void Searchbybox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/emre/Desktop/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("desktopOldAutosuggestTheme-input")).sendKeys("IPhone 12");
        Thread.sleep(1000);
        driver.findElement(By.className("SearchBoxOld-buttonContainer")).click();


    }
}
