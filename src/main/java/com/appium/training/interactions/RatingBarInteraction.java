package com.appium.training.interactions;

import com.appium.training.ui.NewTaskPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import lombok.SneakyThrows;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class RatingBarInteraction implements Interaction {

    @SneakyThrows
    @Override
    @Step("{0} rating bar interaction")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(NewTaskPage.REVIEW_RATING_BAR, isClickable()).forNoMoreThan(10).seconds());
        //NewTaskPage.REVIEW_RATING_BAR.resolveAllFor(theActorInTheSpotlight()).get(0).click();

        AndroidDriver driver = (AndroidDriver) Serenity.getDriver();

        // dimensiones de la RatingBar
        int width = NewTaskPage.REVIEW_RATING_BAR.resolveAllFor(theActorInTheSpotlight()).get(0).getSize().getWidth();
        int xPosition = NewTaskPage.REVIEW_RATING_BAR.resolveAllFor(theActorInTheSpotlight()).get(0).getLocation().getX();
        int yPosition = NewTaskPage.REVIEW_RATING_BAR.resolveAllFor(theActorInTheSpotlight()).get(0).getLocation().getY();

        // número de estrellas que deseas seleccionar
        int desiredRating = randomInt(); // se puede cambiar por un número concreto entre 1 y 5

        // calcula la posición X para la estrella deseada
        int starWidth = Math.round(width/10); // asumiendo que la RatingBar tiene 5 estrellas y 10 mitades
        int finalPosition = starWidth * desiredRating + xPosition;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.tap(PointOption.point(finalPosition, yPosition))
                .perform();

    }

    private int randomInt() {
        int min = 1;
        int max = 10;

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static RatingBarInteraction reviewRatingBar() {
        return instrumented(RatingBarInteraction.class);
    }
}
