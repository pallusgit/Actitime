package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public FileUtility fileUtils = new FileUtility();
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser) throws IOException {
		if(browser.equals("chrome")) {
		driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
		driver=new EdgeDriver();
		}else if(browser.equals("gecko")){
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = fileUtils.readDataFromProperty("url");
		driver.get(url);}
	@AfterClass
	public void closeBrowser() {
		driver.quit();	
		}
	@BeforeMethod
	public void login() throws IOException {
		String un = fileUtils.readDataFromProperty("username");
		String pwd = fileUtils.readDataFromProperty("password");
		LoginPage l = new LoginPage(driver);
		l.login(un,pwd);
	}
	@AfterMethod
	public void logout() {
    HomePage h = new HomePage(driver);
    h.getLogoutBtn().click();
	//driver.findElement(By.id("logoutLink")).click();
	}
}
