package ba.bitcamp.klase;

public class Main {
	public static boolean isSame(Songs s1, Songs s2) {

		if (s1.artist == s2.artist) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isFromSoloAuthor(Songs s1) {
		if (s1.artist.isGroup == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Songs getOlderSong(Songs s1, Songs s2){
		if(s1.year < s2.year){
			return s1;
		}else{
			return s2;
		}
	}
	
	
	
	public static int countGenreNumber(Album al, String genre){
		int counter = 0;
		for(int i = 0; i < al.songs.length; i++){
			if(al.songs[i].genre == genre){
				counter++;
			}
		}
		 return counter;
	}

	public static void main(String[] args) {

		Artist a1 = new Artist("Majaba", true, 2005, "Reggae");

		Songs[] s = new Songs[3];
		s[0] = new Songs(a1, "Cinge Cange Cang", 2008, "Reggae");
		s[1] = new Songs(a1, "Zagor", 2008, "Reggae");
		s[2] = new Songs(a1, "Grade moj", 2008, "Reggae");
		Album al1 = new Album("Reggae Mahala", a1, s, "Reggae");

		Songs[] s1 = new Songs[3];
		Artist a2 = new Artist("Fatboy Slim", false, 1984, "Electronic");
		s1[0] = new Songs(a2, "Right Here, Right Now", 1998, "Electronic");
		s1[1] = new Songs(a2, "Star 69", 2002, "Electronic");
		s1[2] = new Songs(a2, "The Rockafella Skank", 1998, "Electronic");
		Album al2 = new Album("Right Here Right Now", a2, s1, "Electronic");

		System.out.println("\n" + a1.toString() + "\n" + "Album name: "
				+ al1.name + "\n" + "Album songs: " + "\n" + s[0].name + "\n"
				+ s[1].name + "\n" + s[2].name);
		System.out.println("\n");
		System.out.println();
		System.out.println("\n" + a2.toString() + "\n" + "Album name: "
				+ al2.name + "\n" + "Album songs: " + "\n" + s1[0].name + "\n"
				+ s1[1].name + "\n" + s1[2].name + "\n");

		System.out.println("\n" + "Are these songs made by the same artist? "
				+ isSame(s[0], s[2]));
		System.out.println("\n"
				+ "Is the author of this song a group or a solo artist? "
				+ isFromSoloAuthor(s[2]));
		
		System.out.println("Wich of these songs is older?" +  getOlderSong(s[2], s1[2]));

	}

}
