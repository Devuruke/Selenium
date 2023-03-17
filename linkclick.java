package selepack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class linkclick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\server\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://www.testleaf.com/index.html/");
        //click the link from this website
        driver.findElement(By.linkText("Courses")).click();
    }
}
