package ca.ualberta.cs.lonelytwitter;

/**
 * Created by kazakov on 1/19/17.
 */

public interface Tweetable {
    String getMessage();
    public void setMessage(String string) throws TweetTooLongException;


}
