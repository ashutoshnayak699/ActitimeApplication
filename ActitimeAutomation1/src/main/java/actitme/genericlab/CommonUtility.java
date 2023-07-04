package actitme.genericlab;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility {
	public int getRandomNum() {
		Random r=new Random();
		int num=r.nextInt(10000);
		return num;
	}
	public void alertCancel(WebDriver driver){
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	public String alertMsg(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		return msg;
	}
	public void getSelectByVisibleText(WebElement dropdown, String visibletext) {
		Select s=new Select(dropdown);
		s.deselectByVisibleText(visibletext);
	}
	public void getSelectByIndex(WebElement dropdown, int index) {
		Select s=new Select(dropdown);
		s.selectByIndex(index);
	}
	public void textToBepresentWait(WebDriver driver, By locater,String text) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(locater,text));
	    
	}
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element);
	}
	public void moveToElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element);
	}
	

}
