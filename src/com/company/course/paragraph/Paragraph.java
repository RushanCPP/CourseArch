package com.company.course.paragraph;

import com.company.course.paragraph.lessons.Lesson;

import java.util.ArrayList;

public class Paragraph {
    ArrayList<Lesson> lessons;
    ParagraphDisplayBehavior paragraphDisplayBehavior;
    String name;

    public Paragraph(String name, ArrayList<Lesson> lessons, ParagraphDisplayBehavior paragraphDisplayBehavior) {
        this.name = name;
        this.lessons = lessons;
        this.paragraphDisplayBehavior = paragraphDisplayBehavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public ParagraphDisplayBehavior getParagraphDisplayBehavior() {
        return paragraphDisplayBehavior;
    }

    public void setParagraphDisplayBehavior(ParagraphDisplayBehavior paragraphDisplayBehavior) {
        this.paragraphDisplayBehavior = paragraphDisplayBehavior;
    }

    public void display() {
        paragraphDisplayBehavior.display(this);
    }
}
