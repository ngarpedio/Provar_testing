package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="TestingTable"                                
     , summary=""
     , relativeUrl=""
     , connection="UAT"
     )             
public class TestingTable {

	@PageRow()
	public static class TableNicholas {

		@FacetFindBys(value = {
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/tbody/tbody"), facet = UiFacet.DATA_ROWS),
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/thead/tbody"), facet = UiFacet.HEADER_ROW) })
		@FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]")
		@PageTable(firstRowContainsHeaders = true, row = ThisTable.class)
		public List<ThisTable> thisTable;
	}

	@PageRow()
	public static class ThisTable {
	}

	@PageRow()
	public static class D {

		@FacetFindBys(value = {
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/tbody/tr"), facet = UiFacet.DATA_ROWS),
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/thead/tr"), facet = UiFacet.HEADER_ROW) })
		@FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]")
		@PageTable(firstRowContainsHeaders = false, row = ProvarGuidedTable.class)
		public List<ProvarGuidedTable> provarGuidedTable;
	}

	@PageRow()
	public static class ProvarGuidedTable {
	}

	@PageRow()
	public static class C {

		@FacetFindBys(value = {
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/tbody/tr"), facet = UiFacet.DATA_ROWS),
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/thead/tr"), facet = UiFacet.HEADER_ROW) })
		@FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]")
		@PageTable(firstRowContainsHeaders = false, row = Tablee.class)
		public List<Tablee> tablee;
	}

	@PageRow()
	public static class Tablee {
	}

	@PageRow()
	public static class DemoTable {

		@TextType()
		@FindBy(xpath = "//td//div//c-matrix-cell//div")
		public WebElement cUSTOMERSTAKEHOLDERS;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('arpediomatrix-matrix').shadowRoot.querySelector('c-matrix-table').shadowRoot.querySelectorAll('c-matrix-cell')[15].shadowRoot.querySelector('div')")
		public WebElement Assessment;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('arpediomatrix-matrix').shadowRoot.querySelector('c-matrix-table').shadowRoot.querySelectorAll('c-matrix-cell')[1].shadowRoot.querySelector('textarea')")
		public WebElement Text_for_Notes;
		@TextType()
		@FindBy(xpath = "//th[2]")
		public WebElement TM;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('arpediomatrix-matrix').shadowRoot.querySelector('c-matrix-table').shadowRoot.querySelectorAll('span')[1]")
		public WebElement TM1;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('arpediomatrix-matrix').shadowRoot.querySelector('c-matrix-table').shadowRoot.querySelector('c-matrix-stakeholder-cell').shadowRoot.querySelector('lightning-button-icon').shadowRoot.querySelector('button')")
		public WebElement removeStakeholder;
		@TextType()
		@FindBy(xpath = "//button[normalize-space(.)='Add team members']/lightning-primitive-icon")
		public WebElement addTeamMembers;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('arpediomatrix-matrix').shadowRoot.querySelector('c-matrix-table').shadowRoot.querySelector('lightning-helptext').shadowRoot.querySelector('lightning-button-icon').shadowRoot.querySelector('button')")
		public WebElement getteammember;
		@TextType()
		@FindBy(xpath = "//button[normalize-space(.)='Help']/lightning-primitive-icon")
		public WebElement help;
		@TextType()
		@JavascriptBy(jspath = "return document.querySelector('arpediomatrix-matrix').shadowRoot.querySelector('c-matrix-table').shadowRoot.querySelectorAll('c-matrix-cell')[4].shadowRoot.querySelector('textarea')")
		public WebElement TextArea;
		@TextType()
		@FindBy(xpath = "//th[5]")
		public WebElement TeamMember;
		@TextType()
		@FindBy(xpath = "//th[4]")
		public WebElement TeamMember1;
		@TextType()
		@FindBy(xpath = "//th[4]")
		public WebElement TeamMember11;
	}
	@PageTable(firstRowContainsHeaders = false, row = DemoTable.class)
	@FindBy(xpath = "//table//tr")
	public List<DemoTable> demoTable;
			
	public WebDriver driver;
	public TestingTable(WebDriver driver)
	{
	this.driver = driver;
	}
	
	public String getRows()
	{
	String str ="";
		List<WebElement> list = driver.findElements(By.xpath("//table//tr"));
		str = str+list.size();
		return str;
	}
		public String getColumns()
	{
	String str ="";
		List<WebElement> list = driver.findElements(By.xpath("//table//th"));
		str = str+list.size();
		return str;
	}
		@TextType()
		@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Details']/lightning-primitive-icon")
		public WebElement details;

		@TextType()
		@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Notes']/lightning-primitive-icon")
		public WebElement notes;
		
		public String addteamNon(String member) throws InterruptedException{
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']/input")).sendKeys(member);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div/div/ul[@class='slds-listbox slds-listbox_vertical']/li[2]/div")).click();
		List<WebElement> list=driver.findElements(By.xpath("//div/div/ul[@class='slds-listbox slds-listbox_vertical']/li/div"));
		if(list.size()>1){
		list.get(1).click();
		}else{
		list.get(0).click();
		
		
		}
		return member;}
	public List<String> getMembers(){
	List<String> s=new ArrayList<String>();
	List<WebElement> list=driver.findElements(By.xpath("//table[@data-id='matrixTable']/thead/tr/th/span[text()!='CUSTOMER STAKEHOLDERS']"));
	for(int i=0;i<list.size();i++){
			s.add(list.get(i).getText());
	}
	return s;
	
	}
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Get help']/lightning-primitive-icon")
	public WebElement getHelp;

	@TextType()
	@FindBy(xpath = "//b[normalize-space(.)='We hope you enjoy using the ARPEDIO Relationship Tool.']")
	public WebElement answer;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Convert']")
	public WebElement convert;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Convert']")
	public WebElement convert1;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Convert']")
	public WebElement convertButton;
		}
		
		
		
		
		
