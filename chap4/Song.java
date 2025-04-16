public class Song {

	private String artist;
	private String title;

	public void setArtist(String art) {
		artist = art;
	}

	public void setTitle(String tit) {
		title = tit;
	}

	public void play() {
		System.out.println("Playing song " + title + " from " + artist);
	}
}
