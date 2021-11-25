package com.automobile.TwoWheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle
{
    int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return "Model Name :  HONDA Amaze";
    }

    @Override
    public String getRegistrationNumber() {
        return "Registration Number : HONDAAMAZE07072020SK";
    }

    @Override
    public String getOwnerName() {
        return "Owner Name : Prateek Verma";
    }

    public String getSpeed() {
        return "Max Speed : " + speed + "km/h";
    }

    public void cdplayer()
    {
        System.out.println("Set  CD Player!!");
    }
}