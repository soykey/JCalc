import javax.swing.*;

public class Calculator extends JPanel{
    public Calculator() {
//        setLayout(new GridLayout(2, 1));
        add(new JTextField());
        add(new NumPad());
    }
}