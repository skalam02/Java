/*
Stylianos Kalamaras
CS212 11/11F
Project 0
09/15/2016

This program asks for user input and analyzes the string for 'e' and 'E' and prints out a count for each. This program will continually ask for input until the keyword "Stop" (not case sensitive) is entered, which will terminate the program.

*/
import javax.swing.JOptionPane;
public class Project0 {

	public static void main(String[] args) {
	String input =JOptionPane.showInputDialog("Please enter a sentence");//input dialog box
	while(!input.equalsIgnoreCase("stop")) {//stop condition
		int counte=0,countE=0;// e/E counter
		for (int i=0;i<input.length();i++)//loops through string for target char
			if (input.charAt(i)== 'e') counte++;
			else if (input.charAt(i)=='E') countE++;
		JOptionPane.showMessageDialog(null, "Upper case E: " + countE +" Lower case e: "+counte);// output dialog box with counters
		input= JOptionPane.showInputDialog("Please enter a senctence"); //takes input for next iteration
	}//while
	
	}//main
}//class




