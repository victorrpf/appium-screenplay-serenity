package com.appium.training.glue;

import com.appium.training.capabilities.CapabilitiesBuilder;
import com.appium.training.model.NewTaskDataDto;
import com.appium.training.model.NewTaskDataFactory;
import com.appium.training.questions.NewTaskQuestion;
import com.appium.training.tasks.CreateNewTask;
import com.appium.training.tasks.DeleteNewTask;
import com.appium.training.tasks.EditNewTask;
import com.appium.training.tasks.NavigateToFormTask;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.hamcrest.Matchers;
import org.openqa.selenium.Capabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TaskSteps {

    private Capabilities capabilities;
    private String appiumUrl;
    private NewTaskDataFactory newTaskDataFactory;

    private NewTaskDataDto newTaskDataDto;
    private Boolean isCorrect;

    public TaskSteps() {
        this.newTaskDataFactory = new NewTaskDataFactory();
    }

    @Given("^(Victor|Ramon) want create a new task in Android (5|6|7|8|9|10|11|12|13) version$")
    public void iWantCreateTask(String actorName, String version) throws MalformedURLException {

        capabilities = CapabilitiesBuilder.build(version);

        appiumUrl = "http://127.0.0.1:4723/wd/hub/";

        theActorCalled(actorName).can(BrowseTheWeb.with(new AndroidDriver(new URL(appiumUrl), capabilities)));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("^(Victor|Ramon) want delete a created task in Android (5|6|7|8|9|10|11|12|13) version$")
    public void iWantDeleteTask(String actorName, String version) throws MalformedURLException {
        iWantCreateTask(actorName, version);
        iFillTheNewTaskForm("CORRECT", "PAID", "INPROGRESS");
    }

    @Given("^(Victor|Ramon) want edit a created task in Android (5|6|7|8|9|10|11|12|13) version$")
    public void iWantEditTask(String actorName, String version) throws MalformedURLException {
        iWantCreateTask(actorName, version);
        iFillTheNewTaskForm("CORRECT", "UNPAID", "OPEN");
    }

    @When("^He fill (CORRECT|INCORRECT) the new task (PAID|UNPAID) and (OPEN|INPROGRESS|CLOSE) form$")
    public void iFillTheNewTaskForm(String condition, String isPaid, String state) {

        if (condition.equals("CORRECT")) {
            isCorrect = true;
        } else {
            isCorrect = false;
        }

        theActorInTheSpotlight().attemptsTo(NavigateToFormTask.withData());
        newTaskDataDto = newTaskDataFactory.newTaskDataBuild(isCorrect, isPaid, state);
        theActorInTheSpotlight().attemptsTo(CreateNewTask.withData(newTaskDataDto, isCorrect));
    }

    @When("^He delete the new task$")
    public void iFillTheNewTaskForm() {
        theActorInTheSpotlight().attemptsTo(DeleteNewTask.deleting(newTaskDataDto));
    }

    @When("^He edit the new task$")
    public void iEditTheNewTaskForm() {
        theActorInTheSpotlight().attemptsTo(EditNewTask.editing(newTaskDataDto));
    }

    @When("^He edit (CORRECT|INCORRECT) the task (PAID|UNPAID) and (OPEN|INPROGRESS|CLOSE) form$")
    public void iFillEditingTheTaskForm(String condition, String isPaid, String state) {

        if (condition.equals("CORRECT")) {
            isCorrect = true;
        } else {
            isCorrect = false;
        }

        newTaskDataDto = newTaskDataFactory.newTaskDataBuild(isCorrect, isPaid, state);
        theActorInTheSpotlight().attemptsTo(CreateNewTask.withData(newTaskDataDto, isCorrect));
    }

    @Then("^the task (SHOULD|SHOULD_NOT) be in tasks list$")
    public void newTaskShouldBeCorrectly(String condition) {

        if (condition.equals("SHOULD")) {
            theActorInTheSpotlight().should(
                    seeThat(
                            "New task at list is showed",
                            NewTaskQuestion.isRequestedTaskCreated(newTaskDataDto.getDescription(), newTaskDataDto.isPaid(), newTaskDataDto.getTaskState()),
                            Matchers.equalTo(true)
                    ));
        } else {
            theActorInTheSpotlight().should(
                    seeThat(
                            "New task at list is not showed",
                            NewTaskQuestion.isRequestedTaskCreated(newTaskDataDto.getDescription(), newTaskDataDto.isPaid(), newTaskDataDto.getTaskState()),
                            Matchers.equalTo(false)
                    ));
        }

    }
}
