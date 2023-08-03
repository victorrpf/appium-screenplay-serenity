package com.appium.training.interactions;

import com.appium.training.model.NewTaskDataDto;
import com.appium.training.ui.HomePage;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class EditNewTaskInteraction implements Interaction {

    @SneakyThrows
    @Override
    @Step("{0} edit the new task")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(HomePage.TASK_DESCRIPTION_TXT, isClickable()).forNoMoreThan(10).seconds());
        HomePage.TASK_DESCRIPTION_TXT.resolveAllFor(theActorInTheSpotlight()).get(HomePage.TASK_DESCRIPTION_TXT.resolveAllFor(theActorInTheSpotlight()).size() - 1).click();

    }

    public static EditNewTaskInteraction editingNewTask(NewTaskDataDto newTaskDataDto) {
        return instrumented(EditNewTaskInteraction.class, newTaskDataDto);
    }
}
