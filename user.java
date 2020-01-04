package bookingSystem;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class user extends JFrame  {
	
	JFrame frame = new JFrame("使用者介面");

	/**
	 * Launch the application.
	 * @return 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user window = new user();
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
	public user() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("用戶介面");
		frame.setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("PMingLiU", Font.PLAIN, 12));
		frame.setSize(811, 507);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton booking = new JButton("訂房\r\n");
		booking.setFont(new Font("標楷體", Font.PLAIN, 30));
		booking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				booking booking = new booking();
				booking.setVisible(true);
			}
		});
		booking.setBounds(530, 214, 231, 58);
		frame.getContentPane().add(booking);
		
		JButton btnNewButton_1 = new JButton("取消訂房\r\n");
		btnNewButton_1.setFont(new Font("標楷體", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancel cancel = new cancel();
				cancel.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(530, 306, 231, 58);
		frame.getContentPane().add(btnNewButton_1);
		

		JLabel lblNewLabel = new JLabel("高師大飯店");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 72));
		lblNewLabel.setBounds(203, 10, 582, 128);
		frame.getContentPane().add(lblNewLabel);
		
		ImageIcon image = new ImageIcon("school.jpg");
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(0, 169, 520, 289);
		btnNewButton.setIcon(image);
		frame.getContentPane().add(btnNewButton);

	}
}

