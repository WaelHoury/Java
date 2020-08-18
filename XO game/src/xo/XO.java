package xo;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class XO  {
	public JMenu application;
	private JFrame frame;
	private JMenuItem n;
	  private JMenuItem e;
	  private JMenuItem r;
	  private JMenuItem ex;
	  int i=0;
	 int turn=1;
	 int l , m , v, o, p, q, u, s , t;
	 int round;
	 int p1;
	 int c1;
	 int p2;
	 int c2;
	 players players= new players();
	 int d1;
	 int d2;
	 int w1;
	 int w2;
	 int g1;
	 int g2;
	 winner winner= new winner();
	 JLabel label_10 = new JLabel("0");
		JLabel label_12 = new JLabel("0");
		JLabel label_1 = new JLabel("");
		JLabel label_2 = new JLabel("");
		JLabel label_3 = new JLabel("");
		JLabel label_4 = new JLabel("");
		JLabel label_5 = new JLabel("");
		JLabel label_6 = new JLabel("");
		JLabel label_7 = new JLabel("");
		JLabel label_8 = new JLabel("");
		JLabel label = new JLabel("");
		int en;
		JLabel lblPlayer = new JLabel("");
		JLabel label_11 = new JLabel("");

		int watch=0;
		StopWatch swatch= new StopWatch();
     boolean cont=true;





	 
	 int[][] matrix = new int[3][3];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XO window = new XO();
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
	public XO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\waelh\\Downloads\\tictactoe.jpg"));
		frame.getContentPane().setBackground(SystemColor.controlHighlight);
		frame.setBounds(100, 100, 788, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					save();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(135, 109, 115, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(313, 45, 400, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 3));
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlShadow);
		panel_1.setBounds(10, 143, 259, 278);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_11.setBounds(10, 54, 73, 32);
		panel_1.add(label_11);
		
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPlayer.setBounds(10, 11, 73, 32);
		panel_1.add(lblPlayer);

		label_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_12.setBounds(79, 54, 73, 32);
		panel_1.add(label_12);
		
		
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_10.setBounds(79, 11, 73, 32);
		panel_1.add(label_10);
		
		JButton btnSubmitPlayers = new JButton("submit players");
		btnSubmitPlayers.setBounds(0, 45, 125, 44);
		frame.getContentPane().add(btnSubmitPlayers);
		btnSubmitPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 		lblPlayer.setText(players.player1+":");
			 		label_11.setText(players.player2+":");
			}
		});
		
		label_1.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				swatch.start();
				
				round++;
				if(turn ==1 && l!=1) {
					
					label_1.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\x.jpg"));
					turn=2;
					l=1;
					matrix[0][0]=1;
				}
				else if(turn ==2 && l!=1){
					label_1.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\o.png"));
					turn=1;
					l=1;
					matrix[0][0]=2;
					
				}
				
				if(round>4) {
						
						
				winning(); 
				}
			}
				
		});
		
		
		panel.add(label_1);
		 Border border = LineBorder.createGrayLineBorder();
		label_1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		
		label_3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		panel.add(label_3);
		label_3.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				round++;
				if(turn ==1 && m!=1) {
					label_3.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\x.jpg"));
					turn=2;
					m=1;
					matrix[0][1]=1;
				}
				else if(turn ==2 && m!=1){
					label_3.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\o.png"));
					turn=1;
					m=1;
					matrix[0][1]=2;
				}
				
				if(round>4) {
					
					winning();
				}
			}
		});
		
		
		
		label_6.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		panel.add(label_6);
		label_6.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				round++;
				if(turn ==1 && v!=1) {
					label_6.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\x.jpg"));
					turn=2;
					v=1;
					matrix[0][2]=1;
				}
				else if(turn ==2 && v!=1){
					label_6.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\o.png"));
					turn=1;
					v=1;
					matrix[0][2]=2;
				}
				
				if(round>4) {
					
					winning();
				}
			}
		});
		
		label.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		panel.add(label);
		label.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				round++;
				if(turn ==1 && o!=1) {
					label.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\x.jpg"));
					turn=2;
					o=1;
					matrix[1][0]=1;
				}
				else if(turn ==2 && o!=1){
					label.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\o.png"));
					turn=1;
					o=1;
					matrix[1][0]=2;
				}
				
				if(round>4) {
					
					winning();
				}
			}
		});
		
		label_4.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		panel.add(label_4);
		label_4.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				round++;
				if(turn ==1 && p!=1) {
					label_4.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\x.jpg"));
					turn=2;
					p=1;
					matrix[1][1]=1;
				}
				else if(turn ==2 && p!=1){
					label_4.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\o.png"));
					turn=1;
					p=1;
					matrix[1][1]=2;
				}
				
				if(round>4) {
					
						winning();
				}
			}
		});
		
		label_5.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		panel.add(label_5);
		label_5.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				round++;
				if(turn ==1 && q!=1) {
					label_5.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\x.jpg"));
					turn=2;
					q=1;
					matrix[1][2]=1;
				}
				else if(turn ==2 && q!=1){
					label_5.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\o.png"));
					turn=1;
					q=1;
					matrix[1][2]=2;
				}
				
				if(round > 4) {
					winning();
				}
			}
		});
		
		label_2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		panel.add(label_2);
		label_2.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				round++;
				if(turn ==1 && u!=1) {
					label_2.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\x.jpg"));
					turn=2;
					u=1;
					matrix[2][0]=1;
				}
				else if(turn ==2 && u!=1){
					label_2.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\o.png"));
					turn=1;
					u=1;
					matrix[2][0]=2;
				}
				
				if(round>4) {
					
						winning();
				}
			}
		});
		label_7.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		panel.add(label_7);
		label_7.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				round++;
				if(turn ==1 && s!=1) {
					label_7.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\x.jpg"));
					turn=2;
					s=1;
					matrix[2][1]=1;
				}
				else if(turn ==2 && s!=1){
					label_7.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\o.png"));
					turn=1;
					s=1;
					matrix[2][1]=2;
				}
				
				if(round>4) {
					
						
					winning();
				}
			}
		});
		label_8.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
		panel.add(label_8);
		label_8.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				round++;
				if(turn ==1 && t!=1) {
					label_8.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\x.jpg"));
					turn=2;
					t=1;
					matrix[2][2]=1;
				}
				else if(turn ==2 && t!=1){
					label_8.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\o.png"));
					turn=1;
					t=1;
					matrix[2][2]=2;
				}
				
				if(round>4) {
				winning();
				}
			}
		});
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 75, 35);
		
		frame.getContentPane().add(menuBar);
		application = new JMenu("application");
		 n = new JMenuItem("Nouvelle Partie");
		 n.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		players.vis1();
		 		
		 	}
		 });
		
		 e = new JMenuItem("Enregistrer la partie");
		 r = new JMenuItem("Reprendre une partie");
		 ex = new JMenuItem("Exit");
		 application.add(n);
		 application.add(e);
		 application.add(r);
		 application.add(ex);
		 
		 menuBar.add(application);
		 cont=true;
		
		JButton btnAnotherRound = new JButton("another round");
		btnAnotherRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refresh();
				
				cont=false;
			}});
		btnAnotherRound.setBounds(10, 109, 115, 23);
		frame.getContentPane().add(btnAnotherRound);
		
		
		
		
		
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\tictactoe.jpg"));
		label_9.setBounds(0, 0, 772, 475);
		frame.getContentPane().add(label_9);
		
		
	
	
	}
	void winning() {
		
		for(int i=0;i<3;i++) {
			p1=0;
			p2=0;
			c1=0;
			c2=0;
			d1=0;
			d2=0;
            w1=0;
            w2=0;
            for(int j=0;j<3;j++) {
			if(matrix[j][2-j]==1) {
				
				w1++;
			}
			
            if(matrix[j][2-j]==2) {
				
				w2++;
			}
            }
			for(int j=0;j<3;j++) {
				
				if(matrix[i][j]==1) {
					
					p1++;
				}
				
                if(matrix[j][i]==1) {
					
					c1++;
				}
                if(matrix[j][j]==1) {
					
					d1++;
				}
              if(matrix[j][j]==2) {
					
					d2++;
				}
                 if(matrix[i][j]==2) {
					
					p2++;
				}
				
                if(matrix[j][i]==2) {
					
					c2++;
				}
               
				
				
			}
			 if(p1==3 || c1==3 || d1==3 || w1==3) {
             	
             	winner.vis1();
             	winner.txt(players.player1);
             	g1++;
             String win1=Integer.toString(g1); ;
             	
            	label_10.setText(win1);
             	
             	break;
             	
             }
			 if(p2==3 || c2==3 || d2==3 || w2==3) {
				 winner.vis1();
	             winner.txt(players.player2);
             	 g2++;
             	  String win2=Integer.toString(g2); ;
               	
              	label_10.setText(win2);
             	
             	break;
             	
             	
             }
			// if(l!=0 && m!=0 && o!=0 && v!=0 && p!=0 && q!=0 && u!=0 && s!=0 && t!=0)
			 //{
			//	 label_10.setText("Draw");
				 
			 //}
			 
			 
		}
		
		
	}
	
	public void refresh() {
		
		label_1.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_2.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_3.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_4.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_5.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_6.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_7.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label_8.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		label.setIcon(new ImageIcon("C:\\Users\\waelh\\Downloads\\1024px-Solid_white.svg.png"));
		turn=1;
		l=0;
		m=0;
		o=0;
		v=0;
		p=0; 
		q=0;
		u=0;
		s=0;
		t=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j]=0;
			}
		}
	}
	public void run() {
		try {
			XO window = new XO();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void save() throws IOException {
		//"C:\\Users\\waelh\\OneDrive\\Desktop\\score.txt"
		swatch.stop();
		    String str=lblPlayer.getText();
			 String a=label_11.getText();
			 String b=label_10.getText();
			 String c=label_12.getText();
		    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\waelh\\OneDrive\\Desktop\\score.txt"));
		    writer.write(str);
		  
		    writer.write(b);
		    writer.write("           ");
		    writer.write(a);
		    
		    writer.write(c);
		    writer.write("           ");
		    writer.write((int) swatch.getElapsedTimeSecs()+"sec");
		    writer.close();
		   
		
	}
}
