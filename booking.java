package bookingSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ComboBoxEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;

public class booking extends JFrame {

	File text = new File("imformation.txt");
	public int smokeSingle ;
	public int noSmokeSingle ;
	public int smokeDouble ;
	public int noSmokeDouble ;
	private int click=0;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public static JTextField textField;
	private JTextField textField_4;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	
	public booking() {
		noSmokeSingle = 7;
		setTitle("訂房");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 763, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("入住日期(xxxx/xx/xx)");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(53, 63, 300, 118);
		contentPane.add(lblNewLabel);
		
		JLabel label_4 = new JLabel("客戶姓名");
		label_4.setFont(new Font("標楷體", Font.PLAIN, 25));
		label_4.setForeground(Color.RED);
		label_4.setBounds(53, 188, 143, 48);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("電話");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("標楷體", Font.PLAIN, 25));
		label_5.setBounds(53, 237, 89, 30);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("地址");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("標楷體", Font.PLAIN, 25));
		label_6.setBounds(53, 317, 89, 30);
		contentPane.add(label_6);
		//姓名
		
		textField = new JTextField();
		textField.setBounds(183, 206, 137, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//電話
		textField_1 = new JTextField();
		textField_1.setBounds(183, 246, 137, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		//地址
		textField_2 = new JTextField();
		textField_2.setBounds(183, 326, 294, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_7 = new JLabel("房型");
		label_7.setFont(new Font("標楷體", Font.PLAIN, 25));
		label_7.setForeground(Color.RED);
		label_7.setBounds(53, 277, 89, 30);
		contentPane.add(label_7);
		
		//房型
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("標楷體", Font.PLAIN, 12));
		comboBox.setBounds(183, 286, 220, 21);
		comboBox.addItem("單人房(不吸菸)1000         ");
		comboBox.addItem("雙人房(不吸菸)1500         ");
		comboBox.addItem("單人房(可吸菸)1200         ");
		comboBox.addItem("雙人房(可吸菸)1700         ");
		contentPane.add(comboBox);
		
		//入住
		textField_3 = new JTextField();
		textField_3.setBounds(339, 116, 230, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("送出");
		btnNewButton.setBounds(306, 396, 87, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					click++;
					File spend = new File("bill"+click+".txt");
				
					FileWriter input = new FileWriter("imformation.txt",true);
					FileWriter input1 = new FileWriter("bill"+click+".txt");
					input.write("\n訂房日期 "+textField_3.getText());
					input.write("\n退房日期 "+textField_4.getText());				
					input.write("\n姓名 "+textField.getText());
					input.write("\n電話 "+textField_1.getText());
					input.write("\n地址 "+textField_2.getText());	
					input.write("\n房型 "+comboBox.getSelectedItem());
					StringBuilder stringBuilder = new StringBuilder();
					stringBuilder.append("\n信用卡 ");
					stringBuilder.append(passwordField.getText());
					input.write(stringBuilder.toString());
					input.write("\n*************************************");
					input.write("\n");
					
					input1.write("***請於一個禮拜內繳費***");
					input1.write("\n訂房日期 "+textField_3.getText());
					input1.write("\n退房日期 "+textField_4.getText());				
					input1.write("\n姓名 "+textField.getText());
					input1.write("\n電話 "+textField_1.getText());
					input1.write("\n地址 "+textField_2.getText());	
					if( comboBox.getSelectedItem().equals("單人房(不吸菸)1000         ")) {
						input1.write("\n付款 1000元");
						noSmokeSingle-=1;
					}
					else if( comboBox.getSelectedItem().equals("雙人房(不吸菸)1500         ")) {
						input1.write("\n付款 1500元");
						noSmokeDouble-=1;
					}
					else if( comboBox.getSelectedItem().equals("單人房(可吸菸)1200         ")) {
						input1.write("\n付款 1200元");
						smokeSingle-=1;
					}
					else if( comboBox.getSelectedItem().equals("雙人房(可吸菸)1700         ")) {
						input1.write("\n付款 1700元");
						smokeDouble-=1;
					}
					StringBuilder stringBuilder1 = new StringBuilder();
					stringBuilder1.append("\n信用卡 ");
					stringBuilder1.append(passwordField.getText());
					input1.write(stringBuilder.toString());
					input1.write("\n");
					input.close();
					input1.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
				JOptionPane.showMessageDialog(null,"訂房成功");
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblxxxxxxxx = new JLabel("退房日期(xxxx/xx/xx)");
		lblxxxxxxxx.setForeground(Color.BLUE);
		lblxxxxxxxx.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblxxxxxxxx.setBackground(Color.WHITE);
		lblxxxxxxxx.setBounds(53, 105, 300, 118);
		contentPane.add(lblxxxxxxxx);
		
		//退房日
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(339, 160, 230, 21);
		contentPane.add(textField_4);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.WHITE);
		ImageIcon picture = new ImageIcon("white.jpg");
		btnNewButton_1.setBounds(488, 206, 249, 245);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\test\\white.jpg"));
		btnNewButton_1.setBorderPainted(false);
		contentPane.add(btnNewButton_1);
		
		//信用卡
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 365, 294, 21);
		contentPane.add(passwordField);
		
		JLabel label = new JLabel("信用卡帳號");
		label.setForeground(Color.RED);
		label.setFont(new Font("標楷體", Font.PLAIN, 25));
		label.setBounds(53, 357, 143, 30);
		contentPane.add(label);
	}

	public static void main(String[] args)throws IOException{ {
		EventQueue.invokeLater(new Runnable() {		
			public void run() {
				try {
					booking frame = new booking();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});    
	}
	}
}
