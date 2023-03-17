package selepack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertprompt {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\server\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://letcode.in/alert");
        WebElement alertbox = driver.findElement(By.id("accept"));
        alertbox.click();
        //take the browser(driver) control(switchto) into dialog - important
        Alert control = driver.switchTo().alert();
        control.accept(); // accept the dialog
        WebElement declinebox = driver.findElement(By.id("confirm"));
        declinebox.click();
        Alert decline = driver.switchTo().alert();
        decline.dismiss(); // decline the dialog
        WebElement promptbox = driver.findElement(By.xpath("//*[@id='prompt'])"));
        promptbox.click();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Move Ahead"); // enter text in promptbox
        prompt.accept();
    }
}
