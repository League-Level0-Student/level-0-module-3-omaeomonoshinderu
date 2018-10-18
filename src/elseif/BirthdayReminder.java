
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
		// 1. correct the birthdays for your family below
		String momsBirthday = "who knows";
		String dadsBirthday = "*shrugs*";
		String myBirthday = "You mean when i was born?";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer = JOptionPane.showInputDialog("whos birthday do you wanna know?");
		// 3. Print out what the user typed
	String realAnswer = JOptionPane.showInputDialog("So you're asking for " + answer + "'s birthday?");
		// 4. if user asked for "mom"
			//print mom's birthday
	if (realAnswer.equals("mom's")) {
		JOptionPane.showMessageDialog(null, momsBirthday);
	}
		// 5. if user asked for "dad"
			// print dad's birthday
	else if (realAnswer.equals("dad's")) {
		JOptionPane.showMessageDialog(null, dadsBirthday);
	}
		// 6. if user asked for your name
			// print myBirthday
	else if(realAnswer.equals("your's")) {
		JOptionPane.showMessageDialog(null, myBirthday);
	}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	else {
		JOptionPane.showMessageDialog(null, "Who's that?");
	}
	} 
}
