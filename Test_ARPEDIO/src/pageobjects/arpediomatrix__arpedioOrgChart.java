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
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//td//td[1]/table/tr/td/div/div/div[1]/div/img")
	public WebElement removecontactOrgChart;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Accept']")
	public WebElement accept;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[normalize-space(.)='Arpedio Contact 1']")
	public WebElement clickContactOrgChart;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Yes']")
	public WebElement ContactAddOrgChartConfirm;
	@TextType()
	@FindBy(xpath = "(//tr[@class='nodes']//td//table)[2]//td/div[@draggable='true']")
	public WebElement draggableContact2;

	@TextType()
	@FindBy(xpath = "(//tr[@class='nodes']//td//table)[1]//td/div[@draggable='true']")
	public WebElement draggableContact1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[normalize-space(.)='Arpedio Contact 2']")
	public WebElement ContactOrgChart2;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//td[1]//td/div/div/div[3]/div[2]/div/div[1]")
	public WebElement toBeDragged;

	
}
