package com.company;

public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;
    private VietNetwork vietNetwork;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedIn) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
        this.vietNetwork = vietNetwork;
    }

    public void share (String message){
        this.facebook.setMessage(message);
        this.twitter.setMessage(message);
        this.linkedIn.setMessage(message);
        this.vietNetwork.setMessage(message);
        this.facebook.share();
        this.twitter.share();
        this.linkedIn.share();
        this.vietNetwork.share();
    }

}
