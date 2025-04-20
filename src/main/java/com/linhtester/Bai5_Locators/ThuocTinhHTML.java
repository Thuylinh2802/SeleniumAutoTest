package com.linhtester.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ThuocTinhHTML {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver(); //Mở trình duyệt Chrome
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Vào trang web chỉ định
        driver.get("https://crm.anhtester.com/admin/authentication");

        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        //driver.findElement(By.linkText("Forgot Password?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();

        driver.findElement(By.className("checkbox")).click();
        //Dựa vào tagname click nút Login
        driver.findElement(By.tagName("button")).click();

        //Click menu Customers
        driver.findElement(By.className("menu-item-customers")).click();

        //Dùng xpath tuyệt đối lấy nút Add New Customer
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/a[1]")).click();
        Thread.sleep(1000);

        driver.quit(); //Đóng trình duyệt
    }
}
