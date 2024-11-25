import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnigmaFrame {
    private JLabel innerValue;
    private JLabel middleValue;
    private JLabel outValue;
    private JLabel initialPosition;
    private JButton encrypt;
    private JButton decrypt;
    private JTextArea input;
    private JTextArea output;
    private JTextField rotor1;
    private JTextField rotor2;
    private JTextField rotor3;


    public EnigmaFrame() {
        super();
        innerValue = new JLabel();
        middleValue = new JLabel();
        outValue = new JLabel();
        initialPosition = new JLabel();
        encrypt = new JButton();
        decrypt = new JButton();
        input = new JTextArea();
        output = new JTextArea();

    }
    
    public class JComboBox {        //selects the rotor number

    }

    public class JTextField {       //inputs 3 starting characters

    }

    public class JTextArea {        //provide input or output for the encrypt/decrpyt

    }

    public class JButton {      //selects encrpty or decrypt
        //encrypt = new JButton("Encrypt");
        //decrypt = new JButton("Decrypt");
    }
    

    public class JLabel {           //labels fiels
        
    }
}
