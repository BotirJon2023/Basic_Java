package org.example;

import java.time.LocalDate;

public class UrgentTask extends Task2 {

    public UrgentTask(String title, LocalDate deadline, int priority, double reward) {
        super(title, deadline, priority, reward);
    }

    public UrgentTask(String description) {
        super(description);
        // Устанавливаем приоритет и дедлайн для задачи срочного выполнения
        setPriority(1);
        setDeadline(LocalDate.now());
    }

    @Override
    public double calculatePayment() {
        // Переопределенный метод calculatePayment, стоимость вдвое выше
        double basePayment = super.calculatePayment();
        return basePayment * 2;
    }
}
