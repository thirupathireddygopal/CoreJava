package generalizationAndSpecializationOfObjects;

/*
 * Hierarchical Inheritance--->MOTHER-->SON1,MOTHER-->SON2
 * Mother-->PlayerFirst,son1-->Batsman,son2-->Bowler
 * (SON1 extends MOTHER)
 * (SON2 extends MOTHER) 
*/
class PlayerFirst {

	private int id;
	private String name;
	private static int idGenerator = 100000;

	public PlayerFirst(String name) {

		this.id = ++idGenerator;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

class BatsmanFirst extends PlayerFirst {

	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int sixes;
	private int fours;
	private int ballsFaced;

	
	public BatsmanFirst(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public BatsmanFirst(String name, int runsScored, int centuries, int halfCenturies, int sixes, int fours,
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

}

class BowlerFirst extends PlayerFirst {

	private int ballsBowled;
	private int runsLeaked;
	private int wickets;
	
	
	
	public BowlerFirst(String name) {
		super(name);
	}

	public BowlerFirst(String name, int ballsBowled, int runsLeaked, int wickets) {
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

}

public class COJ_02_01_Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BatsmanFirst batsman = new BatsmanFirst("Dhoni", 1122, 4, 8, 23, 28, 612);
		System.out.println("BatsmanId:"+batsman.getId());
		System.out.println("BatsmanName:"+batsman.getName());
		System.out.println("BatsmanRunsScored:"+batsman.getRunsScored());
		System.out.println("BatsmanCenturies:"+batsman.getCenturies());
		System.out.println("BatsmanhalfCenturies:"+batsman.getHalfCenturies());
		System.out.println("BatsmanFours:"+batsman.getFours());
		System.out.println("BatsmanSixes:"+batsman.getSixes());
		System.out.println("BatsmanbBallsFaced:"+batsman.getBallsFaced());
		System.out.println();
		BowlerFirst bowler = new BowlerFirst("Ravindra Jadeja", 234, 178, 25);
		System.out.println("BowlerId:"+bowler.getId());
		System.out.println("BowlerName:"+bowler.getName());
		System.out.println("BowlerBallsBowled:"+bowler.getBallsBowled());
		System.out.println("BowlerWickets:"+bowler.getWickets());
	}

}