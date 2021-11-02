package MileStone2_selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
	
    public static String url="https://www.homecentre.in/";
	public static void main(String[] args) throws InterruptedException
	{
	//Browser Setup
		
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumNew\\HARSHA\\eclipse-workspace\\MileStone2\\driver1\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	
	options.addArguments("disable-popup-blocking");
    options.addArguments("--disable-notifications");
	//Chrome driver intialization
	

	WebDriver driver= new ChromeDriver(options);
	driver.get("https://www.homecentre.in/");
	
	driver.findElement(By.id("js-site-search-input")).sendKeys("tea cups");
	
	Thread.sleep(2000L);
	
	
	driver.findElement(By.xpath("//*[@id=\"page-header\"]/div/span[3]/span[1]/div/ul[2]/li[1]/a")).click();
	WebElement Nverify= driver.findElement(By.xpath("//h1[@id='product-details-name']"));
	
	String product= Nverify.getText();
	if(product.equalsIgnoreCase("Raisa-Retro Printed Tea Mug")) {
		System.out.println("CUP NAME MATCHED");
	}
	else {
		System.out.println("CUP NAME not MATCHED");
	}
	
	WebElement addtobasket= driver.findElement(By.xpath("//fieldset[@class='show old-button-set'] //button[@id=\"product-actions-btn-add\"]"));
	addtobasket.click();
	
	Thread.sleep(2000L);
	WebElement checkout= driver.findElement(By.xpath("//div[@class='miniCart_row miniCart_row--center'] //button[@id='btn-checkout']"));
	
	checkout.click();
	driver.close();


}
}


