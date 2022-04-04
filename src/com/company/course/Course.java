package com.company.course;

import com.company.course.paragraph.Paragraph;

import java.util.ArrayList;

public class Course {
    protected String name;
    protected String author;
    protected int currentParagraph;
    protected ArrayList<Paragraph> paragraphs;

    public Course(String name, String author) {
        this.name = name;
        this.author = author;
        paragraphs = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean addParagraph(Paragraph paragraph) {
        return paragraphs.add(paragraph);
    }

    public int getCurrentParagraph() {
        return currentParagraph;
    }

    public ArrayList<Paragraph> getParagraphs() {
        return paragraphs;
    }
}
