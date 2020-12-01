package com.Arbusta.ReporteML.Steps;

import com.Arbusta.ReporteML.PageObject.MercadoLibreLoginPageObject;
import com.Arbusta.ReporteML.PageObject.MercadoLibreSearchPageObject;

import net.thucydides.core.annotations.Step;

public class MLLoginSteps {
	
	MercadoLibreLoginPageObject pageObjectLoginML;
	MercadoLibreSearchPageObject pageobjectSearchML;
	
	@Step
	public void iniciarSesionML(String user, String pass){
		pageObjectLoginML.open();
		pageObjectLoginML.Login(user, pass);
	}
	@Step
	public void buscarYComprarML(String art) {
		pageobjectSearchML.open();
		pageobjectSearchML.buscaryComprar(art);
	}
}
