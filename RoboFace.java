import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
public class RoboFace extends GraphicsProgram {
	private static final int HEAD_WIDTH = 300;
	private static final int HEAD_HEIGHT = 400;
	private static final int EYE_RADIUS = 47;
	private static final int MOUTH_WIDTH = 156;
	private static final int MOUTH_HEIGHT = 55;
	
public void run() {
	GRect face = new GRect(200,20,HEAD_WIDTH,HEAD_HEIGHT);
	face.setFillColor(Color.GRAY);
	face.setFilled(true);
	add(face);
	GOval look = new GOval(268,98, EYE_RADIUS,EYE_RADIUS);
	look.setFillColor(Color.YELLOW);
	look.setFilled(true);
	add(look);
	GOval watch = new GOval(388,98, EYE_RADIUS,EYE_RADIUS);
	watch.setFillColor(Color.YELLOW);
	watch.setFilled(true);
	add(watch);
	GRect talk = new GRect(278,297,MOUTH_WIDTH,MOUTH_HEIGHT);
		talk.setFillColor(Color.WHITE);
		talk.setFilled(true);
		add(talk);
	}

}


