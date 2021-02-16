package com.co.gao.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewExperienceUI {
	
	public static final Target BTN_WOMAN  = Target.the("BTN_WOMAN").located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")); 
	public static final Target ADD_CART  = Target.the("ADD_CART").located(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
	public static final Target BTN_CHECKOUT  = Target.the("BTN_CHECKOUT").located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")); 
	public static final Target BTN_CHECKPROCEED  = Target.the("BTN_CHECKPROCEED").located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")); 
	
	private NewExperienceUI() {
	    throw new IllegalStateException("Utility class");
	  }

}
