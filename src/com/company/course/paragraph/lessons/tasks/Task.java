package com.company.course.paragraph.lessons.tasks;

public abstract class Task {
    protected boolean accepted;
    protected String text;
    protected TaskDisplayBehavior taskDisplayBehavior;

    protected int score;

    public Task(String text, TaskDisplayBehavior taskDisplayBehavior, int score) {
        this.text = text;
        this.accepted = false;
        this.taskDisplayBehavior = taskDisplayBehavior;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public String getText() {
        return text;
    }

    public abstract boolean answer(String answer);

    public TaskDisplayBehavior getTaskDisplayBehavior() {
        return taskDisplayBehavior;
    }

    public void setTaskDisplayBehavior(TaskDisplayBehavior taskDisplayBehavior) {
        this.taskDisplayBehavior = taskDisplayBehavior;
    }

    public void display() {
        taskDisplayBehavior.display(this);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
