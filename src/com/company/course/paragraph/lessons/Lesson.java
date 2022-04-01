package com.company.course.paragraph.lessons;

public abstract class Lesson {
    protected String name;
    protected boolean accepted;
    LessonDisplayBehavior displayBehavior;

    public Lesson(String name, LessonDisplayBehavior lessonDisplayBehavior) {
        this.name = name;
        this.accepted = false;
        this.displayBehavior = lessonDisplayBehavior;
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
