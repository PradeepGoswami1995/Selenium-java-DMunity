import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Dmunityforgotpassword {

    public static void main(String[] args) throws InterruptedException, IOException {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "E:\\JavaP3\\lib\\driver\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the Chrome browser
        driver.get("https://stage-dmunity.thefamcomlab.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // Click on the login button
        driver.findElement(By.xpath("//*[@id=\"offcanvasNavbar-expand-lg\"]/div[2]/div/button[1]")).click();
        Thread.sleep(2000);

        // Enter email and password
        driver.findElement(By.id(":r0:")).sendKeys("hunnygoswami123@yopmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/form/div[3]/a"))
                .click();
        Thread.sleep(2000);

        // may need to change window

        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button[2]")).click();

        driver.findElement(By.name("Submit")).click();
        // driver.findElement(By.className("class="")).click();

        Thread.sleep(2000);

        // driver.get("https://webmail.emailsrvr.com/");

        // Opend yopmail.com
        driver.get("https://yopmail.com/");

        driver.findElement(By.id("login")).sendKeys("hunnygoswami123@yopmail.com");
        driver.findElement(
                By.xpath("/html/body/div[1]/div[2]/main/div[3]/div/div[1]/div[2]/div/div/form/div/div/div[4]/button/i"))
                .click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#e_ZwZjBQV0ZGxjZQZjZQNjAwp0AmRjZD\\=\\= >button > div.lms")).click();

        Thread.sleep(2000);

    }
}
