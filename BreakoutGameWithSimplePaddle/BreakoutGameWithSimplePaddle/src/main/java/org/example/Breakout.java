package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Breakout extends JPanel {
    private int ballX = 300, ballY = 400, ballDx = 2, ballDy = -2, ballDiameter = 15;
    private int paddleX = 250, paddleWidth = 100, paddleHeight = 10;
    private final int PADDLE_SPEED = 20;
    private boolean gameOver = false;

    public Breakout() {
        this.setPreferredSize(new Dimension(600, 500));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT && paddleX > 0) {
                    paddleX -= PADDLE_SPEED;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT && paddleX < getWidth() - paddleWidth) {
                    paddleX += PADDLE_SPEED;
                }
            }
        });

        Timer timer = new Timer(5, e -> {
            if (!gameOver) {
                moveBall();
                checkCollisions();
                repaint();
            }
        });
        timer.start();
    }

    private void moveBall() {
        ballX += ballDx;
        ballY += ballDy;

        if (ballX <= 0 || ballX >= getWidth() - ballDiameter) {
            ballDx = -ballDx;
        }
        if (ballY <= 0) {
            ballDy = -ballDy;
        }
        if (ballY >= getHeight()) {
            gameOver = true;
        }
    }

    private void checkCollisions() {
        if (ballY + ballDiameter >= getHeight() - paddleHeight && ballX >= paddleX && ballX <= paddleX + paddleWidth) {
            ballDy = -ballDy;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);
        g.fillRect(paddleX, getHeight() - paddleHeight, paddleWidth, paddleHeight);

        if (gameOver) {
            g.setColor(Color.RED);
            g.drawString("Game Over", getWidth() / 2 - 50, getHeight() / 2);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Breakout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Breakout());
        frame.pack();
        frame.setVisible(true);
    }
}
