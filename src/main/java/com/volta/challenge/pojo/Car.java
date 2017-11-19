package com.volta.challenge.pojo;

public class Car {
    private String id;
    private String make;
    private String model;

    public Car() {
        id="";
        make="";
        model="";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Make: "+getMake() +" Model: "+getModel();
    }
}
