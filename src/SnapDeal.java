import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public SnapDeal() {
			//set system property for the chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\FELCY\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		}
	public void launchSnapdeal() {
		//initialize chrome driver 
		WebDriver driver = new ChromeDriver();
		//open snapdeal url
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
        try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement element = driver.findElement(By.className("accountInner"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).build().perform();
		
		WebElement element2 = driver.findElement(By.linkText("Your Account"));
		element2.click();
		// enter the username 
		driver.findElement(By.id("userName")).sendKeys("felcygrace001@gmail.com");
		//click the button 
		driver.findElement(By.id("checkUser")).click();
		
		System.out.print("Snapdeal Login Is Sucessfull");
		

	}
		
	public static void main(String[] args) {
	SnapDeal snapdeal = new SnapDeal();
	snapdeal.launchSnapdeal();

	}

}
