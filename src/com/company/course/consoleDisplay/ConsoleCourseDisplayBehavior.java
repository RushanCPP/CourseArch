package com.company.course.consoleDisplay;

import com.company.course.Course;
import com.company.course.CourseDisplayBehavior;
import com.company.course.paragraph.Paragraph;

public class ConsoleCourseDisplayBehavior implements CourseDisplayBehavior {

    @Override
    public void display(Course course) {
        System.out.println("Курс " + course.getName() + " от " + course.getAuthor());
        System.out.println("Главы: ");
        for (Paragraph paragraph : course.getParagraphs()) {
            paragraph.display();
        }
    }
}
