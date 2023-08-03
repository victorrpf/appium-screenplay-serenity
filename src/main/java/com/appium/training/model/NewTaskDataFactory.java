package com.appium.training.model;

import java.util.Random;

public class NewTaskDataFactory {

    public NewTaskDataDto newTaskDataBuild(Boolean isCorrect, String isPaid, String state) {

        NewTaskDataDto newTaskDataDto = new NewTaskDataDto();
        int randomInt = randomInt();
        if (isCorrect) {

            if (isPaid.equals("PAID")) {
                newTaskDataDto.setPaid(true);
            } else {
                newTaskDataDto.setPaid(false);
            }

            if (state.equals("OPEN")) {
                newTaskDataDto.setTaskState("OPEN");
            } else if (state.equals("INPROGRESS")) {
                newTaskDataDto.setTaskState("INPROGRESS");
            } else {
                newTaskDataDto.setTaskState("CLOSE");
            }

            newTaskDataDto.setTechnic("random technic " + randomInt);
            newTaskDataDto.setDescription("random description " + randomInt);
        } else {

            if (state.equals("OPEN")) {
                newTaskDataDto.setTaskState("OPEN");
            } else if (state.equals("INPROGRESS")) {
                newTaskDataDto.setTaskState("INPROGRESS");
            } else {
                newTaskDataDto.setTaskState("CLOSE");
            }

            newTaskDataDto.setTechnic("");
            newTaskDataDto.setDescription("random description " + randomInt);
        }
        return newTaskDataDto;
    }

    private int randomInt() {
        int min = 10000;
        int max = 99999;

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
