package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import util.Utility;

public class Prop  {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Prop() 
	{
		 try {
		prop=new Properties();
		FileInputStream fs;
		
			fs = new FileInputStream("D:\\ecomspencer\\spencer\\config\\config.properties");
			prop.load(fs);
		 }catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
			
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 }
	
	
	public void initialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		    driver=new ChromeDriver();
		}
		else if(browsername.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		    driver=new FirefoxDriver();
		}
		
		else if (browsername.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
		    driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
 
		driver.manage().timeouts().implicitlyWait(Utility.implicitwait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utility.pageloadtime,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
	

}
