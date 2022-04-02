package com.company.course.paragraph.lessons;

public class StudyLesson extends Lesson {
    String text;

    public StudyLesson(String name, String text, int score, LessonDisplayBehavior lessonDisplayBehavior) {
        super(name, lessonDisplayBehavior, score);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean isAccepted() {
        return accepted;
    }
}
