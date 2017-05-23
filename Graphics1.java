package JFrame_Tests;

import java.awt.*;

import javax.swing.JComponent;

public class Graphics1 extends JComponent{
	public void paintComponent(Graphics g) {
		
		
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle gridOutline = new Rectangle(0,0,550,550);
		int[] xbox = new int[11];
		int[] ybox = new int[11];
		g.setColor(Color.white);
		g2.fill(gridOutline);
		g.setColor(Color.black);
		for(int i = 0; i <= 10; i++){
			for(int j = 0; j <= 10; j++){
				g.drawRect(i*50, j*50, 50, 50);
				if(i == 0 && j == 0){
					g.setColor(Color.gray);
					xbox[i] = i*50;
					ybox[j] = j*50;
					g.fillRect(i*50, j*50, 50, 50);
					g.setColor(Color.black);
					if(i == 0){
						g.
					}
				}
			}
		}
		g.setColor(Color.BLACK);
		g2.draw(gridOutline);
	}
}
