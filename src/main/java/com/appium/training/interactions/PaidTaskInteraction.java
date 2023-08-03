package com.appium.training.interactions;

import com.appium.training.ui.NewTaskPage;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class PaidTaskInteraction implements Interaction {

    @SneakyThrows
    @Override
    @Step("{0} paid switch at task form")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(NewTaskPage.PAID_SWITCH, isClickable()).forNoMoreThan(10).seconds());
        NewTaskPage.PAID_SWITCH.resolveAllFor(theActorInTheSpotlight()).get(0).click();
    }

    public static PaidTaskInteraction payingTask() {
        return instrumented(PaidTaskInteraction.class);
    }
}
