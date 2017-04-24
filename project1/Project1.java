/*
Stylianos Kalamaras
CS212 11/11F
Project 1
Date Submitted: 09/30/16
Date Due: 10/07/16
*/

import java.util.*;

public class Project1 {

	public static void main(String[] args) {
		int position;//holds fill size of array		
		String[] dateArray= new String[100];
		int[] parsedArray=new int[100];
		int[] parsedSorted=new int[100];
		position=readAndFill(dateArray, args[0]);//sets length of array equal to index 
		parseArray(dateArray,parsedArray,position); //parses string to int array
		copyArray(parsedArray,parsedSorted,position); //takes values from one array and stores in another
		sortArray(parsedSorted,position);//sorts the array from least to greates			
		DateGUI myGui= new DateGUI(parsedArray,parsedSorted,position);//create GUI with un/sorted arrays
			
	}//main


//reads in from a file using TextFileInput, and stores only valid entries into a string array
static int readAndFill(String[] array, String textFile) {
	TextFileInput tfi = new TextFileInput(textFile);
	StringTokenizer tokens;
	String line, date;
	int position=0;	
	while(true) {		
			line = tfi.readLine();
			if (line==null) break;		
			tokens = new StringTokenizer(line,",");	
			
				while(tokens.hasMoreTokens()) {
				date = tokens.nextToken();
				if(stringIsBad(date)) {System.out.println(date);continue;} 
				array[position++]=date;
				}//inner while			
	}//outer while  
	tfi.close();//closes file
	return position; //returns filled size of array 
}//read

//tests if the string is bad, will return true if the string is bad
static boolean stringIsBad(String date) {
	if(date.length()!=8) return true;
	for(int i=0;i<date.length();i++)
		if (!Character.isDigit(date.charAt(i))) return true;
	return false;
}//stringIsBad

//copies one integer array into another integer array
static void copyArray (int[] parsedArray, int[] parsedSorted, int position) {
	for(int i=0;i<position;i++)
			parsedSorted[i]=parsedArray[i];
}//copyArray

//parses a string array to integers and stores the values into an integer array
static void parseArray (String[] array, int[] array2, int position) {
	for (int i=0;i<position;i++) 
		array2[i]=Integer.parseInt(array[i]);
}//parse

//selection sorts an integer array from least to greatest
static void sortArray(int[] array,int position) {
	int min;
	for (int i=0;i<position;i++){
		min=array[i];
		for(int j=i;j<position;j++) {
			if (min>array[j]) {
				min=array[j];
				array[j]=array[i];
				array[i]=min;
			}//if		
		}//for		
	}//for
}//sort


}//class				
		





