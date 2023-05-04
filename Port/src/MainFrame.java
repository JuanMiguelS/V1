import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainFrame extends JFrame {
    private JTextField textField1;
    private JPanel mainPanel;
    private JComboBox comboBox1;
    private JRadioButton a1RadioButton;
    private JTextArea descriptionIsShownHereTextArea;
    private JTextArea logo;
    private JTextField textField2;
    private JTextField textField3;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JCheckBox customInspectionCheckBox;
    private JButton pileButton;
    private JButton unpileButton;
    private JTextField columnNumberTextField;
    private JTextArea descriptionIsShownHereTextArea1;
    private JTextField putNumberHereTextField;
    private JButton description;

    public JTextField weighttext;
    private JButton numberc;
    private JComboBox cccountry;
    private JLabel logop;
    public JRadioButton h1;
    public JRadioButton h2;
    public JRadioButton h3;
    private JButton weightcheckButton;


    Hub ex=new Hub();
    Hub ex2=new Hub();
    Hub ex3=new Hub();
    Container one=new Container();



    public MainFrame(){

        setContentPane(mainPanel);
        setTitle("Port");
        setBounds(150,-10,1200, 1500);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        logop.setBounds(550,250, 10,10);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                int option = JOptionPane.showConfirmDialog(
                        null,
                        "Are you sure you want to cease the operation?",
                        "Closure confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });








        logop.setSize(20,20);
        description.setSize(1,1);


        weightcheckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        pileButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){






                try{
                    one.setIdentifiernumber(Integer.parseInt(textField1.getText()));

                }catch(Exception u){
                    JOptionPane.showMessageDialog(null, "The ID introduced is not valid");


                }

                try{
                    one.setWeight(Integer.parseInt(weighttext.getText()));

                }catch(Exception u){
                    JOptionPane.showMessageDialog(null, "The weight introduced is not valid");
                }






                one.setDescription(descriptionIsShownHereTextArea.getText());
                one.setCountryoforigin((String)comboBox1.getSelectedItem());
                if (a1RadioButton.isSelected()) one.setPriority(1);
                if (a2RadioButton.isSelected()) one.setPriority(2);
                if (a3RadioButton.isSelected()) one.setPriority(3);
                one.inspected=customInspectionCheckBox.isSelected();
                one.setCompanysend(textField2.getText());
                one.setCompanyreceive(textField3.getText());

                System.out.println("A container is being stacked...");
                if(h1.isSelected()){
                    ex.stack(one);
                    logo.setText(ex.toString());}
                if(h2.isSelected()) {
                    ex2.stack(one);
                    logo.setText(ex2.toString());}
                if(h3.isSelected()) {
                    ex3.stack(one);
                    logo.setText(ex3.toString());}





            }
        });
        description.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                descriptionIsShownHereTextArea1.setText(one.toString());


            }


        });


        unpileButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("A container from the selected column has been removed");

                if (h1.isSelected()){
                ex.unstack(Integer.parseInt(columnNumberTextField.getText()));
                logo.setText(ex.toString());}
                if (h2.isSelected()){
                    ex2.unstack(Integer.parseInt(columnNumberTextField.getText()));
                    logo.setText(ex2.toString());}
                if (h3.isSelected()){
                    ex3.unstack(Integer.parseInt(columnNumberTextField.getText()));
                    logo.setText(ex3.toString());}



            }
        });

        numberc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){

                //ex.ccountry((String) cccountry.getSelectedItem());

                putNumberHereTextField.setText(String.valueOf(ex.ccountry((String) cccountry.getSelectedItem())+
                        ex2.ccountry((String) cccountry.getSelectedItem())+
                        ex3.ccountry((String) cccountry.getSelectedItem())));

            }
        });






    }








    public static void main(String[] args) {
        MainFrame myFrame= new MainFrame();

        JLabel logop= new JLabel();

        logop.setSize(10, 10);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
