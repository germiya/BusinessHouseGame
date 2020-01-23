
public class JailCell extends Cell {
	int cellWorth;
	public int cellNumber;
	public JailCell(int cellNumber) {
		this.cellWorth = 150;
		this.cellNumber = cellNumber;
	}
	@Override
	public void onPlayerLands(Player player) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------");
		System.out.println("Player worth: "+player.getPlayerWorth());
		player.decrementPlayerWorth(cellWorth);
		this.printCellData(player);
		}
		@Override
		public void printCellData(Player player) { 
			System.out.println(" J "+ cellNumber);
			System.out.println("Player at: "+player.currentCellIndex);
			System.out.println("Player new worth: "+player.getPlayerWorth());
			
			
		}
	public int getCellNumber() {
		return this.cellNumber;
	}

}
