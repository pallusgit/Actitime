package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[@class='title ellipsis']")
private WebElement addNewBtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomerBtn;
@FindBy(xpath="//input[contains(@class,'inputNameField')]")
private WebElement CustomerNameTbx;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement customerDescTbx;
@FindBy(className = "emptySelection")
private WebElement customerDropdown;
@FindBy(xpath="//div[@class='comboboxButton focused']//input")
private WebElement customerSearchBox;
@FindBy(xpath="//span[contains(@class,'WithPlaceholderContainer')]//div[.='Our company']")
private WebElement bigBangCompanyBtn;
@FindBy(xpath = "//div[text()='Create Customer']")
private WebElement createCustomerBtn;
@FindBy(xpath="//div[@class='topContainer']//div[@class='title']")
private WebElement customerTitle;

@FindBy(xpath="//div[@class='customersProjectsPanel']//input[@placeholder]")
private WebElement findTheCustTextBox;
@FindBy(className ="highlightToken")
private WebElement selectCustomer;
@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='editButton']")
private WebElement editButton;
@FindBy(xpath="//div[@class='editCustomerPanelHeader']//div[text()='ACTIONS']")
private WebElement actionsBtn;
@FindBy(xpath="//div[@class='taskManagement_customerPanel']//div[text()='Delete']")
private WebElement deleteBtn;
@FindBy(xpath="//span[text()='Delete permanently']")
private WebElement deletePermanentlyBtn;

public WebElement getCustomerTitle() {
	return customerTitle;
}
public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewCustomerBtn() {
	return newCustomerBtn;
}
public WebElement getCustomerNameTbx() {
	return CustomerNameTbx;
}
public WebElement getCustomerDescTbx() {
	return customerDescTbx;
}
public WebElement getCustomerDropdown() {
	return customerDropdown;
}
public WebElement getCustomerSearchBox() {
	return customerSearchBox;
}
public WebElement getBigBangCompanyBtn() {
	return bigBangCompanyBtn;
}
public WebElement getCreateCustomerBtn() {
	return createCustomerBtn;
}
public WebElement getFindTheCustTextBox() {
	return findTheCustTextBox;
}
public WebElement getSelectCustomer() {
	return selectCustomer;
}
public WebElement getEditButton() {
	return editButton;
}
public WebElement getActionsBtn() {
	return actionsBtn;
}
public WebElement getDeleteBtn() {
	return deleteBtn;
}
public WebElement getDeletePermanentlyBtn() {
	return deletePermanentlyBtn;
}


}
