
// Umut Emre Çelik
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buyTest {
    @Test
    public void buy() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/emre/Desktop/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hepsiburada.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.className("sf-OldMyAccount-PhY-T")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("test@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("123456Ab");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("desktopOldAutosuggestTheme-input")).sendKeys("iphone 11");
        Thread.sleep(2000);
        driver.findElement(By.className("SearchBoxOld-buttonContainer")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("hb-pl-cn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("quantity")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("quantity")).sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.id("addToCart")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div/div/div/div/div[1]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("continue_step_btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("continue_step_btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/div/div/h3")).click();
    }
    @Test
    public void invalidLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/emre/Desktop/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hepsiburada.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.className("sf-OldMyAccount-PhY-T")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("login")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("test@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("asasdasd");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
    }
    @Test
    public void noStock() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/emre/Desktop/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hepsiburada.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.className("desktopOldAutosuggestTheme-input")).sendKeys("iphone 11");
        Thread.sleep(1000);
        driver.findElement(By.className("SearchBoxOld-buttonContainer")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hb-pl-cn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("quantity")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("quantity")).sendKeys("50");
        Thread.sleep(1000);
        driver.findElement(By.id("addToCart")).click();


    }
}


