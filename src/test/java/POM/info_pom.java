package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class info_pom  extends CONSTRUCTOR_POM {
public	info_pom (WebDriver wb)
	{
		super(wb);
	}

@FindBy(xpath="//span[normalize-space()='My Info']")WebElement info;
@FindBy (xpath="//*[text()='Female']") WebElement check;

public void in()
{
	info.click();
}
public void ck()
{
	check.click();
}
}
