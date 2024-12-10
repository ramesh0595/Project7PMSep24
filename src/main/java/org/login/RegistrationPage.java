package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement btnCreate;
	
	@FindBy(name="firstname")
	private WebElement txtFirst;
	
	@FindBy(name="lastname")
	private WebElement txtLast;
	
	
	@FindBy(name="websubmit")
	private WebElement btnSignup;


	public WebElement getBtnCreate() {
		return btnCreate;
	}


	public WebElement getTxtFirst() {
		return txtFirst;
	}


	public WebElement getTxtLast() {
		return txtLast;
	}


	public WebElement getBtnSignup() {
		return btnSignup;
	}

	
	
	
}
