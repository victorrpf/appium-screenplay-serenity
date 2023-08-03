package com.appium.training.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NewTaskPage extends PageObject {

    public static final Target CATEGORY_LIST = Target.the("Category list").located(By.id("spCategoria"));

    public static final Target CATEGORY_OPTIONS = Target.the("Category options").located(By.className("android.widget.CheckedTextView"));

    public static final Target PRIORITY_LIST = Target.the("Priority list").located(By.id("spPrioridad"));

    public static final Target PRIORITY_OPTIONS = Target.the("Priority options").located(By.className("android.widget.CheckedTextView"));

    public static final Target PAID_SWITCH = Target.the("Paid switch").located(By.id("swPagado"));

    public static final Target OPEN_RADIO_BTN = Target.the("Open radio button").located(By.id("rbAbierta"));

    public static final Target INPROGRESS_RADIO_BTN = Target.the("In progress radio button").located(By.id("rbEnCurso"));

    public static final Target CLOSE_RADIO_BTN = Target.the("Close radio button").located(By.id("rbCerrada"));

    public static final Target HOURS_SEEK_BAR = Target.the("Worked hours seek bar").located(By.id("sbHorasTrabajadas"));

    public static final Target REVIEW_RATING_BAR = Target.the("Review rating bar").located(By.id("ratingBar"));

    public static final Target TECHNIC_TEXT_INPUT = Target.the("Technic text input").located(By.id("etTecnico"));

    public static final Target DESCRIPTION_TEXT_INPUT = Target.the("Description text input").located(By.id("etDescripcion"));

    public static final Target SAVE_TASK_BTN = Target.the("Save new task").located(By.id("fabGuardar"));

    public static final Target GO_BACK_BTN = Target.the("Go back button").located(By.className("android.widget.ImageButton"));

}
