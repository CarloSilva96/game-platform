package main;

import main.inputs.KeyboardInputs;
import main.inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private int xAxis = 100; // EIXO X
    private int yAxis = 100; // EIXO Y
    public GamePanel() {
        addKeyListener(new KeyboardInputs(this));
        var mouseInputs = new MouseInputs(this);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.fillRect(xAxis, yAxis, 200, 50);
    }

    public void changeXAxis(int newXAxis) {
        this.xAxis += newXAxis;
        repaint(); // MÉTODO USADO PARA REPINTAR SEMPRE QUE UMA TECLA DE AÇÃO FOR CAPTURADA
    }

    public void changeYAxis(int newYAxis) {
        this.yAxis += newYAxis;
        repaint();
    }

    public void setXAxisAndYAxisWithMouseMovement(int newXAxis, int newYAxis) {
        this.xAxis = newXAxis;
        this.yAxis = newYAxis;
        repaint();
    }
}
