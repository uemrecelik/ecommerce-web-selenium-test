
// Umut Emre Çelik
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewRegistration {
    @Test
    public void Newregistrationsucces() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/GİZER/Desktop/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("sf-OldMyAccount-PhY-T")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("register")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstName")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("test@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Ab123456");
        Thread.sleep(2000);
        driver.findElement(By.id("checkSubscribeEmail")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnSignUpSubmit")).click();
    }

    @Test
    public void Sameemailregistration() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/GİZER/Desktop/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("sf-OldMyAccount-PhY-T")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("register")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("firstName")).sendKeys("testUser");
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("testUserSurname");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("test@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("123456Ab");
        Thread.sleep(2000);
        driver.findElement(By.id("checkSubscribeEmail")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnSignUpSubmit")).click();
    }

    @Test
    public void Newregistrationinvalidpassword() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/emre/Desktop/Selenium/ChromeDriver/chromedriver.exe"); // Custom your path
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("sf-OldMyAccount-PhY-T")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("register")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstName")).sendKeys("testUser");
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("testUserSurname");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("test2@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("checkSubscribeEmail")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnSignUpSubmit")).click();
    }
}
