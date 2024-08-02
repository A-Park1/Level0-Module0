package _03_print_and_popups._5_awesome_or_not;

import java.awt.Component;
import java.util.Random;

import javax.swing.JOptionPane;
public class AwesomeOrNot {

	private static final Object whole = null;	
	

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
		
		
	
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int count = ran.nextInt(1);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		
		// 3. Print your variable to the console
	
		JOptionPane.showMessageDialog(null, count);
	
		
// 4. Get the user to enter something that they think is awesome
		
		String Question=JOptionPane.showInputDialog("enter something awesome");
		// 5. If your variable is  0
			// -- tell the user whatever they entered is awesome!
	 if(Question.equals("0")) {JOptionPane.showMessageDialog(null, "awesome!");
	 }
	 
		// 6. If your variable is  1
	
			// -- tell the user whatever they entered is ok.
	if(Question.equals("1")) {JOptionPane.showMessageDialog(null, "ok");
		// 7. If your variable is  2
	
			// -- tell the user whatever they entered is boring.
	if(Question.equals("2")) {JOptionPane.showMessageDialog(null, "Boring");
		// 8. If your variable is  3
	
			// -- invent your own message to give to the user (be nice).
	if(Question.equals("3")) {JOptionPane.showMessageDialog(null, "Amazing");
	
	
	if(Question.equals("4")) {JOptionPane.showMessageDialog(null, "Great");
	}
	}
}
}
}
}