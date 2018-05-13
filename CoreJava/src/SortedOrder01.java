import java.util.*;

class Batsman implements Comparable<Batsman> {
	private int id, noOfMatchesPlayed, noOfInningsPlayed, noOfTimesNotOut, noOfBallsFaced, totalRuns, highestScore,
			noOfCenturies, noOfHalfCenturies, noOfFours, noOfSixes;
	private String name;
	private double average, strikeRate;

	public Batsman() {
	}

	public Batsman(int id, String name, int noOfMatchesPlayed, int noOfInningsPlayed, int noOfTimesNotOut,
			int totalRuns, int highestScore, int noOfBallsFaced, int noOfCentures, int noOfHalfCenturies, int noOfFours,
			int noOfSixes) {
		this.id = id;
		this.name = name;
		this.noOfMatchesPlayed = noOfMatchesPlayed;
		this.noOfInningsPlayed = noOfInningsPlayed;
		this.noOfTimesNotOut = noOfTimesNotOut;
		this.totalRuns = totalRuns;
		this.highestScore = highestScore;
		this.noOfBallsFaced = noOfBallsFaced;
		this.noOfCenturies = noOfCentures;
		this.noOfHalfCenturies = noOfHalfCenturies;
		this.noOfFours = noOfFours;
		this.noOfSixes = noOfSixes;

		this.strikeRate = (double) this.totalRuns * 100 / this.noOfBallsFaced;
		this.average = (double) this.totalRuns / (this.noOfInningsPlayed - this.noOfTimesNotOut);
	}

   @Override
	public String toString() {
		return "Batsman [id=" + id + ", noOfMatchesPlayed=" + noOfMatchesPlayed + ", noOfInningsPlayed="
				+ noOfInningsPlayed + ", noOfTimesNotOut=" + noOfTimesNotOut + ", noOfBallsFaced=" + noOfBallsFaced
				+ ", totalRuns=" + totalRuns + ", highestScore=" + highestScore + ", noOfCenturies=" + noOfCenturies
				+ ", noOfHalfCenturies=" + noOfHalfCenturies + ", noOfFours=" + noOfFours + ", noOfSixes=" + noOfSixes
				+ ", name=" + name + ", average=" + average + ", strikeRate=" + strikeRate + "]";
	}
	
    @Override
    public int compareTo(Batsman obj) {
        return this.name.compareTo(obj.name);
    }
}

public class SortedOrder01 {
     
    public static void main(String[] args) {
        Batsman b1 = new Batsman(1, "Ricki Ponting", 17, 16, 2, 401, 98, 302, 0, 2, 41, 11);
        Batsman b2 = new Batsman(2, "Suresh Raina", 19, 15, 5, 513, 99, 452, 2, 3, 38, 10);
        Batsman b3 = new Batsman(3, "Virat Kohli", 29, 28, 10, 1213, 121, 952, 4, 6, 78, 26);
        List<Batsman> batsmanDetailsList = new ArrayList<Batsman>();
        batsmanDetailsList.add(b1);
        batsmanDetailsList.add(b2);
        batsmanDetailsList.add(b3);
        List<Batsman> sortedRecords = sortByName(batsmanDetailsList);
        for (Batsman b : sortedRecords) {
            System.out.println(b);
        }
    }
   
  	public static List<Batsman> sortByName(List<Batsman> batsmanList) {
        Collections.sort(batsmanList);
        return batsmanList;
    }
	
}