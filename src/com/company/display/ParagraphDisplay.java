package com.company.display;

import com.company.course.paragraph.Paragraph;

public abstract class ParagraphDisplay {
    LessonDisplay lessonDisplay;

    public ParagraphDisplay(LessonDisplay lessonDisplay) {
        this.lessonDisplay = lessonDisplay;
    }

    public LessonDisplay getLessonDisplay() {
        return lessonDisplay;
    }

    public void setLessonDisplay(LessonDisplay lessonDisplay) {
        this.lessonDisplay = lessonDisplay;
    }

    public abstract void display(Paragraph paragraph);
}
