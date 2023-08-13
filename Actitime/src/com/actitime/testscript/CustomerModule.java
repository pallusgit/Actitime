package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
//		HomePage h = new HomePage(driver);
//		h.getTaskListTab().click();
//		TaskListPage t = new TaskListPage(driver);
//		t.getAddNewBtn().click();
//		t.getNewCustomerBtn().click();
//		String customerName = fileUtils.readDataFromExcel("CreateCustomer", 1,2);
//		String customerDescription = fileUtils.readDataFromExcel("CreateCustomer", 1, 3);
//		t.getCustomerNameTbx().sendKeys(customerName);
//		t.getCustomerDescTbx().sendKeys(customerDescription);
//		t.getCustomerDropdown().click();
//		Thread.sleep(2000);
//		String companyName = fileUtils.readDataFromExcel("CreateCustomer", 1, 4);
//		t.getCustomerSearchBox().sendKeys("Our company");
//		Thread.sleep(3000);
//		t.getBigBangCompanyBtn().click();
//		t.getCreateCustomerBtn().click();Thread.sleep(5000);
//		String actualCustTitle = t.getCustomerTitle().getText();
//		Assert.assertEquals(actualCustTitle, customerName);Thread.sleep(5000);
//
	}	@Test
	public void deleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
//		HomePage h = new HomePage(driver);
//		h.getTaskListTab().click();
//		TaskListPage t = new TaskListPage(driver);
//		String customerName = fileUtils.readDataFromExcel("CreateCustomer", 1,2);
//		t.getFindTheCustTextBox().sendKeys(customerName);
//		t.getSelectCustomer().click();
//		t.getEditButton().click();
//		Thread.sleep(2000);
//		t.getActionsBtn().click();
//		t.getDeleteBtn().click();
//		t.getDeletePermanentlyBtn().click();
//		Thread.sleep(2000);
	}
}









