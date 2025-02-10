/*
 * This class represents a single record sold in a record store. with pricing based on genre and subgenre.
 * 
 * It demonstrates nested if statements to determine the price of the record.
 * 
 */

public class VinylRecord {
    private String title;
    private String artist;
    private String genre;
    private String subgenre;
    private double price;

    // Constructors

    // Getters

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public String getSubgenre() {
        return subgenre;
    }

    public double getPrice() {
        return price;
    }

    // Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

}