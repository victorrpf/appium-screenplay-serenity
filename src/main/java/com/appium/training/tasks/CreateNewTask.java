package com.appium.training.tasks;

import com.appium.training.interactions.*;
import com.appium.training.model.NewTaskDataDto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateNewTask implements Task {

    private final NewTaskDataDto newTaskDataDto;
    private final Boolean isCorrect;

    public CreateNewTask(NewTaskDataDto newTaskDataDto, Boolean isCorrect) {
        this.newTaskDataDto = newTaskDataDto;
        this.isCorrect = isCorrect;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CategoryList.selectingCategoryList());
        actor.attemptsTo(PriorityList.selectingPriorityList());

        if (newTaskDataDto.isPaid()) {
            actor.attemptsTo(PaidTaskInteraction.payingTask());
        }

        if (newTaskDataDto.getTaskState().equals("OPEN")) {
            actor.attemptsTo(OpenState.openingTask());
        }

        if (newTaskDataDto.getTaskState().equals("INPROGRESS")) {
            actor.attemptsTo(InProgressState.progressingTask());
        }

        if (newTaskDataDto.getTaskState().equals("CLOSE")) {
            actor.attemptsTo(CloseState.closingTask());
        }

        actor.attemptsTo(SeekBarInteraction.draggingSeekBar());
        actor.attemptsTo(RatingBarInteraction.reviewRatingBar());
        actor.attemptsTo(NewTaskForm.fillForm(newTaskDataDto));

        if (isCorrect) {
            actor.attemptsTo(SaveNewTaskInteraction.saveTask(newTaskDataDto));
        } else {
            actor.attemptsTo(GoBackInteraction.notSavedTask(newTaskDataDto));
        }

        actor.attemptsTo(ScrollDownInteraction.scrollingDown());
    }

    public static CreateNewTask withData(NewTaskDataDto newTaskDataDto, Boolean isCorrect) {
        return instrumented(CreateNewTask.class, newTaskDataDto, isCorrect);
    }

}

