f/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import project.MainFrame;


/**
 *
 * 
 */
public class DocFrame extends JFrame{

        public String name;

       private JPanel contentPane;

       private JTextField textField_2;

        ModelDocMongo a= new ModelDocMongo();

        public DocFrame(String name) {

                this.name=name;

              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

              setBounds(100, 100, 657, 465);

              contentPane = new JPanel();

              contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

              setContentPane(contentPane);

              contentPane.setLayout(null);
              
              JButton btnLogout = new JButton("Logout");
              btnLogout.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  try {
                      MainFrame frame = new MainFrame();
                      setVisible(false);
                      frame.setVisible(true);
                  } catch (SQLException ex) {
                      Logger.getLogger(DocFrame.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
              }
              });
              btnLogout.setBounds(524, 388, 89, 23);
              contentPane.add(btnLogout);

             

              JTextArea textArea = new JTextArea();

              textArea.setBounds(98, 205, 405, 150);

              contentPane.add(textArea);

             

              JCheckBox checkBox = new JCheckBox("Genie");

              checkBox.setBounds(168, 91, 60, 23);

              contentPane.add(checkBox);

             

              JCheckBox checkBox_1 = new JCheckBox("EPS");

              checkBox_1.setBounds(245, 91, 56, 23);

              contentPane.add(checkBox_1);

             

              JCheckBox checkBox_2 = new JCheckBox("Business");

              checkBox_2.setBounds(326, 91, 83, 23);

              contentPane.add(checkBox_2);

              textField_2 = new JTextField();

              JButton btnSend = new JButton("Send");

              btnSend.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {

                           String sub=textField_2.getText();

                                String cont=textArea.getText();

                                int g=0;

                                int e=0;

                                int b=0;

                                if(checkBox.isSelected()){

                                    g=1;

                   

                                }

                                if(checkBox_1.isSelected()){

                                    e=2;

                                   

                                }

                                if(checkBox_2.isSelected()){

                                    b=3;

                                   

                                    }

                               

                                String c=g+","+e+","+b;

                               // System.out.println(c);

                                Notification not=new Notification();

                                 not.visible();

                                a.connect(name,sub, cont, c);

                                

                                 

                    }

              });

              btnSend.setBounds(272, 388, 89, 23);

              contentPane.add(btnSend);

             

             

              textField_2.setColumns(10);

              textField_2.setBounds(168, 134, 230, 20);

              contentPane.add(textField_2);

             

              JLabel lblContent = new JLabel("Content:");

              lblContent.setForeground(Color.WHITE);

              lblContent.setFont(new Font("Tahoma", Font.BOLD, 14));

              lblContent.setBounds(98, 167, 73, 27);

              contentPane.add(lblContent);

             

              JLabel lblTitle = new JLabel("Subject:");

              lblTitle.setForeground(Color.WHITE);

              lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));

              lblTitle.setBounds(98, 129, 60, 27);

              contentPane.add(lblTitle);

             

              JLabel lblTo = new JLabel("To:");

              lblTo.setForeground(Color.WHITE);

              lblTo.setFont(new Font("Tahoma", Font.BOLD, 14));

              lblTo.setBounds(98, 91, 60, 27);

              contentPane.add(lblTo);

             

              JLabel lblAddCircular = new JLabel("Add Circular");

              lblAddCircular.setForeground(Color.WHITE);

              lblAddCircular.setFont(new Font("Papyrus", Font.BOLD, 28));

              lblAddCircular.setBounds(245, 11, 222, 48);

              contentPane.add(lblAddCircular);

             

              JLabel label = new JLabel("");

              label.setIcon(new ImageIcon("C:\\Users\\...\\Downloads\\80o5dc-641x426.jpg"));

              label.setBounds(0, 0, 641, 426);

              contentPane.add(label);

       }

}

