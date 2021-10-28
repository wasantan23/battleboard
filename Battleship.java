//Tanisha Wasan
import java.util.Scanner; //importing scanner class
public class Main { //class for the lower board of the battle ship
	int row;
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

 	System.out.println("For the two unit ship, what do you choose as your start position? (Ex. A1) Please write in capital letters."); // lines 22 - 25 is asking the user for the selected start and end position of the 2 unit ship
 		String shipTwoStart = shipPosition.nextLine();  //scanning the input 
 		// switch (shipTwo) {
 		//	case 'a';
 		String shipTwoStartRow = shipTwoStart.substring(0,1); //geting the first letter
 	System.out.println("For the two unit ship, what do you choose as your end position?");
 		String shipTwoEnd = shipPosition.nextLine(); 
 		String shipTwoEndRow = shipTwoEnd.substring(0,1);
 		System.out.println(shipTwoEndRow);
 	 if (shipTwoStartRow.equals("A")|| shipTwoEndRow.equals("A") )  { //libes 33-62 is checking which row the first ship is on
			int row = 1;
	}
		else if (shipTwoStartRow.equals("B")|| shipTwoEndRow.equals("B") )  {
			int row = 2;
	}
		else if (shipTwoStartRow.equals("C")|| shipTwoEndRow.equals("C") )  {
			int row = 3;
	}
		else if (shipTwoStartRow.equals("D")|| shipTwoEndRow.equals("D") )  {
			int row = 4;
	}
		else if (shipTwoStartRow.equals("E")|| shipTwoEndRow.equals("E") )  {
			int row = 5;
	}
	  else if (shipTwoStartRow.equals("F")|| shipTwoEndRow.equals("F") )  {
			int row = 6;
	}
	  else if (shipTwoStartRow.equals("G")|| shipTwoEndRow.equals("G") )  {
			int row = 7;
	}
	  else if (shipTwoStartRow.equals("H")|| shipTwoEndRow.equals("H") )  {
			int row = 8;
	}
	  else if (shipTwoStartRow.equals("I")|| shipTwoEndRow.equals("I") )  {
			int row = 9;
	}
	  else if (shipTwoStartRow.equals("J")|| shipTwoEndRow.equals("J") )  {
			int row = 10;
	}
 	System.out.println("For the three unit ship, what do you choose as your start position? (Ex. 1a)"); 
 		String shipThreeStart = shipPosition.nextLine(); 
 		String shipThreeStartRow = shipThreeStart.substring(0,1);
 	System.out.println("For the three unit ship, what do you choose as your end position?");
 		String shipThreeEnd = shipPosition.nextLine(); 
 		String shipThreeEndRow = shipThreeEnd.substring(0,1);
 		 if (shipTwoStartRow.equals("A") || shipTwoEndRow.equals("A") )  { //lines 69- 97 is checking which row hte second ship is on 
			int row = 1;
	}
		else if (shipThreeStartRow.equals("B")|| shipThreeEndRow.equals("B") )  {
			int row = 2;
	}
		else if (shipThreeStartRow.equals("C")|| shipThreeEndRow.equals("C") )  {
			int row = 3;
	}
		else if (shipThreeStartRow.equals("D")|| shipThreeEndRow.equals("D") )  {
			int row = 4;
	}
		else if (shipThreeStartRow.equals("E")|| shipThreeEndRow.equals("E") )  {
			int row = 5;
	}
		else if (shipThreeStartRow.equals("F")|| shipThreeEndRow.equals("F") )  {
			int row = 6;
	}
		else if (shipThreeStartRow.equals("G")|| shipThreeEndRow.equals("G") )  {
			int row = 7;
	}
		else if (shipThreeStartRow.equals("H")|| shipThreeEndRow.equals("H") )  {
			int row = 8;
	}
		else if (shipThreeStartRow.equals("I")|| shipThreeEndRow.equals("I") )  {
			int row = 9;
	}
		else if (shipThreeStartRow.equals("J")|| shipThreeEndRow.equals("J") )  {
			int row = 10;
	}
 	System.out.println ("For the four unit ship, what do you choose as your start position? (Ex. 1a) "); 
 		String shipFourStart = shipPosition.nextLine(); 
 		String shipFourStartRow = shipFourStart.substring(0,1);
 	System.out.println ("For the four unit ship, what do you choose as your end position?");
 		String shipFourEnd = shipPosition.nextLine(); 
 		String shipFourEndRow = shipFourEnd.substring(0,1);
		if (shipTwoStartRow.equals("A")|| shipTwoEndRow.equals("A") )  { //lines 105-133 is checking what row the third ship is on
			int row = 1;
	}
		else if (shipFourStartRow.equals("B")|| shipFourEndRow.equals("B") )  {
			int row = 2;
	}
		else if (shipFourStartRow.equals("C")|| shipFourEndRow.equals("C") )  {
			int row = 3;
	}
		else if (shipFourStartRow.equals("D")|| shipFourEndRow.equals("D") )  {
			int row = 4;
	}
		else if (shipFourStartRow.equals("E")|| shipFourEndRow.equals("E") )  {
			int row = 5;
	}
		else if (shipFourStartRow.equals("F")|| shipFourEndRow.equals("F") )  {
			int row = 6;
	}
	  	else if (shipFourStartRow.equals("G")|| shipFourEndRow.equals("G") )  {
			int row = 7;
	}
	  	else if (shipFourStartRow.equals("H")|| shipFourEndRow.equals("H") )  {
			int row = 8;
	}
	  	else if (shipFourStartRow.equals("I")|| shipFourEndRow.equals("I") )  {
			int row = 9;
	}
	  	else if (shipFourStartRow.equals("J")|| shipFourEndRow.equals("J") )  {
			int row = 10;
	}


}

}
}


 /*
	 switch (shipTwoStartRow, shipTwoEndRow, shipThreeStartRow. shipThreeEndRow, shipFourStartRow, shipFourEndRow ) { //error
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
		*/










