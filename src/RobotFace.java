import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.Color;
public class RobotFace extends GraphicsProgram {
	
	/*	This program creates the face of a robot using an external JAR's libraries, acm.jar.
		You can download it and find documentation here: https://cs.stanford.edu/people/eroberts/jtf/
	*/
	private static final double HEAD_WIDTH = 300;
	private static final double HEAD_HEIGHT = 360;
	private static final double EYE_RADIUS = 32;
	private static final double MOUTH_WIDTH = 200;
	private static final double MOUTH_HEIGHT = 50;
	public void run() {
		
		/*	In the run() method, all of the pieces for the face are put inside a container of sorts called
			GCompound, which I named robotHead. It's optional, but it helps unify the shapes of the face.
		 */
		GCompound robotHead = new GCompound();
		robotHead.add(addHead());
		robotHead.add(addLeftEye());
		robotHead.add(addRightEye());
		robotHead.add(addMouth());
		add(robotHead);
	}
	private GRect addHead() {
		
		/*	I get their proper sizes using the instance variables defined on lines 9-13. Since each shape's
			origin is their top-left edge, their starting position is the width and height divided by two.
		 */	
		GRect rectangle = new GRect(-HEAD_WIDTH / 2, -HEAD_HEIGHT / 2, HEAD_WIDTH, HEAD_HEIGHT);
		rectangle.setColor(Color.BLACK);
		rectangle.setFilled(true);
		rectangle.setFillColor(Color.GRAY);
		
		/*	Before I return the shape, I need to get it into the proper position (the center of the window). With
			all of the shapes, I get the width and height of the window and divide both by 2. Not all features
			will be in the middle, like the eyes, so I do some additional multiplication in the other methods.
		 */	
		rectangle.move(getWidth() / 2, getHeight() / 2);
		return rectangle;
	}
	private GOval addLeftEye() {
		
		GOval leftEye = new GOval(-EYE_RADIUS, -EYE_RADIUS, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		leftEye.setColor(Color.YELLOW);
		leftEye.setFilled(true);
		leftEye.setFillColor(Color.YELLOW);
		leftEye.move(getWidth() / 2 * 0.8, getHeight() / 2 * 0.6);
		return leftEye;
	}
	private GOval addRightEye() {
		
		GOval rightEye = new GOval(-EYE_RADIUS, -EYE_RADIUS, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		rightEye.setColor(Color.YELLOW);
		rightEye.setFilled(true);
		rightEye.setFillColor(Color.YELLOW);
		rightEye.move(getWidth() / 2 * 1.2, getHeight() / 2 * 0.6);
		return rightEye;
	}
	private GRect addMouth() {
		
		GRect mouth = new GRect(-MOUTH_WIDTH / 2, -MOUTH_HEIGHT / 2, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setColor(Color.WHITE);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		mouth.move(getWidth() / 2, getHeight() / 2 * 1.5);
		return mouth;	
	}
}