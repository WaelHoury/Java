package xo;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class players  {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	public static String player1;
	public static String player2;
	
	boolean a=false;
	boolean b=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					players window = new players();
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
	public players() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 706, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBounds(342, 183, 72, 23);
		frame.getContentPane().add(btnSelect);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player1=textField.getText();
				
				player2=textField_1.getText();
				
				vis();
				
				
				
			}
		});
		
		
		btnStart.setBounds(257, 183, 72, 23);
		frame.getContentPane().add(btnStart);
		
		textField_1 = new JTextField();
		
		textField_1.setBounds(508, 50, 172, 33);
		frame.getContentPane().add(textField_1);
		
		JLabel lblPlayer_1 = new JLabel("Player2:");
		lblPlayer_1.setForeground(Color.WHITE);
		lblPlayer_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblPlayer_1.setBackground(Color.BLACK);
		lblPlayer_1.setBounds(508, 11, 116, 40);
		frame.getContentPane().add(lblPlayer_1);
		
		textField = new JTextField();
		
		textField.setBounds(10, 50, 172, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPlayer = new JLabel("Player1:");
		lblPlayer.setIcon(null);
		lblPlayer.setForeground(UIManager.getColor("text"));
		lblPlayer.setBackground(UIManager.getColor("menuPressedItemB"));
		lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblPlayer.setBounds(10, 11, 116, 40);
		frame.getContentPane().add(lblPlayer);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\players.png"));
		label.setBounds(-163, -22, 853, 472);
		frame.getContentPane().add(label);
	}
	void vis() {
		frame.setVisible(false);
		a=true;
	}
	void vis1() {
		frame.setVisible(true);
		b=true;
	}
	
	void text(String s,String b) {
		b=s;
	}
}
