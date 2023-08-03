package com.appium.training.interactions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import lombok.SneakyThrows;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Dimension;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollDownInteraction implements Interaction {

    @SneakyThrows
    @Override
    @Step("{0} scroll down")
    public <T extends Actor> void performAs(T actor) {

        AndroidDriver driver = (AndroidDriver) Serenity.getDriver();

        Dimension screenSize = driver.manage().window().getSize();
        int screenWidth = screenSize.getWidth();
        int screenHeight = screenSize.getHeight();

        int startX = screenWidth / 2; // Punto X en el centro de la pantalla
        int startY = (int) (screenHeight * 0.9); // Punto Y en el 90% de la pantalla (inicio)
        int endY = (int) (screenHeight * 0.2); // Punto Y en el 20% de la pantalla (fin)

            TouchAction<?> touchAction = new TouchAction<>(driver);

            touchAction.press(PointOption.point(startX, startY))
                    .waitAction()
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();

        Thread.sleep(1500);

    }

    public static ScrollDownInteraction scrollingDown() {
        return instrumented(ScrollDownInteraction.class);
    }
}
