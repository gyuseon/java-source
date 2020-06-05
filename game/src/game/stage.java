package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import java.awt.FlowLayout;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;

public class stage extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private DefaultTableModel model;
	private JButton btn;
	private JTable table;
	
	private GameDAO dao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stage frame = new stage();
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
	public stage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		dao = new GameDAO();
		
		JLabel lblNewLabel = new JLabel("명예의 전당");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(5);
		
		JLabel lblNewLabel_2 = new JLabel("점수");
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(5);
		
		btn = new JButton("제출");
		panel_1.add(btn);
		
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(getModel());
		list();
		scrollPane.setViewportView(table);
		
		
	
	}
	
	public DefaultTableModel getModel() {
		String columnNames[]= {"이름","점수"};
		model = new DefaultTableModel(columnNames,0) {
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
		};
	return model;
	}
	
	public void list() {
		Vector<GameVO> scoreList=dao.getList();
		
		
		for(GameVO vo:scoreList) {
			Object[] objList= {vo.getName(),vo.getScore()};
			model.addRow(objList);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			textField.getText();
			textField_1.getText();
			
			
		}
		
		
	
		
	}
}
