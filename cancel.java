package bookingSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class cancel extends JFrame {
	
	File newtext = new File("newimformation.txt");
	File text = new File("imformation.txt");
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JLabel label_2;
	private JPasswordField passwordField;
	private JLabel label_3;
	private JLabel lblWjozxxxxxxxx;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label_5;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cancel frame = new cancel();
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
	public cancel() {
		setTitle("取消訂房");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 693, 472);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//姓名
		textField = new JTextField();
		textField.setBounds(175, 168, 223, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		//電話
		textField_1 = new JTextField();
		textField_1.setBounds(175, 207, 223, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("姓名");
		label.setForeground(Color.RED);
		label.setFont(new Font("標楷體", Font.PLAIN, 25));
		label.setBounds(28, 155, 71, 39);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("電話");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("標楷體", Font.PLAIN, 25));
		label_1.setBounds(28, 191, 71, 45);
		contentPane.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("標楷體", Font.PLAIN, 12));
		comboBox.addItem("單人房(不吸菸)1000         ");
		comboBox.addItem("雙人房(不吸菸)1500         ");
		comboBox.addItem("單人房(可吸菸)1200         ");
		comboBox.addItem("雙人房(可吸菸)1700         ");
		comboBox.setBounds(178, 331, 220, 21);
		contentPane.add(comboBox);
		
		button = new JButton("確定");
		button.setBounds(271, 375, 87, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					FileReader imfor = new FileReader("imformation.txt");
					FileWriter input = new FileWriter("newimformation.txt",true);
					BufferedReader br = new BufferedReader(imfor);
					while( br.ready()) {
						String cancel = br.readLine();
						if( cancel.equals("姓名 "+textField.getText()) != true && cancel.equals("訂房日期 "+textField_2.getText()) != true &&  cancel.equals("退房日期 "+textField_3.getText()) != true && cancel.equals("房型 "+comboBox.getSelectedItem()) != true
								&& cancel.equals("電話 "+textField_1.getText()) != true && cancel.equals("地址 "+textField_4.getText()) != true && cancel.equals("信用卡 "+passwordField.getText()) != true) {
							input.write("\n"+cancel);
						}
					}
					imfor.close();
					input.close();
					text.delete();

					
				}catch( IOException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"取消成功");
				
			}
		});
		contentPane.add(button);
		
		lblNewLabel = new JLabel("請輸入您的訂房資料");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 10, 456, 68);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\test\\while2.jpg"));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(422, 176, 245, 222);
		contentPane.add(btnNewButton);
		
		label_2 = new JLabel("信用卡帳號");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("標楷體", Font.PLAIN, 25));
		label_2.setBounds(28, 242, 143, 30);
		contentPane.add(label_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(175, 251, 223, 21);
		contentPane.add(passwordField);
		
		label_3 = new JLabel("入住日期(xxxx/xx/xx)");
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("標楷體", Font.PLAIN, 25));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(28, 46, 300, 97);
		contentPane.add(label_3);
		
		lblWjozxxxxxxxx = new JLabel("退房日期(xxxx/xx/xx)");
		lblWjozxxxxxxxx.setForeground(Color.BLUE);
		lblWjozxxxxxxxx.setFont(new Font("標楷體", Font.PLAIN, 25));
		lblWjozxxxxxxxx.setBackground(Color.WHITE);
		lblWjozxxxxxxxx.setBounds(28, 100, 300, 78);
		contentPane.add(lblWjozxxxxxxxx);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(299, 88, 230, 21);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(299, 135, 230, 21);
		contentPane.add(textField_3);
		
		label_5 = new JLabel("地址");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("標楷體", Font.PLAIN, 25));
		label_5.setBounds(28, 282, 89, 30);
		contentPane.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(104, 291, 294, 21);
		contentPane.add(textField_4);
		
		JLabel label_6 = new JLabel("房型");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("標楷體", Font.PLAIN, 25));
		label_6.setBounds(28, 322, 89, 30);
		contentPane.add(label_6);
		
		
	}
}
