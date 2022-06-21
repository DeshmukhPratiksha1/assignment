package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyOnlinePlan {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@data-action='online plans']")
	private WebElement onlineplan;
	
	@FindBy(xpath = "//*[@class='third_navUL third_navUL03']//span[text()='Retirement Plan']")
	private WebElement retiremenplan;
	
	public BuyOnlinePlan(WebDriver driver)
	{
		this.driver = driver;//initialise webdriver
		
		PageFactory.initElements(driver, this);//initialise webelment
	}
	
	public void selectPlan()
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(onlineplan).perform();
		
		retiremenplan.click();
	}
	
	public String getUrl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	

}
