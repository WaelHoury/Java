/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
import doc.Doctor;
import doc.ModelDoctor;
import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.ImageIcon;
	import java.awt.Color;
	import java.awt.Font;
import java.awt.List;
	import javax.swing.UIManager;
	import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
	import javax.swing.JTextField;
	import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
/**
 *
 * 
 */
public class AddDoc extends JFrame {

    private  ArrayList<JCheckBox> checkBoxes = new ArrayList<JCheckBox>();

   

    

    private JPanel contentPane;

              private JTextField textField;

              private JTextField textField_1;

              private JPasswordField passwordField;

 

             

              /**

              * Create the frame.

              */

              public AddDoc() throws SQLException {

                       

                        ModelDoctor modelDoc = new ModelDoctor(this);

                     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    setBounds(100, 100, 672, 465);

                    contentPane = new JPanel();

                    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

                    setContentPane(contentPane);

                    contentPane.setLayout(null);
                    
                    JButton btnBack = new JButton("Back");
                    btnBack.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    
                    AdminFrame frame = new AdminFrame();
                    setVisible(false);
                    frame.setVisible(true);
                    
                    }
                    });
                    btnBack.setBounds(480, 383, 89, 23);
                    contentPane.add(btnBack);
                    
                    JTextArea textArea = new JTextArea();
                    textArea.setBounds(143, 222, 241, 63);
                    contentPane.add(textArea);

                   

                    JLabel label_1 = new JLabel("Password:");

                     label_1.setForeground(Color.WHITE);

                    label_1.setFont(new Font("Tahoma", Font.BOLD, 18));

                     label_1.setBackground(Color.BLACK);

                    label_1.setBounds(42, 296, 185, 63);

                    contentPane.add(label_1);

                   

                    passwordField = new JPasswordField();

                    passwordField.setBounds(143, 320, 241, 20);

                    contentPane.add(passwordField);

                   

                    JCheckBox chckbxBuisin = new JCheckBox("Business");

                    chckbxBuisin.setBounds(301, 366, 83, 23);

                    contentPane.add(chckbxBuisin);

                    this.checkBoxes.add(chckbxBuisin);

                         chckbxBuisin.addActionListener(new ActionListener() {

                   

                    public void actionPerformed(ActionEvent e) {

                            if (chckbxBuisin.isSelected()) {

                                System.out.println(chckbxBuisin.getText());

                            }

                          

                    }

              });

                    JCheckBox chckbxEps = new JCheckBox("EPS");

                    chckbxEps.setBounds(220, 366, 56, 23);

                    contentPane.add(chckbxEps);

                    this.checkBoxes.add(chckbxEps);

                         chckbxEps.addActionListener(new ActionListener() {

                   

                    public void actionPerformed(ActionEvent e) {

                            if (chckbxEps.isSelected()) {

                                System.out.println(chckbxEps.getText());

                            }

                          

                    }

              });

                        

                    JCheckBox chckbxGenie = new JCheckBox("Genie");

                    chckbxGenie.setBounds(143, 366, 56, 23);

                    contentPane.add(chckbxGenie);

                    this.checkBoxes.add(chckbxGenie);

                        chckbxGenie.addActionListener(new ActionListener() {

                           

                    public void actionPerformed(ActionEvent e) {

                            if (chckbxGenie.isSelected()) {

                                System.out.println(chckbxGenie.getText());

                            }

                          

                    }

              });

                        

                        

                     JButton btnAddStudent = new JButton("Add Doctor");

                    btnAddStudent.setBounds(452, 224, 146, 63);

                    contentPane.add(btnAddStudent);

                     btnAddStudent.addActionListener(new ActionListener() {

                       

                    public void actionPerformed(ActionEvent e) {

                        ArrayList<Integer> array= new ArrayList<Integer>();

                            for (JCheckBox checkBox : checkBoxes) {

                                if (checkBox.isSelected()) {

                                    if(checkBox.getText().equalsIgnoreCase("genie")){

                                        array.add(1);

                                    }else if(checkBox.getText().equalsIgnoreCase("eps")){

                                        array.add(2);

                                    }else array.add(3);

                                   

                                }

                            }

                            Doctor doc = new Doctor(textField.getText(),passwordField.getText(),textArea.getText(),textField_1.getText(),array);

                            try {

                                modelDoc.addDoc(doc);

                            } catch (SQLException ex) {

                                Logger.getLogger(AddDoc.class.getName()).log(Level.SEVERE, null, ex);

                            }

                    }

              });

                   

                    textField_1 = new JTextField();

                    textField_1.setColumns(10);

                    textField_1.setBounds(143, 169, 241, 20);

                     contentPane.add(textField_1);//email

                   

                    textField = new JTextField();

                    textField.setBounds(143, 108, 241, 20);

                    contentPane.add(textField);//name

                    textField.setColumns(10);

                   

                    JLabel lblFaculty = new JLabel("Faculty:");

                     lblFaculty.setForeground(Color.WHITE);

                    lblFaculty.setFont(new Font("Tahoma", Font.BOLD, 18));

                     lblFaculty.setBackground(Color.BLACK);

                    lblFaculty.setBounds(42, 343, 185, 63);

                    contentPane.add(lblFaculty);

                   

                    JLabel lblAddress = new JLabel("Address:");

                     lblAddress.setForeground(Color.WHITE);

                    lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));

                     lblAddress.setBackground(Color.BLACK);

                    lblAddress.setBounds(42, 200, 185, 63);

                    contentPane.add(lblAddress);

                   

                    JLabel lblEmail = new JLabel("Email:");

                     lblEmail.setForeground(Color.WHITE);

                    lblEmail.setFont(new Font("Tahoma", Font.BOLD, 18));

                    lblEmail.setBackground(new Color(0, 0, 0));

                    lblEmail.setBounds(42, 145, 185, 63);

                    contentPane.add(lblEmail);

                   

                    JLabel lblName = new JLabel("Name:");

                     lblName.setForeground(Color.WHITE);

                    lblName.setFont(new Font("Tahoma", Font.BOLD, 18));

                     lblName.setBackground(Color.BLACK);

                    lblName.setBounds(42, 84, 185, 63);

                    contentPane.add(lblName);

                   

                    JLabel lblAddStudent = new JLabel("Add Doctor");

                     lblAddStudent.setForeground(Color.WHITE);

                    lblAddStudent.setFont(new Font("Tahoma", Font.BOLD, 24));

                     lblAddStudent.setBackground(SystemColor.desktop);

                    lblAddStudent.setBounds(247, 11, 185, 63);

                    contentPane.add(lblAddStudent);

                   

                    JLabel label = new JLabel("");

                    label.setIcon(new ImageIcon("C:\\Users\\....\\Downloads\\chalk-656x426.jpg"));

                    label.setBounds(0, 0, 656, 426);

                    contentPane.add(label);

              }

             

                public static void main(String[] args) throws SQLException{

        // TODO code application logic here

        AddDoc frame= new AddDoc();

        frame.setVisible(true);

    }

}

