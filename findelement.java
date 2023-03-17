package selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findelement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\server\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://www.google.co.in");
        //Enter value in searchbox
        //click enter
        driver.findElement(By.name("q")).sendKeys("Agni"+Keys.ENTER);
        driver.quit();
    }
}
