package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="arpediomatrix__matrixPreview"                                
               , summary=""
               , connection="UAT"
               , lightningWebComponent="matrixPreview"
               , namespacePrefix="arpediomatrix"
     )             
public class arpediomatrix__matrixPreview {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//arpediomatrix-matrix-preview//lightning-button/button[normalize-space(.)='Matrix']")
	public WebElement matrixButton;
	
}
