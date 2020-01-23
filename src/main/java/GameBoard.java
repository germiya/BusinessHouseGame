import java.util.ArrayList;

public class GameBoard {
	ArrayList<Cell> boardCells = new ArrayList<Cell>();
	ArrayList<Player> players = new ArrayList<Player>();
	
	public void initializeBoard(String cellNamesString) {
		char[] cellNames = cellNamesString.toCharArray();
		int cellNumber = 0;
		for(char cell : cellNames ) {
			switch(cell) {
			case 'E' :  
						boardCells.add(new EmptyCell(cellNumber));
						cellNumber++;
						break;
			case 'J' : 	 
						boardCells.add(new JailCell(cellNumber));
						cellNumber++;
						break;
			case 'T' :   
						boardCells.add(new TreasureCell(cellNumber));
						cellNumber++;
						break; 
			case 'H' :  
					   boardCells.add(new HotelCell(cellNumber));
					   cellNumber++;
					   break;
			}
		}
	}
	public void initializePlayers(int numberOfPlayers) {
		for(int i=1; i <= numberOfPlayers; i++) {
			players.add(new Player("Player - "+i));
			players.get(i-1).currentCellIndex = this.boardCells.get(0).getCellNumber();
			System.out.println("Player "+players.get(i-1).playerName);
			System.out.print(" initialized to "+ players.get(i-1).currentCellIndex);
		}
	}
	public void playGame(String diceString) {
		String[] arrOfDice = diceString.split(","); 
		
        for (int i = 0 ;i <10; i++) { 
        	for(int k = 0; k < this.players.size() ;k++) {
        		int cellMove = players.get(k).currentCellIndex + Integer.parseInt(arrOfDice[k*i]) ;
        		
        		System.out.print("\n Current Pos: " +players.get(k).currentCellIndex);
        		System.out.print(", Dice Move: "+ arrOfDice[k*i] );
        		System.out.print(", New Pos: "+ cellMove+"\n");
        		
        		if(cellMove >= 45) cellMove = cellMove % 45;
        		players.get(k).currentCellIndex = cellMove;
        		this.boardCells.get(cellMove).onPlayerLands(players.get(k));
        		
        	}
        }
		
	}
	
	public void printPlayers() {
		System.out.println("***********************************************");
		for(int k = 0; k < this.players.size() ;k++) {
			System.out.println(this.players.get(k).getPlayerTotalWorth());
		}
	}
	public static void main(String args[]) {
		System.out.println("-----------Business House Game----------------");
		GameBoard gameboard = new GameBoard();
		gameboard.initializeBoard("EEJHETJTEEHJTHEEJHETJTEEHJTHJEEJHETJTEEHJTEHE");
		gameboard.initializePlayers(3);
		gameboard.playGame("4,4,4,6,7,8,5,11,10,12,2,3,5,6,7,8,5,11,10,12,2,3,5,6,7,8,5,11,10,12");
		gameboard.printPlayers();
	}
}
