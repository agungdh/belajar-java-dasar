public class PlayerTestDrive {
	public static void main(String[] args) {
		System.out.println("Number of Players = " + Player.playerCount);
		
		Player one = new Player("AgungDH");
		Player two = new Player("Sanji");
		Player three = new Player("Berlay");
		Player four = new Player("Bimi");
	}
}

class Player {
	static int playerCount = 0;
	private String name;

	public Player(String n) {
		this.name = n;
		System.out.println("Added New Player, the Name is " + this.name);
		
		playerCount++;
		System.out.println("Number of Players = " + this.playerCount);
	}
}