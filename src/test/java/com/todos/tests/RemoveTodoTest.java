package com.todos.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class RemoveTodoTest extends Setup{

	public RemoveTodoTest() throws IOException {
		super();
	}
	
	TodoPage todoPage;
	
	@Test()
	public void iCanRemoveTodo() throws IOException {
		todoPage = new TodoPage();
		boolean elementText=todoPage.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(elementText);
		todoPage.submitTodo(prop.getProperty("todo1"));
		String elementTodo=todoPage.checkElementContain(TodoPage.element1);
		todoPage.removeElement();
	}
}
