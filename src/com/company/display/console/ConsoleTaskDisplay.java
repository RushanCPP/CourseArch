package com.company.display.console;

import com.company.course.paragraph.lesson.task.Task;
import com.company.display.TaskDisplay;

public class ConsoleTaskDisplay extends TaskDisplay {
    @Override
    public void display(Task task) {
        System.out.println(task.getText());
        String[] variants = task.getVariants();
        if (variants != null) {
            for (String variant : variants) {
                System.out.println(variant);
            }
        }
        System.out.println("Задание: " + task.getScore() + "/" + task.getMaxScore());
    }
}
