package ba.bitcamp.klase;

public class Artist {
	String name;
	Boolean isGroup;
	int year;
	String genre;

	Artist(String name, Boolean isGroup, int year, String genre) {
		this.name = name;
		this.isGroup = isGroup;
		this.year = year;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Artist: " + name + "\n" + "Is it a group? " + isGroup + "\n"
				+ "Year: " + year + "\n" + "Genre: " + genre;
	}

}
