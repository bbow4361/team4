package JFrame_Tests;

import java.awt.EventQueue;

public class JInternalFrame extends javax.swing.JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrame frame = new JInternalFrame();
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
	public JInternalFrame() {
		setBounds(100, 100, 450, 300);

	}

}
