//Suhani Gupta 
import java.util.Scanner; //importing Scanner class to be able to have the computer read the user input

public class UpperBattleship { //upper board of battleship
	public static void main (String[] args) {
		
		int[][] board = new int [10][10]; //dimensions of board... 10 x 10
		
		Scanner positionStrike = new Scanner(System.in); //creating instance of scanner class called 'positionStrike'. this will call on the constructor.
		
		boolean playAgain = true; //introducing a boolean. Whether or not the player would like to play again. Automatically true.
		
		while (playAgain == true) { //while the player chooses to continue to play the game 
		
		System.out.println (" \nThis is your upper board.");
		System.out.println ("This will be monitoring the guesses you make on your opponents board. ");
		System.out.println ("It will mark your hits and misses and notify you when you sink their ship. ");
		System.out.println ("They have 3 ships of different lengths. These lengths are 2, 3, and 4 units. "); //introducing componenets of upper board to player.
		System.out.println ("Printed below is the board. You will use this to express your guesses. \n");
		System.out.println ( " [A1,A2,A3,A4,A5,A6,A7,A8,A9,A10] \n [B1,B2,B3,B4,B5,B6,B7,B8,B9,B10] \n [C1,C2,C3,C4,C5,C6,C7,C8,C9,C10] \n [D1,D2,D3,D4,D5,D6,D7,D8,D9,D10] \n [E1,E2,E3,E4,E5,E6,E7,E8,E9,E10] \n [F1,F2,F3,F4,F5,F6,F7,F8,F9,F10] \n [G1,G2,G3,G4,G5,G6,G7,G8,G9,G10] \n [H1,H2,H3,H4,H5,H6,H7,H8,H9,H10] \n [I1,I2,I3,I4,I5,I6,I7,I8,I9,I10] \n [J1,J2,J3,J4,J5,J6,J7,J8,J9,J10} \n");
		System.out.println ("/n At what position would you like to strike first? "); //asking use question. user input.
		String strike = positionStrike.nextLine(); //scanning to convey user reponse to the computer.
		char firstPosition = strike.charAt(0); // gets the first char from the user input... ex: a,b,c...
		int row = 0;
		//System.out.println("SwitchLetter: " + firstLetter);
		
		//switch: allows us to fetch information and convert the user input from the char to the row number for the computer to later on use in access to the array. 
		//side note for next time: will NOT work without the break in between each case
		
		switch (firstPosition) {
			
			case 'A': 
			case 'a': 
				row = 0;
				break;
				
			case 'B': 
			case 'b':
				row = 1;
				break;
			
			case 'C':
			case 'c':
				row = 2;
				break;
				
			case 'D':  
			case 'd': 
				row = 3;
				break;
			
			case 'E':
			case 'e':
				row = 4;
				break;
			
			case 'F':
			case 'f':
				row = 5;
				break;
			
			case 'G':
			case 'g': 
				row = 6;
				break;
			
			case 'H':
			case 'h':
				row = 7;
				break;
			
			case 'I': 
			case 'i':
				row = 8;
				break;
			
			case 'J':
			case 'j':
				row = 9;
				break;
			
		}
		
		System.out.println(row);
		
		char secondPosition = strike.charAt(1); // gets the the number from from the user input... ex: 1,2,3...
		int column = 0;
		switch (secondPosition) {
			
			case '1':
				column = 0;
				break;
				
			case '2':
				column = 1;
				break;
			
			case '3':
				column = 2;
				break;
				
			case '4':
				column = 3;
				break;
			
			case '5':
				column = 4;
				break;
			
			case '6':
				column = 5;
				break;
			
			case '7':
				column = 6;
				break;
			
			case '8':
				column = 7;
				break;
			
			case '9':
				column = 8;
				break;
			
			case '10': //NOT WORKING YET. WHY?
				column = 9;
				break;
			
		}
		
		System.out.println(column);
		
			



} //closes while playAgain
} //closes static void main 
} //closes class batttleship
