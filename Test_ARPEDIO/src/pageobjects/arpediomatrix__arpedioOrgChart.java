package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="arpediomatrix__arpedioOrgChart"                                
               , summary=""
               , connection="UAT"
               , lightningWebComponent="arpedioOrgChart"
               , namespacePrefix="arpediomatrix"
     )             
public class arpediomatrix__arpedioOrgChart {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//arpediomatrix-arpedio-org-chart//lightning-button/button[normalize-space(.)='Matrix']")
	public WebElement matrix;
	
}
