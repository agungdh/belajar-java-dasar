public class SimpleDotComTestDrive {
	public static void main(String[] args) {
		String userGuess;
		String result;

		SimpleDotCom dot = new SimpleDotCom();
		
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		userGuess = "3";
		dot.checkYourself(userGuess);
		userGuess = "4";
		dot.checkYourself(userGuess);
		userGuess = "5";
		dot.checkYourself(userGuess);
		userGuess = "2";
		dot.checkYourself(userGuess);
	}
}

class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public void checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";

		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}

		if (numOfHits == locationCells.length) {
			result = "kill";
		}

		System.out.println(result);
	}
}