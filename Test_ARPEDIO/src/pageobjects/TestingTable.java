package pageobjects;

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

	@FacetFindBys(value = {
			@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'matrix-table__string-cell')]//table)[1]/tbody/tbody"), facet = UiFacet.DATA_ROWS),
			@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/thead/tr"), facet = UiFacet.HEADER_ROW) })
	@FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]")
	@PageTable(firstRowContainsHeaders = true, row = TableNicholas.class)
	public List<TableNicholas> tableNicholas;

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

	@FindBy(css = "th.matrix-table__headcell.matrix-table__headcell--narrow")
	@PageTable(firstRowContainsHeaders = false, row = D.class)
	public List<D> d;

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

	@FindBy(css = "#brandBand_2 td.matrix-table__cell.matrix-table__full-cell div")
	@PageTable(firstRowContainsHeaders = false, row = C.class)
	public List<C> c;

	@PageRow()
	public static class Tablee {
	}

	@PageRow()
	public static class DemoTable {

		@TextType()
		@FindBy(xpath = "//td//div//c-matrix-cell//div")
		public WebElement cUSTOMERSTAKEHOLDERS;
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
}
