package com.company.course;

import com.company.course.paragraph.Paragraph;

import java.util.ArrayList;

public class Course {
    private ArrayList<Paragraph> paragraphs;
    private String name;
    private String author;
    private CourseDisplayBehavior displayBehavior;

    private int score;

    public Course(ArrayList<Paragraph> paragraphs, String name, String author, CourseDisplayBehavior displayBehavior) {
        this.paragraphs = paragraphs;
        this.name = name;
        this.author = author;
        this.displayBehavior = displayBehavior;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addParagraph(Paragraph paragraph) {
        this.paragraphs.add(paragraph);
    }

    public ArrayList<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(ArrayList<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public CourseDisplayBehavior getDisplayBehavior() {
        return displayBehavior;
    }

    public void setDisplayBehavior(CourseDisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
    }

    public void display() {
        displayBehavior.display(this);
    }
}
