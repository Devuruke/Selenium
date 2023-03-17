package selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class radiobutton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\server\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://letcode.in/radio");
        //find button is selected
        WebElement radiobtn = driver.findElement(By.xpath("//*[@id=\'notfoo\']"));
        boolean radio= radiobtn.isSelected();
        System.out.println("Radio button is selected : "+radio);
        //Click the radio button
        WebElement rdbtn = driver.findElement(By.id("one"));
        rdbtn.click();

        //CHECKBOX
        WebElement checkbox = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]"));
        boolean chkbox = checkbox.isSelected();
        System.out.println("Checkbox is selected" +chkbox);
        //Deselect the selected checkbox from two checkbox
        WebElement firstCbox = driver.findElement(By.id("sampletest"));
        if (firstCbox.isSelected()) {
            firstCbox.click();
        }
        WebElement secondCbox = driver.findElement(By.id("sampletest"));
        if (secondCbox.isSelected()){
            secondCbox.click();
        }


    }
}
