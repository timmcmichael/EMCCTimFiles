/*
 * This class represents a single record sold in a record store. with pricing based on genre and subgenre.
 * 
 * It demonstrates nested if statements to determine the price of the record.
 * 
 * NOTE: This is the code that was completed by the end of the video and is not the starter file. Because it's been renamed, it doesn't compile. See VinylRecord.java for the starter file.
 * 
 */
package module05;

public class VinylRecord { // This is NOT the starter file!
    private String title;
    private String artist;
    private String genre;
    private String subgenre;
    private double price;

    // Constructors
    public VinylRecord(String title, String artist, String genre, String subgenre) {
        this.title = title;
        this.artist = artist;
        this.setGenre(genre, subgenre);
    }

    public VinylRecord() {
        this.title = "[No Title]";
        this.artist = "[No Artist]";
        this.setGenre("unknown", "unknown");
    }

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

    public void setGenre(String genre, String subgenre) {
        this.genre = genre;
        this.subgenre = subgenre;

        if (this.genre.equals("Rock")) {
            if (this.subgenre.equals("Classic Rock")) {
                this.price = 20.0;
            } else if (this.subgenre.equals("Grunge")) {
                this.price = 25.0;
            } else {
                this.price = 15.0;
            }
        } else if (this.genre.equals("Blues")) {
            if (this.subgenre.equals("Chicago Blues")) {
                this.price = 35.0;
            } else if (this.subgenre.equals("Delta Blues")) {
                this.price = 25.0;
            } else {
                this.price = 25.0;
            }
        } else {
            this.price = 10.0;
        }

    }

}