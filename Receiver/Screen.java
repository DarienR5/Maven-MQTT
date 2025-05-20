package Receiver;
import java.awt.Color;
import java.awt.Graphics;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;

public class Screen extends JPanel implements PropertyChangeListener {

    private int x, y;
    private int type; // 1 = circle, 2 = square

 
    private static Screen instance;


    private Screen() {
    }

    // Get the Singleton instance of Screen
    public static Screen getInstance() {
        if (instance == null) {
            instance = new Screen();
        }
        return instance;
    }

@Override
public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.RED);

    if (type == 1) {
        g.fillOval(x, y, 50, 50);  // Draw circle
    } else if (type == 2) {
        g.fillRect(x, y, 50, 50);  // Draw square
    }
}





@Override
public void propertyChange(PropertyChangeEvent evt) {
    switch (evt.getPropertyName()) {
        case "x":
            this.x = (Integer) evt.getNewValue();
            break;
        case "y":
            this.y = (Integer) evt.getNewValue();
            break;
        case "type":
            this.type = (Integer) evt.getNewValue();
            break;
    }
    repaint();
}
}