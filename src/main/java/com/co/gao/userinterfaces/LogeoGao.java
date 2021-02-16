package com.co.gao.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LogeoGao {
	 
	public static final Target BTN_LOGIN = Target.the("BTN_LOGIN")
		    .located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	 public static final Target TXT_EMAIL_USER = Target.the("TXT_EMAIL_USER")
			    .located(By.id("email"));
	 public static final Target TXT_PASS = Target.the("TXT_PASS")
			    .located(By.id("passwd"));
	 public static final Target BTN_ADMIT = Target.the("BTN_ADMITt")
			    .located(By.id("SubmitLogin"));
	 
	 private LogeoGao() {
		    throw new IllegalStateException("Utility class");
		  }
	 
}
