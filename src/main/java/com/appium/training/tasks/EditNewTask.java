package com.appium.training.tasks;

import com.appium.training.interactions.EditNewTaskInteraction;
import com.appium.training.interactions.ScrollDownInteraction;
import com.appium.training.model.NewTaskDataDto;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditNewTask implements Task {

    private NewTaskDataDto newTaskDataDto;

    public EditNewTask(NewTaskDataDto newTaskDataDto) {
        this.newTaskDataDto = newTaskDataDto;
    }

    @SneakyThrows
    @Override
    @Step("{0} edit the new task")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ScrollDownInteraction.scrollingDown());
        actor.attemptsTo(EditNewTaskInteraction.editingNewTask(newTaskDataDto));

    }

    public static EditNewTask editing(NewTaskDataDto newTaskDataDto) {
        return instrumented(EditNewTask.class, newTaskDataDto);
    }
}
