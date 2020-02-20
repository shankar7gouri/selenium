package DriverScript;

import org.openqa.selenium.WebDriver;


import commonFunctionsLib.CommonfunctionsForOrangeHrm;



public class DummyClass {
	


	public static void main(String[] args) throws Exception {
		WebDriver shank=CommonfunctionsForOrangeHrm.startBrowser();
		CommonfunctionsForOrangeHrm.openApp(shank);
		CommonfunctionsForOrangeHrm.waitForElement(shank, "xpath", "//*[@id='txtUsername']", "10");
		CommonfunctionsForOrangeHrm.typeAction(shank, "xpath", "//*[@id='txtUsername']", "Admin");
		
		CommonfunctionsForOrangeHrm.waitForElement(shank, "id", "txtPassword", "10");
		CommonfunctionsForOrangeHrm.typeAction(shank, "name", "txtPassword", "Qedge123!@#");
		
		CommonfunctionsForOrangeHrm.waitForElement(shank, "name", "Submit", "10");
		CommonfunctionsForOrangeHrm.clickAction(shank, "name", "Submit");
		CommonfunctionsForOrangeHrm.clickAction(shank, "xpath", "//*[@id='menu_admin_viewAdminModule']");
		CommonfunctionsForOrangeHrm.clickAction(shank, "id", "btnAdd");
		CommonfunctionsForOrangeHrm.slectAction(shank, "id", "systemUser_userType", "Admin");
		CommonfunctionsForOrangeHrm.waitForElement(shank, "id","welcome","10");
		CommonfunctionsForOrangeHrm.clickAction(shank, "id", "welcome");
		
		CommonfunctionsForOrangeHrm.waitForElement(shank, "xpath", "(//*[text()='Logout'])[1]", "10");
		CommonfunctionsForOrangeHrm.clickAction(shank, "xpath", "(//*[text()='Logout'])[1]");
		CommonfunctionsForOrangeHrm.closebrw(shank);
		
		
	
	}

}
