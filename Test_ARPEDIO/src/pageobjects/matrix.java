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

		@TextType()
		@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-base-combobox-item[@id='combobox-button-662-2-662']")
		public WebElement stakeholderType;

		@ButtonType()
		@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Add']")
		public WebElement add;

		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('arpediomatrix-matrix').shadowRoot.querySelector('c-matrix-table').shadowRoot.querySelector('c-popup-modal').shadowRoot.querySelector('section')")
		public WebElement TM;

		@ButtonType()
		@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Remove']")
		public WebElement remove;

		@ButtonType()
		@JavascriptBy(jspath = "return document.querySelector('arpediomatrix-matrix').shadowRoot.querySelector('c-matrix-table').shadowRoot.querySelector('lightning-button').shadowRoot.querySelector('button')")
		public WebElement removeStakeholderfinal;
	
}




