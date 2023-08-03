package com.appium.training.interactions;

import com.appium.training.model.NewTaskDataDto;
import com.appium.training.ui.HomePage;
import lombok.SneakyThrows;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class DeleteNewTaskInteraction implements Interaction {

    @SneakyThrows
    @Override
    @Step("{0} delete the new task")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(HomePage.DELETE_TASK_BTN, isClickable()).forNoMoreThan(10).seconds());
        HomePage.DELETE_TASK_BTN.resolveAllFor(theActorInTheSpotlight()).get(HomePage.DELETE_TASK_BTN.resolveAllFor(theActorInTheSpotlight()).size() - 1).click();

        Thread.sleep(2000);
        Serenity.getDriver().switchTo().alert().accept();
    }

    public static DeleteNewTaskInteraction deletingNewTask(NewTaskDataDto newTaskDataDto) {
        return instrumented(DeleteNewTaskInteraction.class, newTaskDataDto);
    }
}
