package com.example.myapplication;

import androidx.annotation.NonNull;

public class Todo {

    private String name;
    private String description;
//    private int iconIndex;



    public Todo(String name, String description) {
        this.name = name;
        this.description = description;
//        this.iconIndex = iconIndex;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public int getIconIndex() {
//        return iconIndex;
//    }
//
//    public void setIconIndex(int iconIndex) {
//        this.iconIndex = iconIndex;
//    }

    @NonNull
    @Override
    public String toString() {
        return getName();
    }
}
