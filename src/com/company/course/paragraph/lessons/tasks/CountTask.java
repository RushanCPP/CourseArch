package com.company.course.paragraph.lessons.tasks;

import java.util.function.Function;

public class CountTask extends Task {
    Number ans;
    Number[] numbers;

    public CountTask(String text, TaskDisplayBehavior taskDisplayBehavior, Function<Number[], Number> func, Number... numbers) {
        super(text, taskDisplayBehavior);
        this.numbers = numbers;
        this.ans = func.apply(numbers);
    }

    @Override
    public String getText() {
        return text.formatted((Object[]) numbers);
    }

    @Override
    public boolean answer(String answer) {
        accepted = ans.toString().equals(answer);
        return accepted;
    }
}
