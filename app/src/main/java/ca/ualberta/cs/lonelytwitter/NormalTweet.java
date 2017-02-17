package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet implements Comparable<NormalTweet> {

    public int compareTo(NormalTweet normalTweet) {
        return normalTweet.getDate().compareTo(this.getDate());
    }

    public NormalTweet(String message) {
        super(message);
    }



    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
