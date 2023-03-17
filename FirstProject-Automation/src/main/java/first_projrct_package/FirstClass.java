package first_projrct_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		//Login with valid information
		//driver.get("https://www.saucedemo.com/");
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//String actualtitle=driver.getTitle();
		//System.out.println(actualtitle);
		
		
		//driver.getTitle("Swag Labs");
		//Thread.sleep(5000);
		//Waiting time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Log in
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//Add to cart to finish
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Rasel Hider");
		driver.findElement(By.id("last-name")).sendKeys("Nobin");
		driver.findElement(By.id("postal-code")).sendKeys("1900");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
		//log out
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		//Tab close
		//driver.close();
		
		//Browser close
		//driver.quit();

	}

}
