package com.appium.training.interactions;

import com.appium.training.model.NewTaskDataDto;
import com.appium.training.ui.NewTaskPage;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NewTaskForm implements Interaction {

    private final NewTaskDataDto newTaskDataDto;

    public NewTaskForm(NewTaskDataDto newTaskDataDto) {
        this.newTaskDataDto = newTaskDataDto;
    }

    @SneakyThrows
    @Override
    @Step("{0} fill the new task form")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(newTaskDataDto.getTechnic()).into(NewTaskPage.TECHNIC_TEXT_INPUT));

        actor.attemptsTo(Enter.theValue(newTaskDataDto.getDescription()).into(NewTaskPage.DESCRIPTION_TEXT_INPUT));

    }

    public static NewTaskForm fillForm(NewTaskDataDto newTaskDataDto) {
        return instrumented(NewTaskForm.class, newTaskDataDto);
    }
}
