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

public class InProgressState implements Interaction {

    @SneakyThrows
    @Override
    @Step("{0} in progress state radio button at task form")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(NewTaskPage.INPROGRESS_RADIO_BTN, isClickable()).forNoMoreThan(10).seconds());
        NewTaskPage.INPROGRESS_RADIO_BTN.resolveAllFor(theActorInTheSpotlight()).get(0).click();
    }

    public static InProgressState progressingTask() {
        return instrumented(InProgressState.class);
    }
}
