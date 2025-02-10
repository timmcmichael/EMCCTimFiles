/*
 * This program demonstrates the VinylRecord class by creating and displaying information about several instances.
 * 
 * It also demonstrates the use of a "helper" method to display the information about a VinylRecord object--that means I don't have to write the same println() statements over and over. Instead, I pass an object into that method, which then does the outputting.
 * 
 * NOTE: This is the code that was completed by the end of the video and is not the starter file. Because it's been renamed, it doesn't compile. See VinylRecordDemo.java for the starter file.
 * 
 */
package module05;

public class VinylRecordDemo { // This is NOT the starter file!

    public static void main(String[] args) {
        // Create a new VinylRecord object
        // VinylRecord record1 = new VinylRecord();
        VinylRecord record1 = new VinylRecord("Exile on Main St", "The Rolling Stones", "Rock", "Classic Rock");

        // Set the record's title, artist, genre, and subgenre
        // record1.setTitle("Exile on Main St");
        // record1.setArtist("The Rolling Stones");
        // record1.setGenre("Rock", "Classic Rock");

        // Display the record's information
        displayRecord(record1);

        // Create another VinylRecord object
        VinylRecord record2 = new VinylRecord();
        // VinylRecord record2 = new VinylRecord("Ten", "Pearl Jam", "Rock", "Grunge");

        // Set the record's title, artist, genre, and subgenre
        record2.setTitle("Ten");
        record2.setArtist("Pearl Jam");
        record2.setGenre("Rock", "Grunge");

        // Display the record's information
        displayRecord(record2);

        // Create another VinylRecord object
        VinylRecord record3 = new VinylRecord();
        // VinylRecord record3 = new VinylRecord("London Calling", "The Clash", "Rock", "Punk");

        // Set the record's title, artist, genre, and subgenre
        record3.setTitle("London Calling");
        record3.setArtist("The Clash");
        record3.setGenre("Rock", "Punk");

        // Display the record's information
        displayRecord(record3);

        // Create another VinylRecord object
        VinylRecord record4 = new VinylRecord();
        // VinylRecord record4 = new VinylRecord("Hard Again", "Muddy Waters", "Blues", "Chicago Blues");

        // Set the record's title, artist, genre, and subgenre
        record4.setTitle("Hard Again");
        record4.setArtist("Muddy Waters");
        record4.setGenre("Blues", "Chicago Blues");

        // Display the record's information
        displayRecord(record4);

    }

    /*
     * This "helper" method displays the information about a VinylRecord object. Since we have to do that often while testing, it's a good idea to put it in a separate method.
     * 
     * This demonstrates that you can pass an object to a method, and the method can access the object's fields.
     */
    private static void displayRecord(VinylRecord record) {
        System.out.println("[-----Vinyl Record Information-----]");
        System.out.println("Title: " + record.getTitle());
        System.out.println("Artist: " + record.getArtist());
        System.out.println("Genre: " + record.getGenre());
        System.out.println("Subgenre: " + record.getSubgenre());
        System.out.println("Price: " + record.getPrice());
    }

}
