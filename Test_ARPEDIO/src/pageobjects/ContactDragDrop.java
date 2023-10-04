package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page(title = "Contact Drag Drop", summary = "", relativeUrl = "", connection = "Admin")
public class ContactDragDrop {

	@TextType()
	@FindBy(xpath = "(//tr[@class='nodes']//td//table)[2]//td/div[@draggable='true']")
	public WebElement draggableContact2;

	@TextType()
	@FindBy(xpath = "(//tr[@class='nodes']//td//table)[1]//td/div[@draggable='true']")
	public WebElement draggableContact1;

}
