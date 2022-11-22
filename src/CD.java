/**
 * La classe CD représente un objet CD. Les informations concernant le
 * CD sont stockées et peuvent être récupérées.
 *
 * @author Michael Kolling et David J. Barnes
 * @version 2008.03.30
 */
public class CD extends Item {
    private String artist;
    private int numberOfTracks;

    /**
     * Initialise le CD.
     *
     * @param theTitle  Le titre du CD.
     * @param theArtist L'artiste du CD.
     * @param tracks    Le nombre de pistes sur le CD.
     * @param time      La durée du CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time) {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }

    /**
     * @return L'artiste de ce CD.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @return Le nombre de pistes du CD.
     */
    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    /**
     * Afficher les détails de ce CD sur le terminal de texte.
     */
    public void print() {
        super.print();
        System.out.println("    " + artist);
        System.out.println("    pistes : " + numberOfTracks);
    }

    public String toString() {
        String str = "CD: " + artist + ": " + title;
        if (gotIt) {
            str += " *";
        }

        str += "\n" + numberOfTracks + " tracks, " + playingTime + " minutes\n";
        str += comment + "\n";
        return str;
    }
}
