package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {

        // Khởi tạo trình duyệt Chrome
        EdgeDriver driver = new EdgeDriver();

        // Mở trang web
        driver.get("https://www.demoblaze.com/");

        // Phóng to trình duyệt
        driver.manage().window().maximize();

        // Khởi tạo WebDriverWait với thời gian chờ là 20 giây
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Thread.sleep(1000);
        WebElement SSG = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img"));
        SSG.click();

        Thread.sleep(1000);
        WebElement BtnATC = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
        BtnATC.click();

        Thread.sleep(1000);
        Alert alert= driver.switchTo().alert();
        alert.accept();

        Thread.sleep(1000);
        WebElement BtnCart = driver.findElement(By.xpath("//*[@id=\"cartur\"]"));
        BtnCart.click();


        Thread.sleep(1000);
        WebElement Exit = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a"));
        Exit.click();

        Thread.sleep(1000);
        WebElement BtnHome = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
        BtnHome.click();

        Thread.sleep(1000);
        WebElement ImgNokia = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img"));
        ImgNokia.click();

        Thread.sleep(1000);
        WebElement BtnAddtocartNokia  = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
        BtnAddtocartNokia.click();

        Thread.sleep(1000);
        Alert alert2= driver.switchTo().alert();
        alert2.accept();

    }
        }




