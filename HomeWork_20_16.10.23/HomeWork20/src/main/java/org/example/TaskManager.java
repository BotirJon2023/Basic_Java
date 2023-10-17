package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager<T extends Task2> {
    private List<T> tasks = new ArrayList<>();

    public void addTask(T task) {
        tasks.add(task);
    }

    public double calculateTotalPayment() {
        double totalPayment = 0.0;
        for (T task : tasks) {
            totalPayment += task.getReward();
        }
        return totalPayment;
    }

    public static void main(String[] args) {
        // Пример использования класса TaskManager с задачами разных типов

        // Создаем объект TaskManager для работы с задачами типа FixedTask
        TaskManager<FixedTask> fixedTaskManager = new TaskManager<>();
        FixedTask fixedTask1 = new FixedTask("Task 1", 100.0);
        FixedTask fixedTask2 = new FixedTask("Task 2", 150.0);
        fixedTaskManager.addTask(fixedTask1);
        fixedTaskManager.addTask(fixedTask2);
        double fixedTaskTotalPayment = fixedTaskManager.calculateTotalPayment();
        System.out.println("Total Payment for Fixed Tasks: " + fixedTaskTotalPayment);

        // Создаем объект TaskManager для работы с задачами типа HourlyTask
        TaskManager<HourlyTask> hourlyTaskManager = new TaskManager<>();
        HourlyTask hourlyTask1 = new HourlyTask("Task 3", 10.0, 20);
        HourlyTask hourlyTask2 = new HourlyTask("Task 4", 15.0, 30);
        hourlyTaskManager.addTask(hourlyTask1);
        hourlyTaskManager.addTask(hourlyTask2);
        double hourlyTaskTotalPayment = hourlyTaskManager.calculateTotalPayment();
        System.out.println("Total Payment for Hourly Tasks: " + hourlyTaskTotalPayment);
    }
}

class Task {
    private String name;
    private double reward;

    public Task(String name, double reward) {
        this.name = name;
        this.reward = reward;
    }

    public double getreward() {
        return reward;
    }
}

class FixedTask extends Task2 {
    public FixedTask(String name, double reward) {
        super(name, reward);
    }
}

class HourlyTask extends Task2 {
    private int hoursWorked;

    public HourlyTask(String name, double hourlyRate, int hoursWorked) {
        super(name, hourlyRate * hoursWorked);
        this.hoursWorked = hoursWorked;
    }
}
