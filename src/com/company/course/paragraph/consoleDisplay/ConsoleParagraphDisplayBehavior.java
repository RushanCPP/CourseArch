package com.company.course.paragraph.consoleDisplay;

import com.company.course.paragraph.Paragraph;
import com.company.course.paragraph.ParagraphDisplayBehavior;
import com.company.course.paragraph.lessons.Lesson;

public class ConsoleParagraphDisplayBehavior implements ParagraphDisplayBehavior {
    @Override
    public void display(Paragraph paragraph) {
        System.out.println("Название: " + paragraph.getName());
        System.out.println("Уроки:");
        for (Lesson lesson : paragraph.getLessons()) {
            lesson.display();
        }
    }
}
