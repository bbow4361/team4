package JFrame_Tests;

import java.awt.BorderLayout;
import java.awt.Component;

import JFrame_Tests.Graphics1;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;
	static Component g = new Graphics1();
	static ShipReader ship = new ShipReader();
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setTitle("Battleship!");
					//frame.add(inframe);
					frame.add(g);
					frame.add(ship);
					frame.setVisible(true);
					frame.setBounds(50, 50, (int) (50*11.6), 50*12);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	
}
