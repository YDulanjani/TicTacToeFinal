import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PlayerInfo extends JFrame {

	private JPanel contentPane;
	private JTextField txtPlayer1;
	private JTextField txtPlayer2;
	
	
	private int state;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerInfo frame = new PlayerInfo(1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PlayerInfo(int state) {
		this.state=state;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				startGame();
			}

		});
		btnStart.setBounds(449, 201, 109, 36);
		contentPane.add(btnStart);
		
		txtPlayer2 = new JTextField();
		txtPlayer2.setFont(new Font("Tekton Pro", Font.PLAIN, 30));
		txtPlayer2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(txtPlayer1.getText().equals(txtPlayer2.getText()) && txtPlayer2.getText().length() != 0){
					JOptionPane.showMessageDialog(null,"Please enter another name !");
					txtPlayer2.requestFocus();
				}
				
			}
		});
		txtPlayer2.setColumns(10);
		txtPlayer2.setBounds(165, 188, 215, 49);
		contentPane.add(txtPlayer2);
		
		JLabel lblPlayer2 = new JLabel("Player 2");
		lblPlayer2.setFont(new Font("Tekton Pro", Font.PLAIN, 30));
		lblPlayer2.setBounds(115, 145, 149, 36);
		contentPane.add(lblPlayer2);
		
		txtPlayer1 = new JTextField();
		txtPlayer1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(txtPlayer1.getText().equals(txtPlayer2.getText()) && txtPlayer1.getText().length() != 0 ){
					JOptionPane.showMessageDialog(null,"Please enter another name !");
					txtPlayer1.requestFocus();
				}
				
			}
		});
		txtPlayer1.setFont(new Font("Tekton Pro", Font.PLAIN, 30));
		txtPlayer1.setBounds(165, 67, 215, 49);
		contentPane.add(txtPlayer1);
		txtPlayer1.setColumns(10);
		
		JLabel lblPlayer1 = new JLabel("Player 1");
		lblPlayer1.setFont(new Font("Tekton Pro", Font.PLAIN, 30));
		lblPlayer1.setBounds(115, 24, 149, 36);
		contentPane.add(lblPlayer1);
		
		JLabel lblPlayerInfo = new JLabel("");
		lblPlayerInfo.setIcon(new ImageIcon(PlayerInfo.class.getResource("/Images/playerInfo.jpg")));
		lblPlayerInfo.setBounds(0, 0, 584, 267);
		contentPane.add(lblPlayerInfo);
		
		if(state==1){
			txtPlayer2.setVisible(false);
			lblPlayer2.setVisible(false);
			
		}
		
		
		
	}
	
	private void startGame() {
		
		
	}
}
