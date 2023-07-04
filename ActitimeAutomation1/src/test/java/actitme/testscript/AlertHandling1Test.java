package actitme.testscript;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import actitme.genericlab.BaseClass;

public class AlertHandling1Test extends BaseClass{
	
	@Test
	public void handleAlert() throws EncryptedDocumentException, IOException {
		
	driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
	driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	driver.findElement(By.name("name")).sendKeys(du.getDataFromExcelsheet("Sheet1", 0, 1));
	driver.findElement(By.xpath("//td[@id='ButtonPane']/input[@type='button']")).click();
	String msg=cu.alertMsg(driver);
	System.out.println(msg);
	cu.alertCancel(driver);
	}
}


