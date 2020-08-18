/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * 
 */
public class MainFrame extends JFrame {
    
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	

	/**
	 * Create the frame.
	 */
	public MainFrame() throws SQLException {
                ModelSql model = new ModelSql(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
                    
			public void actionPerformed(ActionEvent e) {
                            System.out.println(passwordField.getText());
                            User user= new User(textField.getText(),passwordField.getText());
                            try {
                                model.getRole(user);
                            } catch (SQLException ex) {
                                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
		});
		btnLogin.setBounds(243, 232, 89, 23);
		contentPane.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(191, 167, 192, 29);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(191, 112, 192, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("pass:");
		lblPass.setForeground(Color.WHITE);
		lblPass.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPass.setBounds(103, 160, 157, 46);
		contentPane.add(lblPass);
		
		JLabel lblUsername = new JLabel("username:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsername.setBounds(53, 103, 157, 46);
		contentPane.add(lblUsername);
		
		JLabel lblAdminLogin = new JLabel("Login");
		lblAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdminLogin.setForeground(Color.WHITE);
		lblAdminLogin.setBounds(255, 11, 157, 46);
		contentPane.add(lblAdminLogin);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\..\\Downloads\\log20.jpg"));
		label.setBounds(0, 0, 630, 327);
		contentPane.add(label);
	}
}
