package actitme.testscript;

//by using Listeners
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actitme.genericlab.BaseClass;

@Listeners(actitme.genericlab.ListenerImplementation.class)
public class CustomerCreation3Test extends BaseClass {
	@Test
	public void main() throws InterruptedException, EncryptedDocumentException, IOException {
		
		String customername=du.getDataFromExcelsheet("Sheet1", 0, 1);
		int num=cu.getRandomNum();
		customername=customername+num;
		

	   //click on task
	   driver.findElement(By.id("container_tasks")).click();
	   
	   //click on add new 
	   driver.findElement(By.className("plusIcon")).click();
	  
	   //click on new customer
       driver.findElement(By.className("createNewCustomer")).click();
       
       //add new name
       driver.findElement(By.className("newNameField")).sendKeys(customername);
       //add description
       driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("Qspider");
      //click on create
       driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
       
       cu.textToBepresentWait(driver,By.cssSelector(".titleEditButtonContainer>.title") , customername);
       //get text on the page
       String actualname=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
       Reporter.log(actualname, true);
       
	}

}
