package com.company.display;

import com.company.course.paragraph.Paragraph;
import com.company.course.paragraph.lesson.Lesson;

public abstract class LessonDisplay {
    TaskDisplay taskDisplay;

    public LessonDisplay(TaskDisplay taskDisplay) {
        this.taskDisplay = taskDisplay;
    }

    public TaskDisplay getTaskDisplay() {
        return taskDisplay;
    }

    public void setTaskDisplay(TaskDisplay taskDisplay) {
        this.taskDisplay = taskDisplay;
    }

    public abstract void display(Lesson lesson);
}
