import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class convertor {
    private JPanel convertor;
    private JTextField textField1;
    private JButton button1;
    private JButton cButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton binaryButton;
    private JButton hexadecimalButton;
    private JRadioButton binaryModeRadioButton;
    private JRadioButton hexadecimalModeRadioButton;

    public convertor() {
        ButtonGroup G= new ButtonGroup();
        G.add(binaryModeRadioButton);
        G.add(hexadecimalModeRadioButton);
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1ButtonText = textField1.getText() + a1Button.getText();
                textField1.setText(a1ButtonText);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a2ButtonText = textField1.getText() + a2Button.getText();
                textField1.setText(a2ButtonText);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a3ButtonText = textField1.getText() + a3Button.getText();
                textField1.setText(a3ButtonText);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a4ButtonText = textField1.getText() + a4Button.getText();
                textField1.setText(a4ButtonText);
            }
        });a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a5ButtonText = textField1.getText() + a5Button.getText();
                textField1.setText(a5ButtonText);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a6ButtonText = textField1.getText() + a6Button.getText();
                textField1.setText(a6ButtonText);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a7ButtonText = textField1.getText() + a7Button.getText();
                textField1.setText(a7ButtonText);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a8ButtonText = textField1.getText() + a8Button.getText();
                textField1.setText(a8ButtonText);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a9ButtonText = textField1.getText() + a9Button.getText();
                textField1.setText(a9ButtonText);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a0ButtonText = textField1.getText() + a0Button.getText();
                textField1.setText(a0ButtonText);
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        binaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=textField1.getText();
                String result="";
                int i= Integer.parseInt(s);
                while(i>0){
                    int a=i%2;
                    result=String.valueOf(a)+result;
                    i=i/2;
                }
                textField1.setText(result);
            }
        });
        hexadecimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=textField1.getText();
                String result="";
                int i= Integer.parseInt(s);
                while(i>0){
                    int a=i%16;
                    if(a<=9){
                        result=String.valueOf(a) + result;
                    }
                    else{
                        switch(a-9){
                            case 1:
                            {result='A'+result;
                                break;}
                            case 2:
                            {result='B'+result;
                                break;}
                            case 3:
                            {result='C'+result;
                                break;}
                            case 4:
                            {result='D'+result;
                                break;}
                            case 5:
                            {result='E'+result;
                                break;}
                            case 6:
                            {result='F'+result;
                                break;}
                        }
                    }
                    i=i/16;
                }
                textField1.setText(result);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=textField1.getText();
                String x="";
                int k=s.length();
                if(k>1){
                    x=s.substring(0,k-1);
                }
                else{
                    x="";
                }
                textField1.setText(x);
            }
        });
        binaryModeRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                hexadecimalModeRadioButton.setSelected(false);
                hexadecimalButton.setEnabled(false);
                binaryButton.setEnabled(true);
                hexadecimalModeRadioButton.setEnabled(true);
                binaryModeRadioButton.setEnabled(false);
            }
        });
        hexadecimalModeRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                binaryModeRadioButton.setSelected(false);
                binaryButton.setEnabled(false);
                hexadecimalButton.setEnabled(true);
                binaryModeRadioButton.setEnabled(true);
                hexadecimalModeRadioButton.setEnabled(false);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("convertor");
        frame.setContentPane(new convertor().convertor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
