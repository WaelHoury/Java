/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
public class AdminFrame extends JFrame {

  

 

       /**

       * Launch the application.

       */

      

 

       /**

       * Create the application.

       */

       public AdminFrame() {

              initialize();

       }

 

       /**

       * Initialize the contents of the frame.

       */

       private void initialize() {

             

              this.setBounds(100, 100, 662, 395);

              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

              this.getContentPane().setLayout(null);

             

              JButton btnLoginAsStudent = new JButton("Add Student");

              btnLoginAsStudent.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {

                            AddStudent student;

                            try {

                                student = new AddStudent();

                                student.setVisible(true);

                            } catch (SQLException ex) {

                                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);

                            }

                           

                    }

              });
              
              JButton btnLogout = new JButton("logout");
              btnLogout.setBounds(484, 322, 89, 23);
              getContentPane().add(btnLogout);
               btnLogout.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  try {
                      MainFrame frame = new MainFrame();
                      setVisible(false);
                      frame.setVisible(true);
                  } catch (SQLException ex) {
                      Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
              }
              });

              btnLoginAsStudent.setBounds(236, 195, 146, 37);

              this.getContentPane().add(btnLoginAsStudent);

             

              JButton btnLoginAsDoctor = new JButton("Add Doctor");

              btnLoginAsDoctor.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {

                            try {

                                AddDoc frame = new AddDoc();

                                frame.setVisible(true);

                            } catch (SQLException ex) {

                                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);

                            }

                    }

              });

              btnLoginAsDoctor.setBounds(236, 122, 146, 37);

              this.getContentPane().add(btnLoginAsDoctor);

             

              JLabel label = new JLabel("");

              label.setIcon(new ImageIcon("C:\\Users\\...\\Downloads\\log10.jpg"));

              label.setBounds(0, 0, 646, 356);

              this.getContentPane().add(label);

       }

 

}

