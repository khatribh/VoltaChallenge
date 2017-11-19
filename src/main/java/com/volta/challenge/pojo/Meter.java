package com.volta.challenge.pojo;

public class Meter {
    private String id;
    private String oem;
    private String station_id;
    private String state;

    public Meter() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOem() {
        return oem;
    }

    public void setOem(String oem) {
        this.oem = oem;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "OEM: "+getOem() +" StationId: "+getStation_id()+" State: "+getState();

    }
}
