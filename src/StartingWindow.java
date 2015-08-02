import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import org.apache.log4j.Logger;


public class StartingWindow extends JFrame {

	private JPanel contentPane;
	public static Logger logger = Logger.getLogger(StartingWindow.class);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartingWindow frame = new StartingWindow();
					frame.setVisible(true);
					logger.debug("Game starting window opened");
				} catch (Exception e) {
					e.printStackTrace();
					logger.debug(e+"has occured while trying to open the stating window");
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartingWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPlayer_1 = new JButton("1 player");
		btnPlayer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new PlayerInfo(1).setVisible(true);;
				
			}
		});
		btnPlayer_1.setBounds(60, 199, 183, 43);
		contentPane.add(btnPlayer_1);
		
		JButton btnPlayer2 = new JButton("2 player");
		btnPlayer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PlayerInfo(2).setVisible(true);
			}
		});
		btnPlayer2.setBounds(59, 279, 183, 43);
		contentPane.add(btnPlayer2);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(59, 360, 183, 43);
		contentPane.add(btnExit);
		
		JLabel gameNameLabel = new JLabel("Tic Tak Toe");
		gameNameLabel.setFont(new Font("Chiller", Font.BOLD, 82));
		gameNameLabel.setForeground(new Color(0, 0, 128));
		gameNameLabel.setBounds(32, 11, 366, 77);
		contentPane.add(gameNameLabel);
		
		JLabel startingWindowLabel = new JLabel("");
		startingWindowLabel.setIcon(new ImageIcon(StartingWindow.class.getResource("/img/StartWindow.jpg")));
		startingWindowLabel.setBounds(0, 0, 684, 461);
		contentPane.add(startingWindowLabel);
		
		
		
	}
}
