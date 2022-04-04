package com.company.display.console;

import com.company.course.Course;
import com.company.course.paragraph.Paragraph;
import com.company.display.CourseDisplay;
import com.company.display.ParagraphDisplay;

public class ConsoleCourseDisplay extends CourseDisplay {
    public ConsoleCourseDisplay() {
        super(new ConsoleParagraphDisplay());
    }

    @Override
    public void display(Course course) {
        System.out.println("Название: " + course.getName());
        System.out.println("Автор: " + course.getAuthor());
        System.out.printf("Пройдено %d из %d%n", course.getCurrentParagraph(), course.getParagraphs().size());
        System.out.printf("Баллы: %d/%d", course.getScore(), course.getMaxScore());
        for (Paragraph paragraph : course.getParagraphs()) {
            getParagraphDisplay().display(paragraph);
        }
    }
}
