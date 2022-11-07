package projectflip;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipbase extends BaseClasss{
public  Flipbase() {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;
	
    @FindBy(name="q")
	private WebElement searchbox;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnsearch;

	@FindBy(xpath="//div[@class='_4rR01T']")
	 private List<WebElement> productname;


	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
	private List<WebElement> productprice;


	public WebElement getClose() {
		return close;
	}


	public WebElement getSearchbox() {
		return searchbox;
	}


	public WebElement getBtnsearch() {
		return btnsearch;
	}


	public List<WebElement> getProductname() {
		return productname;
	}


	public List<WebElement> getProductprice() {
		return productprice;
	}

}

