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

public class PriorityList implements Interaction {

    @SneakyThrows
    @Override
    @Step("{0} priority list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(NewTaskPage.PRIORITY_LIST, isClickable()).forNoMoreThan(10).seconds());
        NewTaskPage.PRIORITY_LIST.resolveAllFor(theActorInTheSpotlight()).get(0).click();
        actor.attemptsTo(WaitUntil.the(NewTaskPage.CATEGORY_OPTIONS, isClickable()).forNoMoreThan(10).seconds());
        NewTaskPage.PRIORITY_OPTIONS.resolveAllFor(theActorInTheSpotlight()).get(NewTaskPage.PRIORITY_OPTIONS.resolveAllFor(theActorInTheSpotlight()).size() - 1).click();
        actor.attemptsTo(WaitUntil.the(NewTaskPage.PRIORITY_LIST, isClickable()).forNoMoreThan(10).seconds());
    }

    public static PriorityList selectingPriorityList() {
        return instrumented(PriorityList.class);
    }
}
