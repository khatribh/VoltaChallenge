package com.volta.challenge.pojo;

import java.util.ArrayList;

public class Station {
    private String id;
    private String lin;
    private String name;
    private String status;
    private String geoLocation;
    private Location location;
    private String street_address;
    private String city;
    private String state;
    private String zip_code;
    private boolean pay_to_park;
    private String completion_date;
    private ArrayList<Meter> meterList;

    public Station() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLin() {
        return lin;
    }

    public void setLin(String lin) {
        this.lin = lin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(String geoLocation) {
        this.geoLocation = geoLocation;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
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

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public boolean isPay_to_park() {
        return pay_to_park;
    }

    public void setPay_to_park(boolean pay_to_park) {
        this.pay_to_park = pay_to_park;
    }

    public String getCompletion_date() {
        return completion_date;
    }

    public void setCompletion_date(String completion_date) {
        this.completion_date = completion_date;
    }

    public ArrayList<Meter> getMeterList() {
        return meterList;
    }

    public void setMeterList(ArrayList<Meter> meterList) {
        this.meterList = meterList;
    }

    @Override
    public String toString() {
        return "Lin: "+getLin() +" Name: "+getName()+" Status: "+getStatus()+" Geolocation"
                +getGeoLocation()+" Location: "+getLocation()+" StreetAddress: "+getStreet_address()
                +" City: "+getCity()+" State: "+getState()+"ZipCode: "+getZip_code()+
                "Pay_to_park: "+isPay_to_park()+"Completion_Date: "+getCompletion_date()+"Meter: "+getMeterList();

    }
}
