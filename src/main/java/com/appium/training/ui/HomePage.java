package com.appium.training.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
    public static final Target ADD_TASK_BTN = Target.the("Add new task button").located(By.id("fabNuevo"));

    public static final Target PAID_SWITCH_FILTER = Target.the("Paid switch filter").located(By.id("swSinPagar"));

    public static final Target OPEN_RADIO_FILTER = Target.the("Open radio button").located(By.id("rbAbiertaFiltro"));

    public static final Target INPROGRESS_RADIO_FILTER = Target.the("In progress radio button").located(By.id("rbEnCursoFiltro"));

    public static final Target CLOSE_RADIO_FILTER = Target.the("Close radio button").located(By.id("rbCerradaFiltro"));

    public static final Target TASK_DESCRIPTION_TXT = Target.the("Task description text").located(By.id("tvDescripcionLista"));

    public static final Target TASK_TECHNIC_TXT = Target.the("Task technic text").located(By.id("tvTecnicoLista"));

    public static final Target DELETE_TASK_BTN = Target.the("Delete task button").located(By.id("ivBorrarLista"));

    public static final Target OK_DELETE_BTN = Target.the("OK delete task button").located(By.id("button1"));
}
