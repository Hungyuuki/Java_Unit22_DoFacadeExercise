package com.company;

public class Facebook implements SocialShare{
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing message to Facebook " +this.message);
    }
}
