package com.company.display.console;

import com.company.course.paragraph.Paragraph;
import com.company.course.paragraph.lesson.Lesson;
import com.company.display.LessonDisplay;
import com.company.display.TaskDisplay;

public class ConsoleLessonDisplay extends LessonDisplay {
    public ConsoleLessonDisplay() {
        super(new ConsoleTaskDisplay());
    }

    @Override
    public void display(Lesson lesson) {
        System.out.println("Название: " + lesson.getName());
        System.out.println("За урок" + lesson.getScore() + "/" + lesson.getMaxScore());
        getTaskDisplay().display(lesson.getTask());
    }
}
