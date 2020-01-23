
public class EmptyCell extends Cell {
	int cellWorth;
	public int cellNumber;
	public EmptyCell(int cellNumber) {
		this.cellWorth = 0;
		this.cellNumber = cellNumber;
	}
	@Override
	public void onPlayerLands(Player player) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------");
		System.out.println("Player worth: "+player.getPlayerWorth());
		player.incrementPlayerWorth(cellWorth);
		this.printCellData(player);
	}
	@Override
	public void printCellData(Player player) {
		 
		System.out.println(" E "+ cellNumber);		
		System.out.println("Player at: "+player.currentCellIndex);
		System.out.println("Player new worth: "+player.getPlayerWorth());
		
		
	}
	public int getCellNumber() {
		return this.cellNumber;
	}

}
