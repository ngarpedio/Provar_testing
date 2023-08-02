package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="UAT"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='New Account']")
	public WebElement newAccount;
	@TextType()
@FindBy(xpath = "//div[contains(@class,'matrix-table__string-cell')]")
	public WebElement cUSTOMERSTAKEHOLDERS;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[3]//button[normalize-space(.)='Add Stakeholder']/lightning-primitive-icon")
	public WebElement CUSTOMERSTAKEHOLDERS_3;
	@FindBy(xpath = "//table[contains(@class,'slds-table slds-table--bordered slds-no-row-hover slds-max-medium-table--stacked-horizontal matrix-table')]")
	@SalesforceBy()
	@TextType()
	public WebElement MatrixRelationshipTable;
	@PageRow()
	public static class RT {

		@FacetFindBys(value = {
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/tbody/tr"), facet = UiFacet.DATA_ROWS),
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/thead/tr"), facet = UiFacet.HEADER_ROW) })
		@FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]")
		@PageTable(firstRowContainsHeaders = false, row = TABLETEST.class)
		public List<TABLETEST> tABLETEST;
	}
	@PageRow()
	public static class TABLETEST {
	}
	@PageRow()
	public static class TableAgain {

		@FacetFindBys(value = {
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/tbody/tr"), facet = UiFacet.DATA_ROWS),
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/thead/tr"), facet = UiFacet.HEADER_ROW) })
		@FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]")
		@PageTable(firstRowContainsHeaders = false, row = TableAgain1.class)
		public List<TableAgain1> tableAgain;
	}
	@PageRow()
	public static class TableAgain1 {
	}
	@PageRow()
	public static class ThisTimepleaseWork {
	}
	@FacetFindBys(value = {
			@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/tbody/tr"), facet = UiFacet.DATA_ROWS),
			@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/thead/tr"), facet = UiFacet.HEADER_ROW) })
	@FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]")
	@PageTable(firstRowContainsHeaders = true, row = ThisTimepleaseWork.class)
	public List<ThisTimepleaseWork> thisTimepleaseWork;
			
}
