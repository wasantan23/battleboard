//Tanisha Wasan
import java.util.Scanner; //importing scanner class

public class Battleship { //class for the lower board of the battle ship

	public static void main (String [] args) {
	
	int [] [] board = new int [10] [10]; // makes an array - 10 rows, 10 colums 

	Scanner shipPosition = new Scanner(System.in); //creating instance of a scanner class called shipPosition which will call on the constructor
	
	boolean playAgain = true; //creating a boolean regarding on wheather the user would like to play again
	
	while (playAgain) { //a while loops that runs the code when the user wants to plau
	
System.out.println ("Hello user! You are going to be playing the game battleship. In this game, you will be playing against the computer."); //lines 12 - 19 are set of instructions for the game
System.out.println("This is a war themed game, where the computer will have to try and guess the location of your ship, and attempt to sink it."); 
System.out.println("You will start off by receiving 3 ships. Each ship has holes where the computer can hit. The lengths of the three ships will be 2, 3 and 4 units long.");
System.out.println("On this board (lower board), you will place the three ships.");
System.out.println("Each ship must be placed horizontally or vertically across grid spaces—not diagonally—and the ships can't go off the grid.");
System.out.println("In addition to that, your ships can't overlap.");
System.out.println("Players will take turns firing shots to atttempt to hit your opponents ships. The computer's hits and misses will be tracked on this lower board.");
System.out.println("This is the display of the board");
System.out.println ( " [A1,A2,A3,A4,A5,A6,A7,A8,A9,A10] \n [B1,B2,B3,B4,B5,B6,B7,B8,B9,B10] \n [C1,C2,C3,C4,C5,C6,C7,C8,C9,C10] \n [D1,D2,D3,D4,D5,D6,D7,D8,D9,D10] \n [E1,E2,E3,E4,E5,E6,E7,E8,E9,E10] \n [F1,F2,F3,F4,F5,F6,F7,F8,F9,F10] \n [G1,G2,G3,G4,G5,G6,G7,G8,G9,G10] \n [H1,H2,H3,H4,H5,H6,H7,H8,H9,H10] \n [I1,I2,I3,I4,I5,I6,I7,I8,I9,I10] \n [J1,J2,J3,J4,J5,J6,J7,J8,J9,J10} \n");
	
	System.out.println("For the two unit ship, what do you choose as your start position? (Ex. 1a) "); // lines 22 - 25 is asking the user for the selected start and end position of the 2 unit ship
		String shipTwoStart = shipPosition.nextLine(); 
		String shipTwo = shipTwoStart.substring(0,1);
		// switch (shipTwo) {
		//	case 'a';
			
		
	System.out.println("For the two unit ship, what do you choose as your end position?");
		String shipTwoEnd = shipPosition.nextLine(); 
	System.out.println("For the three unit ship, what do you choose as your start position? (Ex. 1a)"); //lines 26 - 29 is asking the user for the selected start and end position of the 3 unit ship
		String shipThreeStart = shipPosition.nextLine(); 
	System.out.println("For the three unit ship, what do you choose as your end position?");
		String shipThreeEnd = shipPosition.nextLine(); 
	System.out.println ("For the four unit ship, what do you choose as your start position? (Ex. 1a) "); //lines 30 - 33 is asking user for the selected start and end position of the 4 unit ship
		String shipFourStart = shipPosition.nextLine(); 
	System.out.println ("For the four unit ship, what do you choose as your end position?");
		String shipFourEnd = shipPosition.nextLine(); 
	
	
	
//}
	
} // closes while loop
	
} // closes the main method

} // closes the class




