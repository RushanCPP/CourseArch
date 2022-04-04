package com.company;

import com.company.course.Course;
import com.company.course.consoleDisplay.ConsoleCourseDisplayBehavior;
import com.company.course.paragraph.Paragraph;
import com.company.course.paragraph.consoleDisplay.ConsoleParagraphDisplayBehavior;
import com.company.course.paragraph.lessons.Lesson;
import com.company.course.paragraph.lessons.StudyLesson;
import com.company.course.paragraph.lessons.TaskLesson;
import com.company.course.paragraph.lessons.consoleDisplay.ConsoleStudyLessonDisplay;
import com.company.course.paragraph.lessons.consoleDisplay.ConsoleTaskLessonDisplay;
import com.company.course.paragraph.lessons.tasks.TestTask;
import com.company.course.paragraph.lessons.tasks.consoleDisplay.ConsoleTestTaskDisplayBehavior;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> variants = new ArrayList<>();
        variants.add("Один");
        variants.add("Два");
        variants.add("Три");
        variants.add("Четыре");
        TestTask testTask = new TestTask("Сколько?", new ConsoleTestTaskDisplayBehavior(), 1,2, variants);
        Lesson lesson = new TaskLesson("2.4.1", testTask, 1, new ConsoleTaskLessonDisplay());
        Lesson lesson1 = new StudyLesson("Отрицательные числа", "\tЭкономист - это плохо\n\tФизик - это ответ", 1, new ConsoleStudyLessonDisplay());
        ArrayList<Lesson> lessonArrayList = new ArrayList<>();
        lessonArrayList.add(lesson);
        lessonArrayList.add(lesson1);
        Paragraph paragraph = new Paragraph("Математика 5 класс 1 четверть", lessonArrayList, new ConsoleParagraphDisplayBehavior());

        ArrayList<String> variants1 = new ArrayList<>();
        variants1.add("Один");
        variants1.add("Два");
        variants1.add("Три");
        variants1.add("Четыре");
        TestTask testTask1 = new TestTask("Сколько?v2.0", new ConsoleTestTaskDisplayBehavior(), 1,2, variants1);
        Lesson lesson11 = new TaskLesson("2.4.1", testTask1, 1, new ConsoleTaskLessonDisplay());
        Lesson lesson12 = new StudyLesson("Отрицательные числа", "\tЭкономист - это плохо\n\tФизик - это ответ", 1, new ConsoleStudyLessonDisplay());
        ArrayList<Lesson> lessonArrayList1 = new ArrayList<>();
        lessonArrayList1.add(lesson11);
        lessonArrayList1.add(lesson12);
        Paragraph paragraph1 = new Paragraph("Математика 11 класс 4 четверть", lessonArrayList1, new ConsoleParagraphDisplayBehavior());

        Course course = new Course("Подготовка к ЕГЭ", "Бурят с ютуба", new ConsoleCourseDisplayBehavior());
        course.addParagraph(paragraph);
        course.addParagraph(paragraph1);
        course.display();
    }
}
