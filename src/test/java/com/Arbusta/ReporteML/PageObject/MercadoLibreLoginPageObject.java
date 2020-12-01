package com.Arbusta.ReporteML.PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com.co/#from=homecom")

public class MercadoLibreLoginPageObject extends PageObject {
	
	@FindBy(xpath="//nav[@id='nav-header-menu']//a[contains(text(),'Ingresa')]")
	public WebElementFacade ingresarLogin;
	
	@FindBy(id="user_id")
	public WebElementFacade usuario;

	@FindBy(xpath="//span[contains(text(),'Continuar')]")
	public WebElementFacade continuar;
	
	@FindBy(id="password")
	public WebElementFacade password;
	
	@FindBy(xpath="//span[contains(text(),'Ingresar')]")
	public WebElementFacade btnIngresar;

	public void Login(String user, String pass)
	{
		ingresarLogin.click();
		usuario.sendKeys(user);
		continuar.click();
		password.sendKeys(pass);
		btnIngresar.click();
		waitFor(3);
	}
}