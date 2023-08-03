package com.appium.training.interactions;

import com.appium.training.ui.HomePage;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class InProgressStateFilter implements Interaction {

    @SneakyThrows
    @Override
    @Step("{0} in progress state filter")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(HomePage.INPROGRESS_RADIO_FILTER, isClickable()).forNoMoreThan(10).seconds());
        HomePage.INPROGRESS_RADIO_FILTER.resolveAllFor(theActorInTheSpotlight()).get(0).click();

    }

    public static InProgressStateFilter filteringInProgressTasks() {
        return instrumented(InProgressStateFilter.class);
    }
}
