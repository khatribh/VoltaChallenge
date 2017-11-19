package com.volta.challenge.pojo;

import java.util.ArrayList;

public class CarsByMake {
    private String make;
    private ArrayList<Car> carList;

    public CarsByMake() {
        make="";

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    @Override
    public String toString() {
        return "Make: "+getMake() +" Modelmake: "+getCarList();
    }
}
