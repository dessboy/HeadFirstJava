public class PhraseOMatic {
	public static void main(String[] args) {

		// make 3 sets of words
		String[] wordListOne = {"agnostic", "opinionated",
			"voice activated", "haptically driven", "symetrically-fulled",
			"space-driven", "agent based", "time driven", "AI enabled",
			"violation neutral", "strongly typed"};

		String[] wordListTwo = {"loosely coupled", "six sigma", "super-sensitive",
			"asynchronous", "event driven", "nuclear powered", "symetrically fulled",
			"cloud native", "war-tested", "timezone independant", "OGM-free",
			"service oriented", "containerized", "serverless", "microservices",
			"distributed ledger"};

		String[] wordListThree = {"framework", "library", "Ultimate weapon",
			"atomic solution", "repository", "pipeline", "service mesh",
			"architecture", "perspective", "design", "orientation",
			"all-in driver", "World-approved device"};

		// find out how many words in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// generate three random numbers
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(twoLength);
		int rand3 = randomGenerator.nextInt(threeLength);

		// now build a phrase
		String phrase = wordListOne[rand1] + " " +
			wordListTwo[rand2] + " " + wordListThree[rand3];

		// print out the phrase
		System.out.println("What we need is a " + phrase);
	}
}
