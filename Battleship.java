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
System.out.println( " [1a,2a,3a,4a,5a,6a,7a,8a,9a,10a] \n [1b,2b,3b,4b,5b,6b,7b,8b,9b,10b] \n [1c,2c,3c,4c,5c,6c,7c,8c,9c,10c] \n [1d,2d,3d,4d,5d,6d,7d,8d,9d,10d] \n [1e,2e,3e,4e,5e,6e,7e,8e,9e,10e] \n [1f,2f,3f,4f,5f,6f,7f,8f,9f,10f] \n [1g,2g,3g,4g,5g,6g,7g,8g,9g,10g] \n [1h,2h,3h,4h,5h,6h,7h,8h,9h,10h] \n [1i,2i,3i,4i,5i,6i,7i,8i,9i,10i] \n [1j,2j,3j,4j,5j,6j,7j,8j,9j,10j] \n"); //display of the board	
	
	System.out.println("For the two unit ship, what do you choose as your start position? (Ex. 1a) "); // lines 22 - 25 is asking the user for the selected start and end position of the 2 unit ship
		String shipTwoStart = shipPosition.nextLine(); 
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

} // closes while loop
	
} // closes the main method

} // closes the class
	











	




	
	
	




	
	


