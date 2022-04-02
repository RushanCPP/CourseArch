package com.company.course.paragraph.lessons;

public abstract class Lesson {
    protected String name;
    protected boolean accepted;
    protected LessonDisplayBehavior displayBehavior;

    protected int score;

    public Lesson(String name, LessonDisplayBehavior lessonDisplayBehavior, int score) {
        this.name = name;
        this.accepted = false;
        this.displayBehavior = lessonDisplayBehavior;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public abstract boolean isAccepted();

    public void display() {
        displayBehavior.display(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LessonDisplayBehavior getDisplayBehavior() {
        return displayBehavior;
    }

    public void setDisplayBehavior(LessonDisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
    }

}
