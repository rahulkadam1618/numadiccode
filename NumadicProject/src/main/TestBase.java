package org.numadic.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.taxblock.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public static void initialization() {
		
		
		
		try {
			
			prop=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\GlobalConfig.properties"); 
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
			
		} catch (IOException e) {
			
			
		}
		
		
		
		String browserName=prop.getProperty("browser1");
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
				
		}
		
		
		else if(browserName.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();

			
			
		}
		
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

		driver.get(prop.getProperty("url"));

	}
	
}
