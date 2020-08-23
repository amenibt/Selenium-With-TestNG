package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
    
	/* Locators */

	final static String INPUT_TEXT = "//input[@ng-model='newTodo']";
	final static String ELEMENT_1 = "/html/body/ng-view/section/section/ul/li[1]/div/label";
	final static String CHECKBOX = "//input[@type= 'checkbox']";
	final static String REMOVE_ELEMENT = "//button[@CLASS='clear-completed']";
	/* @FindBy */

	@FindBy(how = How.XPATH, using = INPUT_TEXT)
	public static WebElement inputText;
	@FindBy(how = How.XPATH, using = ELEMENT_1)
	public static WebElement element1;
	@FindBy(how = How.XPATH, using = CHECKBOX)
	public static WebElement chechkbox;
	@FindBy(how = How.XPATH, using = REMOVE_ELEMENT)
	public static WebElement removeElement;
	
	/*Add Methods*/
	
	public void submitTodo(String todo) {
		writeText(inputText, todo);
		inputText.sendKeys(Keys.ENTER);
	}
public Boolean isElementDisplayed(WebElement element) {
		
		Boolean isElementDisplayed=element.isDisplayed();
		return isElementDisplayed;
	}
	
	public String checkElementContain(WebElement element) {
		
		String elementTodo=element.getText();
		return elementTodo;
	}
	
	public Boolean isCheckboxSelected(WebElement element) {
		
		Boolean isCheckboxSelected=element.isSelected();
		return isCheckboxSelected;
	}
	public void removeElement() {
		click(removeElement);
		click(chechkbox);
	}
	
	public String getPageSource() {
		String element =driver.getPageSource();
		return element;
	}
	
}
