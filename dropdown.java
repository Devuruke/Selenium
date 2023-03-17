package selepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdown {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\server\\IdeaProjects\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://letcode.in/dropdowns");
        //For Dropdown, selenium has created the method select()
        //Select has 3 ways :
        //1. Select by index > Index starts with 0. identify the position in row wise
        //2. Select by value > every dropdown has value inside the element > assigned value is user choice
        //3. Select by visible text > text which is visible in frontend
        WebElement selectindex = driver.findElement(By.id("fruits"));
        // by default SELECT used for dropdown
        Select select = new Select(selectindex);
        select.selectByIndex(3);
        //to view the data loading, but mostly thread will not used here because of no scope then using automation
        Thread.sleep(3000);
        //Select "" using value & print the selected value
        select.selectByValue("1");
        System.out.println("Selected value is :" +select); // not fetched output
        select.selectByVisibleText("Apple");
        //Multiple select > use SELECT  key
        WebElement multiCheck = driver.findElement(By.id("superheros"));
        Select multi =new Select(multiCheck);
        multi.selectByIndex(1);
        multi.selectByIndex(3);
        multi.selectByIndex(5);
        //How many dropdown are there > list()
        WebElement list = driver.findElement(By.id("lang"));
       List listofoptions =  select.getOptions();
       int fullist =  listofoptions.size();
        System.out.println("Number of elements :" +fullist);
        //use sendkeys to select the dropdown
        //if u have list of dropdown,use sendkeys to easy select

    }
}
