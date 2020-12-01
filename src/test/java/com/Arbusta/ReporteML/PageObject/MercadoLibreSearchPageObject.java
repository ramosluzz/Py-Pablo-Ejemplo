package com.Arbusta.ReporteML.PageObject;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com.co/#from=homecom")

public class MercadoLibreSearchPageObject extends PageObject {
	
	@FindBy(name="as_word")
	public WebElementFacade search;
	
	@FindBy(xpath="//button[@class='nav-search-btn']")
	public WebElementFacade btnSearch;
	
	@FindBy(xpath="//li[1]//div[1]//div[1]//div[2]//div[1]//a[1]")
	public WebElementFacade selectArt;
	
    @FindBy(id="BidButtonTop")
	public WebElementFacade comprarArt;
	
//	@FindBy(xpath="//input[@id='BidButtonTop']")
//	public WebElementFacade comprarArt;
	
	public void buscaryComprar(String art) {
		search.sendKeys(art);
		btnSearch.click();
		waitFor(5);
		selectArt.click();
		waitFor(10);
		comprarArt.submit();
		//comprarArt.click();
		Serenity.takeScreenshot();
	}
}
