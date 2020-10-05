import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Hogwarts extends GraphicsProgram {
	RandomGenerator randg = RandomGenerator.getInstance();
	public void run() {
	
		for(int i= 0;i<10;i++) {
			circi();
		}
		
		//System.out.println(randg.nextInt(3,7));
	}
	public void circi() {
		double rad = randg.nextDouble(5,50);
		double x = randg.nextDouble(0,getWidth()-rad);
		double y = randg.nextDouble(0,getHeight()-rad);
		
		Color colork = randg.nextColor();
		GOval half = new GOval(x,y,rad,rad);
		half.setColor(colork);
		half.setFilled(true);
		add(half);
		
	}
}
