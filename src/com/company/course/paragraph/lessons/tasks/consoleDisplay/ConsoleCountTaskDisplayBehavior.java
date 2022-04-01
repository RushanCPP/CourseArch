package com.company.course.paragraph.lessons.tasks.consoleDisplay;

import com.company.course.paragraph.lessons.tasks.CountTask;
import com.company.course.paragraph.lessons.tasks.Task;
import com.company.course.paragraph.lessons.tasks.TaskDisplayBehavior;

public class ConsoleCountTaskDisplayBehavior implements TaskDisplayBehavior {
    @Override
    public void display(Task task) {
        System.out.println("Текст: " + task.getText());
        System.out.println("Сдан: " + task.isAccepted());
        if (task instanceof CountTask) {
            System.out.println("(Введите дробные числа через точку)");
        }
    }
}
