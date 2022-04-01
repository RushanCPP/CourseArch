package com.company.course.paragraph.lessons.consoleDisplay;

import com.company.course.paragraph.lessons.Lesson;
import com.company.course.paragraph.lessons.LessonDisplayBehavior;
import com.company.course.paragraph.lessons.StudyLesson;

public class ConsoleStudyLessonDisplay implements LessonDisplayBehavior {

    @Override
    public void display(Lesson lesson) {
        System.out.println("Название: " + lesson.getName());
        System.out.println("Сдан: " + lesson.isAccepted());
        if (lesson instanceof StudyLesson) {
            System.out.println("Тема: " + ((StudyLesson) lesson).getText());
        }
    }
}
