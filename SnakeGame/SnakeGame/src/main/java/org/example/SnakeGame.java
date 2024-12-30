package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Timer;

public class SnakeGame1 {

    public class SnakeGame extends JFrame {
        private final int WIDTH = 800, HEIGHT = 600;
        private final int SIZE = 20; // Size of each block
        private final int MAX_LENGTH = (WIDTH * HEIGHT) / (SIZE * SIZE);
        private LinkedList<Point> snake;
        private Point food;
        private boolean gameOver;
        private String direction;

        public SnakeGame() throws InterruptedException {
            this.setTitle("Snake Game");
            this.setSize(WIDTH, HEIGHT);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    int key = e.getKeyCode();
                    if (key == KeyEvent.VK_LEFT && !direction.equals("RIGHT")) direction = "LEFT";
                    if (key == KeyEvent.VK_RIGHT && !direction.equals("LEFT")) direction = "RIGHT";
                    if (key == KeyEvent.VK_UP && !direction.equals("DOWN")) direction = "UP";
                    if (key == KeyEvent.VK_DOWN && !direction.equals("UP")) direction = "DOWN";
                }
            });
            this.snake = new LinkedList<>();
            this.snake.add(new Point(5, 5));
            this.direction = "RIGHT";
            this.spawnFood();
            this.gameOver = false;

            Timer timer = new Timer(100, e -> {
                if (!gameOver) {
                    moveSnake();
                    checkCollisions();
                    repaint();
                }
            });
            timer.wait();
        }

        private void moveSnake() {
            Point head = snake.getFirst();
            Point newHead = new Point(head);
            switch (direction) {
                case "LEFT" -> newHead.x--;
                case "RIGHT" -> newHead.x++;
                case "UP" -> newHead.y--;
                case "DOWN" -> newHead.y++;
            }
            snake.addFirst(newHead);
            if (newHead.equals(food)) {
                spawnFood();
            } else {
                snake.removeLast();
            }
        }

        private void spawnFood() {
            Random rand = new Random();
            food = new Point(rand.nextInt(WIDTH / SIZE), rand.nextInt(HEIGHT / SIZE));
        }

        private void checkCollisions() {
            Point head = snake.getFirst();
            if (head.x < 0 || head.x >= WIDTH / SIZE || head.y < 0 || head.y >= HEIGHT / SIZE || snake.subList(1, snake.size()).contains(head)) {
                gameOver = true;
            }
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            if (gameOver) {
                g.setColor(Color.RED);
                g.drawString("Game Over", WIDTH / 2 - 50, HEIGHT / 2);
                return;
            }
            g.setColor(Color.GREEN);
            for (Point p : snake) {
                g.fillRect(p.x * SIZE, p.y * SIZE, SIZE, SIZE);
            }
            g.setColor(Color.RED);
            g.fillRect(food.x * SIZE, food.y * SIZE, SIZE, SIZE);
        }

        public void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                SnakeGame game = null;
                try {
                    game = new SnakeGame();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                game.setVisible(true);
            });
        }
    }
}
