import javax.swing.*;


public class OtherFrame extends MainFrame {

    private JPanel otherpanel;
    private JTextArea helloTextArea;

    public OtherFrame() {

        setContentPane(otherpanel);
        setTitle("Port");
        setBounds(150,-10,1200, 1500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        if(h1.isSelected()){
            helloTextArea.setText(ex.giveWeight(Integer.parseInt(weighttext.getText()),0));
            JOptionPane.showMessageDialog(null,ex.giveWeight(Integer.parseInt(weighttext.getText()),0) );}
        if(h2.isSelected()) {
            helloTextArea.setText(ex2.giveWeight(Integer.parseInt(weighttext.getText()), 0));
        }
        if(h3.isSelected()) {
           helloTextArea.setText(ex3.giveWeight(Integer.parseInt(weighttext.getText()), 0));}
    }

    public static void main(String[] args) {
        OtherFrame myframme= new OtherFrame();
    }
}

