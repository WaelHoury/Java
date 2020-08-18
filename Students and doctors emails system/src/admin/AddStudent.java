/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.ImageIcon;
	import java.awt.Color;
	import java.awt.Font;
	import javax.swing.UIManager;
	import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import java.util.ArrayList;
	import javax.swing.JTextField;
	import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import student.ModelStudent;
import student.Student;
/**
 *
 * 
 */
public class AddStudent extends JFrame {

    private JPanel contentPane;

       private JTextField textField;

       private JTextField textField_1;

       private final JRadioButton rdbtnGenie = new JRadioButton("Genie");

       private JPasswordField passwordField;

        private  int fac=0;

       /**

       * Launch the application.

       */

      

       /**

       * Create the frame.

       */

       public AddStudent() throws SQLException {

            ModelStudent modelStd = new ModelStudent(this);

              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

              setBounds(100, 100, 672, 465);

              contentPane = new JPanel();

              contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

              setContentPane(contentPane);

              contentPane.setLayout(null);
              
              JButton btnBack = new JButton("Back");
              btnBack.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent arg0) {
              
              AdminFrame frame = new AdminFrame();
              setVisible(false);
              frame.setVisible(true);
              
              }
              });
              
              JTextArea textArea = new JTextArea();
              textArea.setBounds(143, 224, 241, 58);
              contentPane.add(textArea);
              btnBack.setBounds(486, 392, 89, 23);
              contentPane.add(btnBack);

             

              passwordField = new JPasswordField();

              passwordField.setBounds(143, 317, 241, 20);

              contentPane.add(passwordField);

             

              JRadioButton rdbtnBusiness = new JRadioButton("Business");

              rdbtnBusiness.setBounds(307, 362, 77, 31);

              contentPane.add(rdbtnBusiness);

              rdbtnBusiness.addActionListener(new ActionListener() {

                   

                    public void actionPerformed(ActionEvent e) {

                            if (rdbtnBusiness.isSelected()) {

                              

                                fac=3;

                                 System.out.println(fac);

                            }

                          

                    }

              });

              JRadioButton rdbtnEps = new JRadioButton("EPS");

              rdbtnEps.setBounds(223, 362, 60, 31);

              contentPane.add(rdbtnEps);

              rdbtnGenie.setBounds(143, 362, 60, 31);

              contentPane.add(rdbtnGenie);

              rdbtnEps.addActionListener(new ActionListener() {

                   

                    public void actionPerformed(ActionEvent e) {

                            if (rdbtnEps.isSelected()) {

                              

                                fac=2;

                                 System.out.println(fac);

                            }

                          

                    }

              });

                  rdbtnGenie.addActionListener(new ActionListener() {

                   

                    public void actionPerformed(ActionEvent e) {

                            if (rdbtnGenie.isSelected()) {

                              

                                fac=1;

                                 System.out.println(fac);

                            }

                          

                    }

              });

              JButton btnAddStudent = new JButton("Add Student");

              btnAddStudent.setBounds(452, 224, 146, 63);

              contentPane.add(btnAddStudent);

              btnAddStudent.addActionListener(new ActionListener() {

                       

                    public void actionPerformed(ActionEvent e) {

                       

                            Student std = new Student(textField.getText(),passwordField.getText(),textArea.getText(),textField_1.getText(),fac);

                           

                            try {

                                modelStd.addStudent(std);

                            } catch (SQLException ex) {

                                java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

                            }

                         

                    }

              });

             

              textField_1 = new JTextField();

              textField_1.setColumns(10);

              textField_1.setBounds(143, 169, 241, 20);

              contentPane.add(textField_1);

             

              textField = new JTextField();

              textField.setBounds(143, 108, 241, 20);

              contentPane.add(textField);

              textField.setColumns(10);

             

              JLabel lblFaculty = new JLabel("Faculty:");

              lblFaculty.setForeground(Color.WHITE);

              lblFaculty.setFont(new Font("Tahoma", Font.BOLD, 18));

              lblFaculty.setBackground(Color.BLACK);

              lblFaculty.setBounds(42, 343, 185, 63);

              contentPane.add(lblFaculty);

             

              JLabel lblCity = new JLabel("Password:");

              lblCity.setForeground(Color.WHITE);

              lblCity.setFont(new Font("Tahoma", Font.BOLD, 18));

              lblCity.setBackground(Color.BLACK);

              lblCity.setBounds(42, 293, 185, 63);

              contentPane.add(lblCity);

             

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

             

              JLabel lblAddStudent = new JLabel("Add Student");

              lblAddStudent.setForeground(Color.WHITE);

              lblAddStudent.setFont(new Font("Tahoma", Font.BOLD, 24));

              lblAddStudent.setBackground(SystemColor.desktop);

              lblAddStudent.setBounds(247, 11, 185, 63);

              contentPane.add(lblAddStudent);

             

              JLabel label = new JLabel("");

              label.setIcon(new ImageIcon("C:\\Users\\...\\Downloads\\chalk-656x426.jpg"));

              label.setBounds(0, 0, 656, 426);

              contentPane.add(label);

       }

         public static void main(String[] args) throws SQLException{

        // TODO code application logic here

        AddStudent frame= new AddStudent();

        frame.setVisible(true);

    }
}

