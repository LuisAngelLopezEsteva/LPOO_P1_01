package Capitulo3.ProgrammingExercises.ejercicio14;

public class Painting {
	private String title, artist, medium ;//medio como color de agua
	private Integer price;
	private double galleryCommission;
	
	public double getGalleryCommission() {
		return galleryCommission;
	}

	public void setGalleryCommission(Integer price) {
		this.galleryCommission = 0.2 * price;
	}
//	public Painting(String title, String artist, String medium, Integer price ) {
	public Painting( ) {
		this.title ="She is beautiful";
		this.artist = "Luis";
		this.medium ="Azul";
		this.price = 30000;
		this.galleryCommission = price * 0.2;
	}
	public Painting(int x ) {
		
	}
	@Override
	public String toString() {
		return "Painting [title=" + title + ", artist=" + artist + ", medium=" + medium + ", price=" + price
				+ ", galleryCommission=" + galleryCommission + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	

}
