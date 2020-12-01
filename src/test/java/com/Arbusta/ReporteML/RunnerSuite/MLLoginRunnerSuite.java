package com.Arbusta.ReporteML.RunnerSuite;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.Arbusta.ReporteML.PageObject.MercadoLibreLoginPageObject;
import com.Arbusta.ReporteML.Steps.MLLoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)

@UseTestDataFrom("dataDriven/DatosML.csv")

public class MLLoginRunnerSuite {
	
	private String user;
	private String pass;
	private String art;
	@Managed
	MercadoLibreLoginPageObject pageObjectLoginML;
		
	@Steps
	MLLoginSteps stepsML;

//	@Test
//	public void logueo() {
//		stepsML.iniciarSesionML(getUser(), getPass());
//	}
	@Test
	public void search() {
		stepsML.buscarYComprarML(getArt());
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}

}


