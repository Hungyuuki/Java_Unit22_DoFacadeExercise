package com.company;

public class VietNetwork implements SocialShare{
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing message to VietNetwork " +this.message);
    }
}
