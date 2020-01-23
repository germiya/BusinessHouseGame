import java.util.ArrayList;

public class Player {
	private int playerWorth;
	public String playerName; 
	public int currentCellIndex;
	public ArrayList<HotelCell> hotelsOwned = new ArrayList<HotelCell>();
	public Player(String playerName) {
		this.playerWorth = 1000;
		this.playerName = playerName;
	}
	public void incrementPlayerWorth(int earned){
		this.playerWorth = this.playerWorth + earned;
	}
	public void decrementPlayerWorth(int earned) {
		this.playerWorth = this.playerWorth - earned;
	}
	public int getPlayerWorth() {
		return playerWorth;
	}
	public int getPlayerTotalWorthValue() {
		return (200 * this.hotelsOwned.size()) + this.playerWorth;
	}
	public String getPlayerTotalWorth() {
		return "Total worth of "+this.playerName+ ":"+ this.getPlayerTotalWorthValue();
	}
}
