import javax.swing.*;
import java.awt.*;

public class NumButton extends JButton {
    public NumButton(String text) {
        super(text);
        setBorder(BorderFactory.createRaisedBevelBorder());
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
    }
}
