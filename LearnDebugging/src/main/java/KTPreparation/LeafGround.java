package KTPreparation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriver frame = driver.switchTo().frame(0);
		System.out.println(frame);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		driver.close();

	}

}
