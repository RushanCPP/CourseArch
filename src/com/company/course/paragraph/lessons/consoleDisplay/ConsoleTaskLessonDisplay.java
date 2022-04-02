package com.company.course.paragraph.lessons.consoleDisplay;

import com.company.course.paragraph.lessons.Lesson;
import com.company.course.paragraph.lessons.LessonDisplayBehavior;
import com.company.course.paragraph.lessons.TaskLesson;
import com.company.course.paragraph.lessons.tasks.Task;

public class ConsoleTaskLessonDisplay implements LessonDisplayBehavior {

    @Override
    public void display(Lesson lesson) {
        System.out.println("Название: " + lesson.getName());
        System.out.println("Сдан: " + lesson.isAccepted());
        System.out.println("Баллы: " + lesson.getScore());
        System.out.println("Задания: ");
        if (lesson instanceof TaskLesson) {
            Task task = ((TaskLesson) lesson).getTask();
            task.display();
        }
    }
}
