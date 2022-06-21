package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
	
	@FindBy(xpath = "//*[@class='insurenceTypes']//h2[text()='Health Insurance']")
	private WebElement healthinsurance;
	
	@FindBy(xpath = "//*[@class='insurenceTypes']//h2[text()='Car Insurance']")
	private WebElement carinsurance;
	
	@FindBy(xpath = "//*[@class='insurenceTypes']//h2[text()='Two Wheeler Insurance']")
	private WebElement twowheelerinsurance;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;//initialise webdriver
		
		PageFactory.initElements(driver, this);//initialise webelment
	}
	
	public void selectInsurance(String insurancetype)
	{
		if(insurancetype.contains("Health"))
		{
			healthinsurance.click();
		}
		else if(insurancetype.contains("car"))
		{
			carinsurance.click();
		}
		else
		{
			twowheelerinsurance.click();
		}
	}
	

}
