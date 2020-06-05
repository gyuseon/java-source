package rhythm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;

public class beat extends JFrame{
	private JTextField textField;
	private JPasswordField passwordField;

	public beat() {
		setTitle("Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 게임 창 크기
		setResizable(false); // 창 사이즈 변경 불가
		setLocationRelativeTo(null); // 컴퓨터 정 중앙에 화면이 뜰수있게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임 종료시 프로그램 전체 종료 
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("양재소슬체S", Font.PLAIN, 15));
		lblNewLabel.setBounds(525, 444, 57, 15);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(594, 441, 116, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PW");
		lblNewLabel_1.setFont(new Font("양재소슬체S", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(525, 501, 57, 15);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(594, 498, 116, 21);
		panel.add(passwordField);
		setVisible(true); //게임이 정상적으로 출력
	}
}