package com.company.course.paragraph.lesson.task;

import java.util.function.Function;

public class CountTask extends Task {
    Number[] numbers;
    Function<Number[], String> function;
    String answer;

    public CountTask(String text, int maxScore, Function<Number[], String> function, Number[] numbers) {
        super(text, maxScore);
        this.numbers = numbers;
        this.function = function;
        this.answer = function.apply(numbers);
    }

    @Override
    public String getText() {
        return text.formatted((Object[]) numbers);
    }

    @Override
    public boolean answer(String answer) {
        boolean accepted = answer.equals(this.answer);
        if (accepted) {
            score = maxScore;
        }
        return accepted;
    }
}
