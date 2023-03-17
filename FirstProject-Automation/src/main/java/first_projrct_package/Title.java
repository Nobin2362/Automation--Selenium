package first_projrct_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Title {

	public static void main(String[] args) {
		
		String expectedtitle = "Swag Labs";
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actualtitle=driver.getTitle();
		Assert(actualtitle, expectedtitle);
		driver.close();
		
	}

	private static void Assert(String actualtitle, String expectedtitle) {
		// TODO Auto-generated method stub
		
	}

}
