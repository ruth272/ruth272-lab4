import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnigmaFrame extends JFrame{
    private JButton encrypt;
    private JButton decrypt;
    private JTextArea input;
    private JTextArea output;
    private JComboBox<Integer> rotor1;
    private JComboBox<Integer> rotor2;
    private JComboBox<Integer> rotor3;
    private JTextField startChar;
    
    private final Integer[] num = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public EnigmaFrame() {
        super();
        
        encrypt = new JButton("Encrpyt");
        decrypt = new JButton("Decrypt");
        input = new JTextArea();
        output = new JTextArea();
        rotor1 = new JComboBox<Integer>(num);
        rotor2 = new JComboBox<Integer>(num);
        rotor3 = new JComboBox<Integer>(num);
        startChar = new JTextField(10);


        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("Inner"));
        panel.add(rotor1);
        panel.add(new JLabel("Middle"));
        panel.add(rotor2);
        panel.add(new JLabel("Out"));
        panel.add(rotor3);
        panel.add(new JLabel("Initial Positions"));
        panel.add(startChar);
        panel.add(encrypt);
        panel.add(decrypt);
        panel.add(new JLabel("Input"));
        panel.add(input);
        panel.add(new JLabel("output"));
        panel.add(output);

        this.add(panel);
        this.setDefaultCloseOperation(EnigmaFrame.EXIT_ON_CLOSE);
        this.pack();
    }

}
