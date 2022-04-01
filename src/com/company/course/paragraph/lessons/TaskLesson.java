package com.company.course.paragraph.lessons;

import com.company.course.paragraph.lessons.tasks.Task;

public class TaskLesson extends Lesson {
    Task task;

    public TaskLesson(String name, Task task, LessonDisplayBehavior lessonDisplayBehavior) {
        super(name, lessonDisplayBehavior);
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
