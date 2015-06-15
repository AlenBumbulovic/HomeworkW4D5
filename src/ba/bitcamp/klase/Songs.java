package ba.bitcamp.klase;

public class Songs {

	Artist artist;
	String name;
	int year;
	String genre;

	Songs() {

	}

	Songs(Artist artist, String name, int year, String genre) {

		this.artist = artist;
		this.name = name;
		this.year = year;
		this.genre = genre;

	}

	@Override
	public String toString() {
		return "Songs: " + "\n" + "Artist: " + artist + "\n" + "Name: " + name
				+ "\n" + "Year: " + year + "\n" + "Genre: " + genre;
	}

}
