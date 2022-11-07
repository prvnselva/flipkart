package projectflip;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Flipkartproject extends BaseClasss{
@Test
private void test1() {
	browserLaunch("chrome");
	}

@Test
private void test2() throws InterruptedException {
	urlLaunch("https://www.flipkart.com/");
	Flipbase f=new Flipbase();
	click(f.getClose());
	sendkeys(f.getSearchbox(),"iphone13");
	click(f.getBtnsearch());
	
}
@Ignore
@Test
private void test3() {	
	Flipbase a=new Flipbase();
	List<WebElement> pn  = a.getProductname();
	System.out.println("........product list......." +pn.size());
	
	for(WebElement x:pn) {
		System.out.println(x.getText());
	}
	}

@Test
private void test4() {
	Flipbase b=new Flipbase();
	List<WebElement> pp = b.getProductprice();
	System.out.println("..product price......" +pp.size());
	
	for(WebElement z:pp) {
		
		System.out.println(z.getText());
	}

}
}
