package com.appium.training.questions;

import com.appium.training.interactions.*;
import com.appium.training.ui.HomePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NewTaskQuestion implements Question<Boolean> {

    private final String expectedTaskDescription;
    private final Boolean isPaid;

    private final String state;

    public NewTaskQuestion(String expectedTaskDescription, Boolean isPaid, String state) {
        this.expectedTaskDescription = expectedTaskDescription;
        this.isPaid = isPaid;
        this.state = state;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        if (!isPaid) {
            actor.attemptsTo(PaidTaskFilter.filteringPaidTasks());
        }

        if (state.equals("OPEN")) {
            actor.attemptsTo(OpenStateFilter.filteringOpenTasks());
        }

        if (state.equals("INPROGRESS")) {
            actor.attemptsTo(InProgressStateFilter.filteringInProgressTasks());
        }

        if (state.equals("CLOSE")) {
            actor.attemptsTo(CloseStateFilter.filteringCloseTasks());
        }

        actor.attemptsTo(ScrollDownInteraction.scrollingDown());

        List<String> taskDescriptions = new ArrayList<>();

        for (WebElementFacade taskElement : HomePage.TASK_DESCRIPTION_TXT.resolveAllFor(theActorInTheSpotlight())) {
            //System.out.println(taskElement.getText()); //para comprobar que está leyendo correctamente los elementos
            if (taskElement.getText().equals(expectedTaskDescription)) {
                taskDescriptions.add(taskElement.getText());
                break;
            }
        }

        return taskDescriptions.size() > 0;
    }

    // devuelve true si la tarea es correcta
    public static Question<Boolean> isRequestedTaskCreated(String expectedTaskDescription, Boolean isPaid, String state) {
        return new NewTaskQuestion(expectedTaskDescription, isPaid, state);
    }

}
