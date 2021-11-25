package com.automobile.TwoWheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle
{
    int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return "Model Name : Destini 125";
    }

    @Override
    public String getRegistrationNumber() {
        return "Registration Number : HERODEST12102021AR";
    }

    @Override
    public String getOwnerName() {
        return "Owner Name : Rahul";
    }

    public String getSpeed()
    {
        return "Max Speed : " + speed  + "km/h";
    }

    public void radio()
    {
        System.out.println("Set Radio Frequency!!");
    }
}