package com.example.recyclerviewcustommultitypeadapterinjava.model;

public class Header {
    private int userImage;
    private String postText;
    private int postImage;

    public Header(int userImage, String postText, int postImage) {
        this.userImage = userImage;
        this.postText = postText;
        this.postImage = postImage;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
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

