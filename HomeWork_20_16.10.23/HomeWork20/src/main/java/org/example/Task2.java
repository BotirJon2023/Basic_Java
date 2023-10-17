package org.example;

import java.time.LocalDate;

public class Task2 {
    private String title;

    public Task2(String name, double reward) {
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    private LocalDate deadline;
    private int priority;

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    private double reward;

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    // Конструктор для инициализации полей
    public Task2(String title, LocalDate deadline, int priority, double reward) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
        this.reward = reward;
    }

    // Метод для расчета стоимости выполнения задачи в зависимости от приоритета
    public double calculatePayment() {
        if (priority == 1) {
            // Высокий приоритет
            return reward * 1.5;
        } else if (priority == 2) {
            // Средний приоритет
            return reward * 1.0;
        } else {
            // Низкий приоритет
            return reward * 0.5;
        }
    }
}

