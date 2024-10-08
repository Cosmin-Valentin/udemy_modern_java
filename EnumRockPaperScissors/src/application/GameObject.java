package application;

public enum GameObject {
	
	ROCK, PAPER, SCISSORS;
	
	private GameObject beats;
	
	static {
		ROCK.beats = SCISSORS;
		PAPER.beats = ROCK;
		SCISSORS.beats = PAPER;
	}
	
	private static int[][] comparison = {
			{0, -1, 1},
			{1, 0, -1},
			{-1, 1, 0},
	};
	
	private static String[][] compareText = {
			{"Rock matches rock", "Rock gets wrapped", "Rock smashes scissors"},
			{"Paper wraps rock", "Paper matches paper", "Paper gets cut"},
			{"Scissors get smashed", "Scissors cut paper", "Scissors match scissors"},
	};
	
	boolean beats(GameObject other) {
		return this.beats == other;
	}
	
	
	public String compareText(GameObject other) {
		return compareText[this.ordinal()][other.ordinal()];
	}
}