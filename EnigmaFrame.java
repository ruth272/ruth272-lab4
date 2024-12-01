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
        input = new JTextArea(5, 20);
        output = new JTextArea(5, 20);
        output.setEditable(false);
        rotor1 = new JComboBox<Integer>(num);
        rotor2 = new JComboBox<Integer>(num);
        rotor3 = new JComboBox<Integer>(num);
        startChar = new JTextField(3);


        JPanel panel = new JPanel(new FlowLayout());
        //add(panel, BorderLayout.NORTH);
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

        JPanel dpanel = new JPanel(new FlowLayout());
        add(dpanel, BorderLayout.SOUTH);
        dpanel.add(new JLabel("Input"));
        dpanel.add(input);
        dpanel.add(new JLabel("output"));
        dpanel.add(output);

        ConvertActionListener e = new ConvertActionListener();

        //encrypt.addActionListener(text -> convertText(true));
        //decrypt.addActionListener(text -> convertText(false));
        encrypt.addActionListener(e);
        decrypt.addActionListener(e);
        
        this.add(panel);
        this.setDefaultCloseOperation(EnigmaFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    private class ConvertActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ee) {
            try{
                String text = input.getText();

                int inner = (int) rotor1.getSelectedItem();
                int middle = (int) rotor2.getSelectedItem();
                int outer = (int) rotor3.getSelectedItem();
                String result = null;
                String start = startChar.getText();
                Enigma en = new Enigma(inner, middle, outer, start);
                if(ee.equals(encrypt)) {
                    result = en.encrypt(text);
                }
                else if(ee.equals(decrypt)){
                    result = en.decrypt(text);
                }
                output.setText(result);
                }catch(Exception e){
                output.setText("Starting character needs to be exactly 3.");
            }
        }
    }
}
