package com.co.gao.tasks;

import com.co.gao.userinterfaces.NewExperienceUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class NewExperienceTask implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
			
			actor.attemptsTo(Click.on(NewExperienceUI.BTN_WOMAN));
			actor.attemptsTo(Click.on(NewExperienceUI.ADD_CART));
			actor.attemptsTo(Click.on(NewExperienceUI.BTN_CHECKOUT));
			actor.attemptsTo(Click.on(NewExperienceUI.BTN_CHECKPROCEED));
			
			
		}



		public static NewExperienceTask gao() {

			return Tasks.instrumented(NewExperienceTask.class);
		}

}
