package com.appium.training.tasks;

import com.appium.training.interactions.DeleteNewTaskInteraction;
import com.appium.training.interactions.ScrollDownInteraction;
import com.appium.training.model.NewTaskDataDto;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteNewTask implements Task {

    private NewTaskDataDto newTaskDataDto;

    public DeleteNewTask(NewTaskDataDto newTaskDataDto) {
        this.newTaskDataDto = newTaskDataDto;
    }

    @SneakyThrows
    @Override
    @Step("{0} delete the new task")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ScrollDownInteraction.scrollingDown());
        actor.attemptsTo(DeleteNewTaskInteraction.deletingNewTask(newTaskDataDto));

    }

    public static DeleteNewTask deleting(NewTaskDataDto newTaskDataDto) {
        return instrumented(DeleteNewTask.class, newTaskDataDto);
    }
}
