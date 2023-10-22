package main.inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> gamePanel.changeYAxis(-5);
            case KeyEvent.VK_A -> gamePanel.changeXAxis(-5);
            case KeyEvent.VK_S -> gamePanel.changeYAxis(5);
            case KeyEvent.VK_D -> gamePanel.changeXAxis(5);
            default -> System.out.println("OUTRA TECLA QUALQUER");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
