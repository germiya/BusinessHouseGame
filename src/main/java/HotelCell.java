
public class HotelCell extends Cell {
	int rent;
	int price;
	public int cellNumber;
	Player hotelOwner = null;// object composition
	public HotelCell(int cellNumber) {
		//hotelOwner = new HotelOwner();
		this.price = 200;
		this.rent  = 50;
		this.cellNumber = cellNumber;
	}
	@Override
	public void onPlayerLands(Player player) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------");
		System.out.println("Player worth: "+player.getPlayerWorth());
		if(this.hotelOwner == null) {
			if(this.hotelOwner != player) {
				player.decrementPlayerWorth(rent);
			}
		}
		else {
			hotelOwner = player;
			player.hotelsOwned.add(this);
			player.decrementPlayerWorth(price);
		}
		this.printCellData(player);
	}
	@Override
	public void printCellData(Player player) { 
		System.out.println(" H "+ cellNumber);
		System.out.println("Player at: "+player.currentCellIndex);
		System.out.println("Player new worth: "+player.getPlayerWorth());		
	}
	public int getCellNumber() {
		return this.cellNumber;
	} 
	 

}
