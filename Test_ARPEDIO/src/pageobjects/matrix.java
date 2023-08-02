package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Matrix"                                
               , summary=""
               , connection="UAT"
               , auraComponent="matrix"
               , namespacePrefix=""
     )             
public class matrix {

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@type='search']")
	public WebElement search;
	
		@TextType()
	@FindBy(xpath = "//div[contains(@class,'search-modal__list-wrapper')]")
	public WebElement search_dropdown;
	
}




