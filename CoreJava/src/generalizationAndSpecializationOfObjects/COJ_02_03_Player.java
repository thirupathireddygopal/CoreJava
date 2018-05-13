package generalizationAndSpecializationOfObjects;

abstract class Player3 {

	private int id;
	private String name;
	private static int idGenerator = 100000;
	
	//adding abstract method(calacStrkieRate()) in the parent class which is in abstract form
	abstract public float calcStrikeRate();

	public Player3(String name) {

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
		return "Player3 [id=" + id + ", name=" + name + "]";
	}


}

class Batsman3 extends Player3 {

	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int sixes;
	private int fours;
	private int ballsFaced;

	public Batsman3(String name, int runsScored, int centuries, int halfCenturies, int sixes, int fours,
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
		return "Batsman3 [runsScored=" + runsScored + ", centuries=" + centuries + ", halfCenturies=" + halfCenturies
				+ ", sixes=" + sixes + ", fours=" + fours + ", ballsFaced=" + ballsFaced + "]";
	}

	@Override
	public float calcStrikeRate() {
		float result = (runsScored/ballsFaced);
		return result;
	}


}

class Bowler3 extends Player3 {

	private int ballsBowled;
	private int runsLeaked;
	private int wickets;

	public Bowler3(String name, int ballsBowled, int runsLeaked, int wickets) {
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
		return "Bowler3 [ballsBowled=" + ballsBowled + ", runsLeaked=" + runsLeaked + ", wickets=" + wickets + "]";
	}

	@Override
	public float calcStrikeRate() {
		float result = (ballsBowled/wickets);
		return result;
	}
}

 public class COJ_02_03_Player {

	public static void main(String[] args) {
		Batsman3 batsman = new Batsman3("Dhoni", 1122, 4, 8, 23, 28, 612);
		System.out.println(batsman);
		System.out.println("batsman.calcStrikeRate()-->" + batsman.calcStrikeRate());
		Bowler3 bowler = new Bowler3("Ravindra Jadeja", 234, 178, 25);
		System.out.println(bowler);
		System.out.println("bowler.calcStrikeRate-->" + bowler.calcStrikeRate());

	}

}