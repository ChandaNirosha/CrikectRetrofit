package com.example.sys9.criketretrofit;

import com.google.gson.annotations.SerializedName;

class Batsman {
    @SerializedName("name")
    String name;
    @SerializedName("average")
    String average;
    @SerializedName("age")
    String age;
    @SerializedName("inns")
    String inns;
    public String getName() {
        return name;
    }

    public String getAverage() {
        return average;
    }

    public String getAge() {
        return age;
    }

    public String getInns() {
        return inns;
    }
}
