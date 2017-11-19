package com.volta.challenge.pojo;

public class Location {

    private String type;
    private String coordinates[];

    public Location() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String[] coordinates) {
        this.coordinates = coordinates;
    }
    @Override
    public String toString() {
        return "Type: "+getType() +" Coordinates: "+getCoordinates();

    }
}
