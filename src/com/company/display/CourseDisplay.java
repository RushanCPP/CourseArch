package com.company.display;

import com.company.course.Course;

public abstract class CourseDisplay {
    ParagraphDisplay paragraphDisplay;

    public CourseDisplay(ParagraphDisplay paragraphDisplay) {
        this.paragraphDisplay = paragraphDisplay;
    }

    public ParagraphDisplay getParagraphDisplay() {
        return paragraphDisplay;
    }

    public void setParagraphDisplay(ParagraphDisplay paragraphDisplay) {
        this.paragraphDisplay = paragraphDisplay;
    }

    public abstract void display(Course course);
}
