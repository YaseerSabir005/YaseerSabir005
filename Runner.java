
public class Runner {

	public static void main(String[] args) {
		Piece[][] grid = new Piece[4][4];
		place(grid, new Player("Joe"));
		place(grid, new Bomb());// generates a bomb object
		place(grid, new Bomb());// generates another bomb object

		for (int i = 0; i < 13; i++) {
			place(grid, new Gold());// populates 12 Gold objects in grid 2d array
		}

		for (Piece[] a : grid) {
			for (Piece b : a) {

				System.out.print(b + "   ");// prints out the contents
			}
			System.out.println();
		}

		Player p = findPlayer(grid);// returns the player in the grid 2d array
		int num = getGold(grid, p);// returns the numbers of bars of gold in grid 2d array

		System.out.println("The player is next to " + num + " bars of gold.");

		Bomb[] bombs = findBombs(grid, 2);// this finds the number of bombs beside the player
		int nextToBombs = 0;
		int nextToDeadly = 0;

		for (Bomb a : bombs) {
			if (a.isDeadly() == true && p.nextTo(a) == true) {
				nextToDeadly++;// counts the number of deadly bombs nextto player
				nextToBombs++;

			} else if (a.isDeadly() == false && p.nextTo(a) == true)
				nextToBombs++;// counts the number of non-deadly players nextto player
		}

		System.out.println("The player is next to " + nextToBombs + " bombs.");// prints out the number of total bombs
																				// nextto
		if (nextToBombs > 0)
			System.out.println(nextToDeadly + " of them is/are deadly.\n");// prints out the number of deadly bombs
	}

	public static void place(Piece[][] aa, Piece p) {
		int row = (int) (Math.random() * 4);// generates random row for the object p passed
		int col = (int) (Math.random() * 4);// generates random col for the object p passed

		while (aa[row][col] != null) {

			row = (int) (Math.random() * 4);// generates another random row for the object p passed
			col = (int) (Math.random() * 4);// generates another random col for the object p passed

		}
		aa[row][col] = p;
		p.setLocation(row, col);// sets the location of the object in the 2d array
	}

	public static Player findPlayer(Piece[][] aa) {

		for (Piece[] a : aa) {
			for (Piece b : a) {
				if (b instanceof Player == true)
					return (Player) b;// returns the first instance of player found

			}
		}
		return null;
	}

	public static int getGold(Piece[][] aa, Player p) {

		int sum = 0;

		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {

				if (aa[i][j] instanceof Gold == true && p.nextTo(aa[i][j]) == true) {

					sum += ((Gold) aa[i][j]).get();// this adds the gold bars adjacent or diagonal to the player
				}

			}
		}
		return sum;// returns the sum
	}

	public static Bomb[] findBombs(Piece[][] aa, int num) {

		Bomb[] arr = new Bomb[num];
		int index = 0;

		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {

				if (aa[i][j] instanceof Bomb == true) {
					arr[index] = (Bomb) aa[i][j];// this casts the Piece object to bomb and adds to the array
					index++;

				}
			}

		}
		return arr;
	}

}
