package ba.bitcamp.klase;

public class Album {

	String name;
	Artist artist;
	Songs[] songs;
	String genre;
	
	
	public Album(String name, Artist artist, Songs[] songs, String genre) {
		
		this.name = name;
		this.artist = artist;
		this.songs = songs;
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "Album: " + "\n" + "Album name: " + name + "\n"  + artist + "\n" + "songs" 
				+ songs + "\n" + "genre: " + genre  ;
	}
	

}
