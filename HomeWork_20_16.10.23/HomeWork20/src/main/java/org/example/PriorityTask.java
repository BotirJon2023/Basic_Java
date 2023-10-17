package org.example;

class PriorityTask extends Task2 {
    // Поле для хранения требуемого приоритета
    private int requiredPriority;

    // Конструктор класса PriorityTask
    public PriorityTask(int requiredPriority) {
        super(getPriority());
        this.requiredPriority = requiredPriority;
    }

    // Переопределение метода calculatePayment() для учета требуемого приоритета
    @Override
    public double calculatePayment() {
        // Предположим, что calculatePayment() возвращает стоимость выполнения задачи
        // Проверяем, соответствует ли текущий приоритет требуемому приоритету
        if (getCurrentPriority() == requiredPriority) {
            // Рассчитываем стоимость выполнения задачи только если приоритет соответствует требуемому
            // Реализация расчета стоимости выполнения задачи может быть добавлена здесь
            return super.calculatePayment(); // Возвращаем результат родительского метода calculatePayment()
        } else {
            // Если приоритет не соответствует требуемому, возвращаем 0
            return 0;
        }
    }

    // Метод для получения текущего приоритета задачи (предположим, что он определен в базовом классе Task)
    private int getCurrentPriority() {
        // Реализация получения текущего приоритета может быть добавлена здесь
        // Предположим, что текущий приоритет возвращается как int
        return 0; // Временное значение, замените его на реальную логику получения приоритета
    }
}

