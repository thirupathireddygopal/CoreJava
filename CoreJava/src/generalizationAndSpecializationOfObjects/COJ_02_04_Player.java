package generalizationAndSpecializationOfObjects;

import java.util.Arrays;

class Player4 implements Comparable<Player4>{

	private int id;
	private String name;
	private static int idGenerator = 100000;

	public Player4(String name) {

		this.id = ++idGenerator;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Player4 obj) {
		return this.name.compareTo(obj.getName());
	}

	
}

class Batsman4 extends Player4 {

	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int sixes;
	private int fours;
	private int ballsFaced;

	public Batsman4(String name, int runsScored, int centuries, int halfCenturies, int sixes, int fours,
			int ballsFaced) {
		super(name);
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.sixes = sixes;
		this.fours = fours;
		this.ballsFaced = ballsFaced;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public int getSixes() {
		return sixes;
	}

	public int getFours() {
		return fours;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	@Override
	public String toString() {
		return "Batsman [runsScored=" + runsScored + ", centuries=" + centuries + ", halfCenturies=" + halfCenturies
				+ ", sixes=" + sixes + ", fours=" + fours + ", ballsFaced=" + ballsFaced + ", getId=" + getId()
				+ ", getName=" + getName() + "]";
	}

}

class Bowler4 extends Player4 {

	private int ballsBowled;
	private int runsLeaked;
	private int wickets;

	public Bowler4(String name, int ballsBowled, int runsLeaked, int wickets) {
		super(name);
		this.ballsBowled = ballsBowled;
		this.runsLeaked = runsLeaked;
		this.wickets = wickets;
	}

	public int getBallsBowled() {
		return ballsBowled;
	}

	public int getRunsLeaked() {
		return runsLeaked;
	}

	public int getWickets() {
		return wickets;
	}

	@Override
	public String toString() {
		return "Bowler [ballsBowled=" + ballsBowled + ", runsLeaked=" + runsLeaked + ", wickets=" + wickets + ", getId="
				+ getId() + ", getName=" + getName() + "]";
	}

}

public class COJ_02_04_Player {

	public static void main(String[] args) {

		Batsman4 batsmanOne = new Batsman4("Dhoni", 1234, 5, 7, 23, 34, 634);
		Batsman4 batsmanTwo = new Batsman4("Kohli", 1123, 4, 6, 21, 32, 621);

		Bowler4 bowlerOne = new Bowler4("Ashwin", 234, 200, 34);
		Bowler4 bowlerTwo = new Bowler4("Jadeja", 212, 234, 32);
		Player4 players[] = new Player4[4];
		players[0] = batsmanOne;;
		players[1] = batsmanTwo;
		players[2] = bowlerOne;
		players[3] = bowlerTwo;
		System.out.println("players[0]-->" + players[0]);
		System.out.println("players[1]-->" + players[1]);
		System.out.println("players[2]-->" + players[2]);
		System.out.println("players[3]-->" + players[3]);
		Arrays.sort(players);
		System.out.println(Arrays.toString(players));
	}
}