package xo;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class winner {
	

	private JFrame frame;
	JLabel lblwael = new JLabel("", SwingConstants.CENTER);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winner window = new winner();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public winner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 812, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(470, 285, 134, 63);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("another round");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 vis() ;
				
			}
		});
		btnNewButton.setBounds(197, 285, 134, 63);
		frame.getContentPane().add(btnNewButton);
		lblwael.setForeground(Color.WHITE);
		
		
		lblwael.setFont(new Font("Tahoma", Font.PLAIN, 52));
		lblwael.setBounds(222, 75, 348, 110);
		frame.getContentPane().add(lblwael);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 796, 419);
		frame.getContentPane().add(label);
		label.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\fire.gif"));
		
	}
	void vis1() {
		frame.setVisible(true);
		
	}
	void vis() {
		frame.setVisible(false);
		
	}
	void txt(String s) {
		lblwael.setText(s);
	}

}
