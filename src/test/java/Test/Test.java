package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Test {
	static WebDriver driver;
	@BeforeClass
	public static void B4Class() {
		System.out.println("This will only print once, before class since we only have one class");
	}
	
	@Before
	public void B4Method() {
		System.out.println("this will print before each method");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Usman\\eclipse-workspace\\mavenlearn\\chromedriver.exe");
		String url= "https://www.facebook.com/";
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterClass
	public static void afterc() {
		System.out.println("this will print at the end of each class, once only since we have only one class");
	}
	
	@After
	public void afterm() throws InterruptedException {
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.close();
	}
	
	@org.junit.Test
	public void testing() {
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("bravo16@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Abcd1234");
		
		//driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		System.out.println("Page Title:"+driver.getTitle());
	}
	
	@org.junit.Test
	public void Test2()
	{
		System.out.println("This is my second test");
	}
	
	@org.junit.Test
	public void Test3() {
		System.out.println("This is my 3rd test");
	}
	
//	@org.junit.Test
//	public void testing2() {
//		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Usman\\eclipse-workspace\\mavenlearn\\chromedriver.exe");
//		String url= "https://www.amazon.com/";
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
//		System.out.println(driver.getTitle());
//	}

}
