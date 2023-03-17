package selepack;

import io.netty.handler.codec.bytes.ByteArrayDecoder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class editextbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\server\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        //In selenium, text will be APPEND next to existing one, it will not OVERWRITE
        //https://letcode.in/edit - use for reference
        driver.get("https://letcode.in/edit");
        //way of writing with findElement for textbox
        // -> driver.findElement(By.id("fullName")).sendKeys("Dhivya Murugan");
        //change above code into readable & easy made
        //Hover the last method, can see the element(web)
        WebElement emailbox= driver.findElement(By.id("fullName"));
        emailbox.sendKeys("Dhivya Murugan");
        //driver.findElement(By.id("join")).sendKeys(" person");
        WebElement AppendBox= driver.findElement(By.id("join"));
        AppendBox.sendKeys(" person", Keys.TAB);
        //usingxpath
        //String value = driver.findElement(By.xpath("//*[@id='getMe']")).getAttribute("value");
        WebElement getboxvalue = driver.findElement(By.xpath("//*[@id='getMe']"));
        String value = getboxvalue.getAttribute("value");
        System.out.println(value);
        //driver.findElement(By.xpath("//*[@id=\'clearMe\']")).clear();
        WebElement clearBox = driver.findElement(By.xpath("//*[@id=\'clearMe\']"));
        clearBox.clear();
        WebElement disabledBox = driver.findElement(By.xpath("//*[@id='noEdit']"));
        boolean enabled =  disabledBox.isEnabled();
        System.out.println(enabled);
        WebElement readOnly = driver.findElement(By.id("dontwrite"));
        readOnly.getAttribute("value");

    }
}
