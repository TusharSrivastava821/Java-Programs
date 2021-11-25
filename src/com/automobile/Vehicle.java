// Create a package called com.automobile. Define an abstract class called Vehicle. 
// Vehicle class has the following abstract methods: 
// public String getModelName() 
// public String getRegistrationNumber() 
// public String getOwnerName() 

// Create TwoWheelersubpackage under Automobile package
// Hero  class extends  Automobile.vehicle class 
// public int getSpeed() 
// – Returns the current speed of the vehicle.
// public void radio() 
// – provides facility to control the radio device 
// Honda class extends com.automobile.vehicle class
// public int getSpeed()
// – Returns the current speed of the vehicle.
// public void cdplayer() 
// – provides facility to control the cd player device which is available in the car.

package com.automobile;

public abstract class Vehicle
{
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}