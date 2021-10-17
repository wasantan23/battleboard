//Suhani Gupta 
import java.util.Scanner; //importing Scanner class to be able to have the computer read the user input

public class UpperBattleship { //upper board of battleship
	public static void main (String[] args) {
		
		int[][] board = new int [10][10]; //dimensions of board... 10 x 10
		
		Scanner keyboard = new Scanner(System.in); //creating instance of scanner class called 'keyboard'
		
		System.out.println (" \nThis is your upper board."); 
		System.out.println ("This will be monitoring the guesses you make on your opponents board. ");
		System.out.println ("It will mark your hits and misses and notify you when you sink their ship. ");
		System.out.println ("They have 3 ships of different lengths. These lengths are 2, 3, and 4 units. "); //introducing componenets of upper board to player.
		System.out.println ("Printed below is the board. You will use this to express your guesses. \n");
		System.out.println ( " [1a,2a,3a,4a,5a,6a,7a,8a,9a,10a] \n [1b,2b,3b,4b,5b,6b,7b,8b,9b,10b] \n [1c,2c,3c,4c,5c,6c,7c,8c,9c,10c] \n [1d,2d,3d,4d,5d,6d,7d,8d,9d,10d] \n [1e,2e,3e,4e,5e,6e,7e,8e,9e,10e] \n [1f,2f,3f,4f,5f,6f,7f,8f,9f,10f] \n [1g,2g,3g,4g,5g,6g,7g,8g,9g,10g] \n [1h,2h,3h,4h,5h,6h,7h,8h,9h,10h] \n [1i,2i,3i,4i,5i,6i,7i,8i,9i,10i] \n [1j,2j,3j,4j,5j,6j,7j,8j,9j,10j] \n"); //borrowed from Tanisha's code (with her permission). prints out the board for the user's reference.
		
		System.out.println ("/n At what position would you like to strike first? "); //asking use question. user input.
		String strike = keyboard.nextLine(); //scanning to convey user reponse to the computer.





} //closes static void main 
} //closes class batttleship

