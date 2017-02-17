package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by kazakov on 2/16/17.
 */

public class TweetList {
    private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

    public void add(NormalTweet tweet){
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);

    }

    public boolean hasTweet(Tweet tweet){

        for (NormalTweet tweetTest : tweets ) {
            return tweetTest.equals(tweet);
        }
        return false;

    }

    public void getTweet(){
        //
        Collections.sort(tweets);

        //Collections.sort
        //return tweets.get(index);
    }

    public void delete(NormalTweet tweet){
        tweets.remove(tweet);

    }

    public int getCount(){
        return tweets.size();
    }
}
