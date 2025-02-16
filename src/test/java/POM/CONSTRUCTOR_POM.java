package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CONSTRUCTOR_POM {
	public WebDriver wb;
	CONSTRUCTOR_POM(WebDriver wb)
	{
		this.wb=wb;
		PageFactory.initElements(wb,this);
	}

}
