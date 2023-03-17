package selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;

public class clickbutton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\server\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://letcode.in/buttons");
        //1. Get X Y position
        WebElement getPosition = driver.findElement(By.id("position"));
        //POINT is a keyword to identify x & y location
        //Tip > if dont know what datatype has to give first, Hover the last method> there u find respective datatype
        Point xypoint = getPosition.getLocation();
        int xvalue = xypoint.getX();
        int yvalue = xypoint.getY();
        System.out.println("Xvalue is :"+xvalue +  "Yvalue is :"+yvalue);

        //2.Find the color
        WebElement getColor = driver.findElement(By.id("color"));
        String color = getColor.getCssValue("background-color");
        System.out.println("Button Color :" +color);

        //3. Find height,width
        //Hurrayy!!! - Own written by practice without reference
        WebElement getHeightWidth = driver.findElement(By.id("property"));
        Dimension size = getHeightWidth.getSize();
        double height= size.getHeight();
        double width = size.getWidth();
        System.out.println("Height is: "+height + "Width is : "+width);
        //also written in simple lke,
        WebElement getHW = driver.findElement(By.id("property"));
       int height1 = getHW.getSize().getHeight();
       int width1 = getHW.getSize().getWidth();
       System.out.println("Height is : "+height1 + "Width is :" +width1);

       //4. button is disabled
        WebElement disabled = driver.findElement(By.id("isDisabled"));
        boolean disablebtn=disabled.isEnabled();
        System.out.println(" Button is enabled : "+disablebtn);

        //5. Goto homepage (click button action)
        WebElement clickbtn = driver.findElement(By.id("home"));
        clickbtn.click();
    }
}
