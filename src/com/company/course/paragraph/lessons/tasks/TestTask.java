package com.company.course.paragraph.lessons.tasks;

import java.util.ArrayList;

public class TestTask extends Task {
    String answer;
    ArrayList<String> variants;

    public TestTask(String text, TaskDisplayBehavior taskDisplayBehavior, int answer, ArrayList<String> variants) {
        super(text, taskDisplayBehavior);
        this.answer = variants.get(answer);
        this.variants = variants;
    }

    @Override
    public boolean answer(String answer) {
        accepted = this.answer.equals(answer);
        return accepted;
    }

    public ArrayList<String> getVariants() {
        return variants;
    }
}
