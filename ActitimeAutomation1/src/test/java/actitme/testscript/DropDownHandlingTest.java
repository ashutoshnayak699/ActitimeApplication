package actitme.testscript;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import actitme.genericlab.BaseClass;

public class DropDownHandlingTest extends BaseClass {
	@Test
	public void handleDropdown(){
		
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
		
		WebElement usergroupdropdown=driver.findElement(By.name("firstHierarchyLevelCode"));
		cu.getSelectByIndex(usergroupdropdown, 4);
		WebElement text=driver.findElement(By.id("FormModifiedTextCell"));
		System.out.println(text.getText());
		
	}

}
