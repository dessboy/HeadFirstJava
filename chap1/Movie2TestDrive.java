public class Movie2TestDrive {
	public static void main(String[] args) {
		Movie2 one = new Movie2();
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;
		Movie2 two = new Movie2();
		two.title = "Lost in Cubicle Space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		Movie2 three = new Movie2();
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;
	}
}
