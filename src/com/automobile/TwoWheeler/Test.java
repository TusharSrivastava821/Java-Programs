package com.automobile.TwoWheeler;

public class Test
{
    public static void main(String[] args)
    {
        Hero obj = new Hero();
        Honda obj1 = new Honda();
        obj.setSpeed(50);
        System.out.println(obj.getModelName());
        System.out.println(obj.getOwnerName());
        System.out.println(obj.getRegistrationNumber());
        System.out.println(obj.getSpeed());
        obj.radio();

        obj1.setSpeed(250);
        System.out.println(obj1.getModelName());
        System.out.println(obj1.getOwnerName());
        System.out.println(obj1.getRegistrationNumber());
        System.out.println(obj1.getSpeed());
        obj1.cdplayer();
    }
}