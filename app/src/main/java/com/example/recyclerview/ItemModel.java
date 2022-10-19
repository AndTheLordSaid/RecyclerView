package com.example.recyclerview;

public class ItemModel {
    private String title;
    private String description;
    private String lingo;
    private int image;

    public ItemModel(String title, String description, String lingo , int image) {
        this.title = title;
        this.description = description;
        this.lingo = lingo;
        this.image = image;
    }

    public String getLingo() {
        return lingo;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

}
