// Design a class Room that has properties AC_ON, HOME_THEATRE_ON, FAN_ON and LIGHT_ON that stores Boolean values to indicate whether the appliance is ON or OFF. 
// Design a menu driven program in java that puts ON/OFF the corresponding appliances and gives appropriate message. If the total power consumed is more than 2kW, show a message Overload. 
// Assume AC consumes 1200 watts, Home Theatre consumes 600 watts, Fan consumes 400 watts and light consumes 100 watt.

import java.util.Scanner;

public class Room
{
    public boolean AC_ON;
    public boolean HOME_THEATRE_ON;
    public boolean FAN_ON;
    public boolean LIGHT_ON;
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        Room obj = new Room();
        int power=0;
        while(true)
        {
            System.out.println("< Press >");
            System.out.println("1: AC\n2: HOMETHEATRE\n3: FAN\n4: LIGHT\n5: EXIT ");
            int ch = s.nextInt();
            if(ch==1) {
                System.out.println("Do you want to turn on the AC?");
                obj.AC_ON = s.nextBoolean();
                if(obj.AC_ON==true)
                    power+=1200;
            }
            else if(ch==2){
                System.out.println("Do you want to turn on the Hometheatre ?");
                obj.HOME_THEATRE_ON = s.nextBoolean();
                if(obj.HOME_THEATRE_ON==true)
                    power+=600;
            }
            else if(ch==3){
                System.out.println("Do you want to turn on the FAN ?");
                obj.FAN_ON=s.nextBoolean();
                if(obj.FAN_ON==true)
                    power+=400;
            }
            else if(ch==4){
                System.out.println("Do you want to turn on the LIGHT ?");
                obj.LIGHT_ON= s.nextBoolean();
                if(obj.LIGHT_ON==true)
                    power+=100;
            }
            else if(ch==5){
                if(power>2000)
                    System.out.println("Power Overload !");
                else
                    System.out.println("Power consumed is "+power);
                break;
            }
        }
    }
}