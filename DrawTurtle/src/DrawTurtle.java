import java.awt.*;
import java.awt.event.*;
public class DrawTurtle {
	private int x,y;
	public static void main(String[] args)
	{
		new DrawTurtle();
	}
	
	public DrawTurtle()
	{
		x = 100;
		y = 10;
		Frame frame = new Frame("DrawTurtle");
		DrawLittleTurtle turtle = new DrawLittleTurtle();
		frame.add(turtle);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevnet)
			{
				System.exit(0);
			}
		});
		turtle.requestFocus();
		turtle.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==KeyEvent.VK_UP)
				{
					y -= 10;
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT)
				{
					x -=10;
				}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT)
				{
					x += 10;
				}
				if(e.getKeyCode()==KeyEvent.VK_DOWN)
				{
					y += 10;
				}
				turtle.repaint();
			}
		});
	}
	class DrawLittleTurtle extends Canvas
	{
		public void paint(Graphics g)
		{
			g.setColor(Color.YELLOW);
			g.fillOval(x+0, y+40, 30, 30);
			g.fillOval(x+90, y+40, 30, 30);
			g.fillOval(x+0, y+110, 30, 30);
			g.fillOval(x+90, y+110, 30, 30);
			g.fillOval(x+50, y+130, 25, 50);
			g.fillOval(x+40, y+0, 40, 70);
			g.setColor(Color.BLACK);
			g.fillOval(x+50, y+15, 5, 5);
			g.fillOval(x+65, y+15, 5, 5);
			g.setColor(Color.GREEN);
			g.fillOval(x+10, y+30, 100, 120);
			g.setColor(Color.BLACK);
			g.drawLine(x+24, y+50, x+40, y+67);
			g.drawLine(x+97, y+50, x+80, y+67);
			g.drawLine(x+24, y+130, x+40, y+113);
			g.drawLine(x+97, y+130, x+80, y+113);
			g.drawLine(x+40, y+67, x+80, y+67);
			g.drawLine(x+40, y+113, x+80, y+113);
			g.drawLine(x+10, y+90, x+110, y+90);
			g.drawLine(x+60, y+30, x+60, y+150);	
		}
	}
}

