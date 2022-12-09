package com.example.ds_android.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Weather implements Serializable {

    @SerializedName("description")
    private String description;

    @SerializedName("main")
    private String main;

    @SerializedName("icon")
    private String icon;

    public Weather(String description, String main, String icon) {
        this.description = description;
        this.main = main;
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
