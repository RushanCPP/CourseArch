package com.company.course.paragraph.lessons.tasks.consoleDisplay;

import com.company.course.paragraph.lessons.tasks.Task;
import com.company.course.paragraph.lessons.tasks.TaskDisplayBehavior;
import com.company.course.paragraph.lessons.tasks.TestTask;

public class ConsoleTestTaskDisplayBehavior implements TaskDisplayBehavior {

    @Override
    public void display(Task task) {
        System.out.println("Текст: " + task.getText());
        System.out.println("Сдан: " + task.isAccepted());
        if (task instanceof TestTask) {
            System.out.println("Варианты:");
            int i = 0;
            for (String variant : ((TestTask) task).getVariants()) {
                System.out.println("  %d) ".formatted(i) + variant);
                i++;
            }
        }
    }
}
