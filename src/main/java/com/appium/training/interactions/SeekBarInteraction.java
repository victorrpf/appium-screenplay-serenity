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

public class SeekBarInteraction implements Interaction {

    @SneakyThrows
    @Override
    @Step("{0} seek bar interaction")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(NewTaskPage.HOURS_SEEK_BAR, isClickable()).forNoMoreThan(10).seconds());
        //NewTaskPage.HOURS_SEEK_BAR.resolveAllFor(theActorInTheSpotlight()).get(0).click();

        AndroidDriver driver = (AndroidDriver) Serenity.getDriver();

        // dimensiones de la SeekBar
        int width = NewTaskPage.HOURS_SEEK_BAR.resolveAllFor(theActorInTheSpotlight()).get(0).getSize().getWidth();
        int xPosition = NewTaskPage.HOURS_SEEK_BAR.resolveAllFor(theActorInTheSpotlight()).get(0).getLocation().getX();
        int yPosition = NewTaskPage.HOURS_SEEK_BAR.resolveAllFor(theActorInTheSpotlight()).get(0).getLocation().getY();

        // número de horas que deseas seleccionar
        int desiredHours = randomInt(); // se puede cambiar por un número concreto entre 0 y 30

        // calcula la posición X para las horas deseadas
        int hoursWidth = Math.round(width/30); // asumiendo que la SeekBar tiene 30 horas
        int finalPosition = hoursWidth * desiredHours + xPosition;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.press(PointOption.point(finalPosition, yPosition))
                .waitAction()
                .moveTo(PointOption.point(finalPosition, yPosition))
                .release()
                .perform();

    }

    private int randomInt() {
        int min = 1;
        int max = 30;

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static SeekBarInteraction draggingSeekBar() {
        return instrumented(SeekBarInteraction.class);
    }
}
