import javax.swing.*;
import java.awt.*;

public class Calculator extends JPanel{
    public Calculator() {
        add(new JTextField(), BorderLayout.NORTH);
        add(new NumPad(), BorderLayout.CENTER);
        setLayout(new BorderLayout());
    }
}