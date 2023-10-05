import javax.swing.*;
import java.awt.*;

public class NumPad extends JPanel {
    public NumPad() {
        NumButton one = new NumButton("1");
        NumButton two = new NumButton("2");
        NumButton three = new NumButton("3");
        NumButton four = new NumButton("4");
        NumButton five = new NumButton("5");
        NumButton six = new NumButton("6");
        NumButton seven = new NumButton("7");
        NumButton eight = new NumButton("8");
        NumButton nine = new NumButton("9");
        NumButton zero = new NumButton("0");
        NumButton decimal = new NumButton(".");
        NumButton plus = new NumButton("+");
        NumButton minus = new NumButton("-");
        NumButton multiply = new NumButton("*");
        NumButton divide = new NumButton("/");
        NumButton equals = new NumButton("=");
        NumButton clear = new NumButton("C");

        setLayout(new GridBagLayout());

        // Add buttons to the panel
        add(seven);
        add(eight);
        add(nine);
        add(divide);
        add(four);
        add(five);
        add(six);
        add(multiply);
        add(one);
        add(two);
        add(three);
        add(minus);
        add(zero);
        add(decimal);
        add(equals);
        add(plus);
        add(clear);

        setBackground(Color.white);
    }
}
