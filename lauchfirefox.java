package selepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lauchfirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\server\\IdeaProjects\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://legacy.thetestingacademy.com/");


    }
}
