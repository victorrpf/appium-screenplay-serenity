package com.appium.training.tasks;

import com.appium.training.interactions.NavigateToFormInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToFormTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(NavigateToFormInteraction.doNavigate());

    }

    public static NavigateToFormTask withData() {
        return instrumented(NavigateToFormTask.class);
    }
}
