/*
Stylianos Kalamaras
CS212 11/11F
Project 1
Date Submitted: 09/30/16
Date Due: 10/07/16
*/

import java.awt.GridLayout;
import javax.swing.*;

public class DateGUI {
	int[] unsorted=new int[100];
	int[] sorted= new int[100];
   
	public DateGUI(int[] array, int[] array2,int position) {
        	//Create and set up the window.
        	unsorted=array;
		sorted=array2;
		JFrame frame = new JFrame("Project 1");
        	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes program when x clicked
        	frame.setSize( 400,400);//width, height); 
        	frame.setLocation(200,200);//x, y);
        	frame.setLayout(new GridLayout(1,2));//sets grid layout to 1row 2col

        	JTextArea textArea = new JTextArea(10, 40);//creates text area1
		JTextArea textArea2 = new JTextArea(10, 40);//creates text area2
        	textArea.setEditable(false);//disables text editing of text area
		textArea2.setEditable(true);//disables text editing of text area
        	JScrollPane scrollPane = new JScrollPane(textArea);//creates scrollpane       	
		JScrollPane scrollPane2 = new JScrollPane(textArea2);		
		frame.getContentPane().add(scrollPane);//adds scrollpane col 1		
		frame.getContentPane().add(scrollPane2);//adds scrollpane col 2
		//frame.getContentPane().add(textArea);  **text area without scroll bar      	
		//frame.getContentPane().add(textArea2); **text area without scroll bar

        	//Display the window.
        	frame.pack();
        	frame.setVisible(true);

        	addDisplayDates(frame, textArea,textArea2, unsorted,sorted,position);
    	}//main

//adds un/sorted arrays to GUI text area
public void addDisplayDates(JFrame myFrame, JTextArea myText,JTextArea myText2, int[] unsorted, int[] sorted,int position) {

	for (int i=0;i<position;i++){
		myText.append(unsorted[i] + "\n");
		myText2.append(sorted[i] + "\n");
	}//for
	
	   
}//readAndDisplayMatrix

}//class


