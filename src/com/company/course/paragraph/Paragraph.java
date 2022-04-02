package com.company.course.paragraph;

import com.company.course.paragraph.lessons.Lesson;

import java.util.ArrayList;

public class Paragraph {
    private ArrayList<Lesson> lessons;
    private ParagraphDisplayBehavior paragraphDisplayBehavior;
    private String name;

    private int score;

    public Paragraph(String name, ArrayList<Lesson> lessons, int score, ParagraphDisplayBehavior paragraphDisplayBehavior) {
        this.name = name;
        this.lessons = lessons;
        this.paragraphDisplayBehavior = paragraphDisplayBehavior;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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
