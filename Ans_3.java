package javaTask21Answers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ans_3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top");
		List<WebElement> li = driver.findElements(By.xpath("/html[contains(.,'TOP')]"));
		int size = li.size();
		System.out.println(size);
		driver.switchTo().frame("frame-left");
		WebElement txt1 = driver.findElement(By.xpath("/html[contains(.,'LEFT')]"));
		String text = txt1.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		WebElement txt2 = driver.findElement(By.xpath("//body/div[contains(.,'MIDDLE')]"));
		String text1 = txt2.getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-right");
		WebElement txt3 = driver.findElement(By.xpath("/html[contains(.,'RIGHT')]"));
		String text2 = txt3.getText();
		System.out.println(text2);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		WebElement txt4 = driver.findElement(By.xpath("/html[contains(.,'BOTTOM')]"));
		String text3 = txt4.getText();
		System.out.println(text3);
		driver.switchTo().defaultContent();
		String ActualTitle = "Frames";
		String ExpectedTitle = driver.getTitle();
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("The Title is Frames");
		} else {
			System.out.println("The Title is not Frames");
		}

		// Output
		/*
		 *  3 
		 *  LEFT
		 *  MIDDLE 
		 *  RIGHT 
		 *  BOTTOM 
		 * The Title is not Frames
		 */
		  
		  
		  
		  
		 

	}

}
