package JFrame_Tests;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Graphics1 extends JComponent{
	public static void paintComponent(Graphics2D g) {
		
		
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle grid1 = new Rectangle(0,0,100,100);
		for(int i = 0; i > 10; i++){
			for(int j = 0; j > 10; j++){
				grid1.setLocation(i * 50, j * 50);
				g.setColor(Color.orange);
				g2.fill(grid1);
				g.setColor(Color.BLACK);
				g.draw(grid1);
			}
		}
	}
}
