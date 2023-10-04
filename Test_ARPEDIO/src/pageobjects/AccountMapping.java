package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AccountMapping"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class AccountMapping {

	@TextType()
	@FindBy(xpath = "(//tr[@class='slds-hint-parent'])[1]/th/div")
	public WebElement Contact1;
	
	@TextType()
	@FindBy(xpath = "(//tr[@class='slds-hint-parent'])[2]/th/div")
	public WebElement Contact2;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Relationship Mapping']")
	public WebElement relationshipMapping;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='customTab8__item']")
	public WebElement accountPlanning;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='flexipage_tab__item']")
	public WebElement aRPEDIOMatrix;
			
}
