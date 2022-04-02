package com.company.course.paragraph.lessons;

import com.company.course.paragraph.lessons.tasks.Task;

public class TaskLesson extends Lesson {
    Task task;

    public TaskLesson(String name, Task task, int score, LessonDisplayBehavior lessonDisplayBehavior) {
        super(name, lessonDisplayBehavior, score);
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public boolean isAccepted() {
        return accepted;
    }
}
