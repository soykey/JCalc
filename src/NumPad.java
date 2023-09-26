import javax.swing.*;
import java.awt.*;

public class NumPad extends JPanel {
    public NumPad() {
        add(new NumButton("OFF"));
        add(new NumButton("C"));
        add(new NumButton("AC"));
        add(new NumButton("1"));
        add(new NumButton("2"));
        add(new NumButton("3"));
        add(new NumButton("+"));
        add(new NumButton("4"));
        add(new NumButton("5"));
        add(new NumButton("6"));
        add(new NumButton("-"));
        add(new NumButton("7"));
        add(new NumButton("8"));
        add(new NumButton("9"));
        add(new NumButton("*"));
        add(new NumButton("0"));
        add(new NumButton("/"));
        add(new NumButton("="));
        setLayout(new GridLayout(7, 4, 5, 5));
        setBackground(Color.white);
    }
}
