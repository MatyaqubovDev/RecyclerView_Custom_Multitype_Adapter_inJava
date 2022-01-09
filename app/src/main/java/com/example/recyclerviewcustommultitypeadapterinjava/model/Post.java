package com.example.recyclerviewcustommultitypeadapterinjava.model;

public class Post {
    private String userFullName;
    private String lastActive;
    private String postText;
    private int postImage;

    public Post(String userFullName, String lastActive, String postText, int postImage) {
        this.userFullName = userFullName;
        this.lastActive = lastActive;
        this.postText = postText;
        this.postImage = postImage;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getLastactive() {
        return lastActive;
    }

    public void setLastactive(String lastActive) {
        this.lastActive = lastActive;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }
}
