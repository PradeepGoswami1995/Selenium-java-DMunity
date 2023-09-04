
// import java.text.SimpleDateFormat;
// import java.util.Date;
// import org.apache.commons.io.FileUtils;
// import org.openqa.selenium.By;
// import org.openqa.selenium.OutputType;
// import org.openqa.selenium.TakesScreenshot;
// import java.io.File;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DM {

    private WebDriver driver;

    // Static initializer to set up ChromeDriver property once
    static {
        System.setProperty("webdriver.chrome.driver", "E:\\JavaP3\\lib\\driver\\chromedriver-win64\\chromedriver.exe");
    }

    public DM() {
        // Create a new instance of the ChromeDriver
        this.driver = new ChromeDriver();
    }

    public void Mylogin() {
        // Open the Chrome browser
        driver.get("https://stage-dmunity.thefamcomlab.com/");
        driver.manage().window().maximize();

        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on the login button
        driver.findElement(By.xpath("//*[@id=\"offcanvasNavbar-expand-lg\"]/div[2]/div/button[1]")).click();

    }

    void complete() {
        System.out.println("Testing Complete Yeeeeeeee");
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void screenshot() {
        // Take a screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE);

        // Generate a unique file name using a timestamp
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = dateFormat.format(new Date());
        String fileName = "Dmunity_" + timestamp + ".png";

        // Specify the destination file
        File destination = new File("D:\\Images\\" + fileName);

        // Copy the screenshot file to the destination
        try {
            FileUtils.copyFile(screenshot, destination);
            System.out.println("Screenshot saved: " + destination.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        DM mylog = new DM();
        mylog.Mylogin(); // Open the website
        mylog.complete(); // opening messsage for completion
        mylog.screenshot();// Take screenshot of the website

    }
}