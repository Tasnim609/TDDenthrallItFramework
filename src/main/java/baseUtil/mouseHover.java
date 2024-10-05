package baseUtil;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//URl
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		WebElement mh = driver.findElement(By.className("menulink"));
		Actions action1 = new Actions (driver);
		action1.moveToElement(mh).build().perform();
		driver.findElement(By.xpath("(//a[text()='Courses'])[2]")).click();
	}

}
