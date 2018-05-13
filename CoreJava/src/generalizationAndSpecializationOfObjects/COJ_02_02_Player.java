package generalizationAndSpecializationOfObjects;

class PlayerSecond {

	private int id;
	private String name;
	private static int idGenerator = 100000;

	public PlayerSecond(String name) {
		this.id = ++idGenerator;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "PlayerSecond [id=" + id + ", name=" + name + "]";
	}
	
}

class BatsmanSecond extends PlayerSecond {

	private int runsScored;    //runsScored-->instance Member or an Attribute
	private int centuries;
	private int halfCenturies;
	private int sixes;
	private int fours;
	private int ballsFaced;

	public BatsmanSecond(String name, int runsScored, int centuries, int halfCenturies, int sixes, int fours,
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
	
	public String toString() {
		return "BatsmanSecond [runsScored-->" + runsScored + ", centuries-->" + centuries +
				", halfCenturies-->" + halfCenturies + ", sixes-->" + sixes +
				", fours-->" + fours + ", ballsFaced-->" + ballsFaced +"]";
	}
}

class BowlerSecond extends PlayerSecond {

	private int ballsBowled;
	private int runsLeaked;
	private int wickets;

	public BowlerSecond(String name, int ballsBowled, int runsLeaked, int wickets) {
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
	
	public String toString() {
		return "BowlerSecond [ballsBowled-->" + ballsBowled +
				", runsLeaked-->" + runsLeaked + ", wickets-->" + wickets +"]";
	}

}

public class COJ_02_02_Player {

	public static void main(String[] args) {
		PlayerSecond player= new PlayerSecond("kishore");
		System.out.println(player);
		BatsmanSecond batsman = new BatsmanSecond("Dhoni", 1122, 4, 8, 23, 28, 612);
		System.out.println(batsman);
		System.out.println("batsman.getId()-->" + batsman.getId());
		System.out.println("batsman.getName()-->" + batsman.getName());
		BowlerSecond bowler = new BowlerSecond("Ravindra Jadeja", 234, 178, 25);
		System.out.println(bowler);
		System.out.println("bowler.getId()-->" + bowler.getId());
		System.out.println("bowler.getName()-->" + bowler.getName());
		
	}

}