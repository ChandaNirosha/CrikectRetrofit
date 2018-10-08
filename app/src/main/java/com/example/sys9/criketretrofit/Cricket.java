package com.example.sys9.criketretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

class Cricket {
    @SerializedName("batsman")
    @Expose
    private List<Batsman> batsman = null;
    public List<Batsman> getBatsman() {
        return batsman;    }
    public List <Bowlers> getBowlers() {
        return bowlers;
    }
    @SerializedName( "bowlers" )
    @Expose
    private List<Bowlers>bowlers=null;
}


