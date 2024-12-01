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
    
    public EnigmaFrame() {
        super();
        
        encrypt = new JButton("Encrpyt");
        decrypt = new JButton("Decrypt");
        input = new JTextArea();
        output = new JTextArea();


        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("Inner"));
        panel.add(new JLabel("Middle"));
        panel.add(new JLabel("Out"));
        panel.add(new JLabel("Initial Positions"));
        panel.add(encrypt);
        panel.add(decrypt);

        this.add(panel);
        this.setDefaultCloseOperation(EnigmaFrame.EXIT_ON_CLOSE);
        this.pack();
    }

}
