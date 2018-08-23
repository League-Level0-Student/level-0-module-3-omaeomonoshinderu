//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot yoda = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		String answer = null;
		while (true)
			doesNothingUseful(yoda);
	}

	private static void doesNothingUseful(Robot yoda) {
		String answer;
		answer = JOptionPane.showInputDialog("What color would you like your shape to be?");
		// 5. Use an if/else statement to set the pen color that the user requested

		if ("red".equals(answer)) {
			yoda.setPenColor(Color.RED);
		} else {
			JOptionPane.showMessageDialog(null, "How about we just imagine it's " + answer);

			// 6. If the user doesn’t enter anything, choose a random color
			Random color = new Random();
			int red = color.nextInt(256);
			int green = color.nextInt(256);
			int blue = color.nextInt(256);
			yoda.setPenColor(red, green, blue);
		}
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10
		yoda.penDown();
		// 2. Make the robot draw a shape (this will take more than one line of code)

		yoda.setSpeed(100);

		for (int i = 0; i < 4; i++) {

			yoda.move(200);

			yoda.turn(90);
		}
	}

}
