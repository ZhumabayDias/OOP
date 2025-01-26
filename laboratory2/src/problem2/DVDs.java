package problem2;

public class DVDs extends LibraryItem {
	private String genre;
	private double rating;
	public DVDs(String title, String author, int publicationYear,double rating,String genre) {
		super(title, author, publicationYear);
		this.genre = genre;
		this.rating = rating;
	}
	@Override
	public String beforeOrAfter() {
		if(getPublicationYear()<2000) {
			return "it was before";
		}
		else return "it was after";
	}
	public boolean recommended() {
		if(rating>8.5) {
			return true;
		}
		else return false;
	}
	public String forMan() {
		if(genre.equals("action movie")) {
			return "For MAAAAAAAN";
		}
		else if (genre.equals("Dorama")) {
			return "YouСantChooseIt";
		}
		else return "forWoman";
	}
}
