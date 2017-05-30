package JFrame_Tests;

import java.awt.*;

import javax.swing.JComponent;

public class Graphics1 extends JComponent{
	
	private static Graphics g;
	
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
				if(i == 0){
					g.setColor(Color.LIGHT_GRAY);
					g.fillRect(i*50, j*50, 50, 50);
					g.setColor(Color.black);
				}
				if(j == 0){
					g.setColor(Color.LIGHT_GRAY);
					g.fillRect(i*50, j*50, 50, 50);
					g.setColor(Color.black);
				}
				if(i == 0 && j == 0){
					g.setColor(Color.gray);
					xbox[i] = i*50;
					ybox[j] = j*50;
					g.fillRect(i*50, j*50, 50, 50);
					g.setColor(Color.black);
				}
				g.drawRect(i*50, j*50, 50, 50);
			}
		}
		g.setColor(Color.BLACK);
		g2.draw(gridOutline);
	}
	
	public static void update(int xCoordinate, int yCoordinate, boolean hit){
		Graphics2D g2 = (Graphics2D) g;
		if(hit == true){
			g.setColor(Color.RED);
		} else {
			g.setColor(Color.BLUE);
		}
		g.fillRect(xCoordinate * 50, yCoordinate * 50, 50, 50);
		g.drawRect(xCoordinate * 50, yCoordinate * 50, 50, 50);
	}
}
