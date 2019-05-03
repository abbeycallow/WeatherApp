package com.company;
import java.util.*;

public class Weather {
    private int high;

    private int low;

    private String city;

    private String state;

    //Date dateCreated;

//    public Date getDateCreated() {
//        return dateCreated;
//    }
//
//    public void setDateCreated(Date dateCreated) {
//        this.dateCreated = dateCreated;
//    }

    public Weather(){}

    public Weather(int high, int low, String city, String state){
        this.high = high;
        this.low = low;
        this.city = city;
        this.state = state;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "\n-- Weather Report -- " +
                "\n High : " + high +
                "\n Low  : " + low +
                "\n City :  " + city  +
                "\n State :  " + state +
                "";
    }
}
