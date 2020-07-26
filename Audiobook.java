interface AudiobookInterface {
    abstract public void textbookMethod ();
}

public class Audiobook extends Book implements AudiobookInterface {
    private String audiobookType; // Private is considerated best practice in this case
    private String audiobookAuthor;

    public Audiobook () {

    }

    public Audiobook (String audiobookType, String audiobookAuthor) {
        this.audiobookAuthor = audiobookAuthor; // reserved word "this" used to refer to current contructor
        this.audiobookType = audiobookType;
    }

    public void setAudiobookType(String name) {
        audiobookType = name;
    }
    
    public void setAudiobookAuthor(String author) {
        audiobookAuthor = author;
    }

    public String getAudiobookAuthor() {
        return audiobookAuthor;
    }

    public String getAudiobookType() {
        return audiobookType;
    }

    @Override
    public String toString () {
        return audiobookType + " by " + audiobookAuthor;
    }

    public void audiobookMethod () {
        System.out.println("* Audiobook");
    }
}   