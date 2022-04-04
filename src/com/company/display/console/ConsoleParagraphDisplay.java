package com.company.display.console;

import com.company.course.paragraph.Paragraph;
import com.company.course.paragraph.lesson.Lesson;
import com.company.display.LessonDisplay;
import com.company.display.ParagraphDisplay;

public class ConsoleParagraphDisplay extends ParagraphDisplay {
    public ConsoleParagraphDisplay() {
        super(new ConsoleLessonDisplay());
    }

    @Override
    public void display(Paragraph paragraph) {
        System.out.println("Глава: " + paragraph.getName());
        System.out.println(paragraph.getCurrentLesson() + "/" + paragraph.getLessons().size());
        System.out.println(paragraph.getScore() + "/" + paragraph.getMaxScore());
        for (Lesson lesson : paragraph.getLessons()) {
            getLessonDisplay().display(lesson);
        }
    }
}
