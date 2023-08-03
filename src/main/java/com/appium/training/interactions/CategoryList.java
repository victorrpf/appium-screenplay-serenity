package com.appium.training.interactions;

import com.appium.training.ui.NewTaskPage;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CategoryList implements Interaction {

    @SneakyThrows
    @Override
    @Step("{0} category list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(NewTaskPage.CATEGORY_LIST, isClickable()).forNoMoreThan(10).seconds());
        NewTaskPage.CATEGORY_LIST.resolveAllFor(theActorInTheSpotlight()).get(0).click();
        actor.attemptsTo(WaitUntil.the(NewTaskPage.CATEGORY_OPTIONS, isClickable()).forNoMoreThan(10).seconds());
        NewTaskPage.CATEGORY_OPTIONS.resolveAllFor(theActorInTheSpotlight()).get(randomInt()).click();
        actor.attemptsTo(WaitUntil.the(NewTaskPage.CATEGORY_LIST, isClickable()).forNoMoreThan(10).seconds());
    }

    private int randomInt() {
        int min = 0;
        int max = 4;

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    public static CategoryList selectingCategoryList() {
        return instrumented(CategoryList.class);
    }
}
