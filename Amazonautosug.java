package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonautosug {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver auto = new ChromeDriver();
		auto.get("https://www.amazon.in/");
		auto.manage().window().maximize();
		auto.findElement(By.xpath("//input [@id='unifiedLocation1ClickAddress']")).sendKeys("Mobile");
		Thread.sleep(2000);
		auto.findElement(By.xpath("//div[@class='left-pane-results-container']//div[@aria-label='mobile 5+g']")).click();
	}
	

	
	
}
