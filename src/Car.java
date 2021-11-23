// Create a class Car having properties manufacturer and price.
// Create three instances of the class and display the details of each car sorted with respect to the price.

public class Car{
    String name;
    int price;
    public static void main(String[] args){
        Car obj1=new Car();
        Car obj2=new Car();
        Car obj3=new Car();

        obj1.name="Ford";
        obj1.price=230000;

        obj2.name="Maruti";
        obj2.price=245000;
        
        obj3.name="Benz";
        obj3.price=450000;
        
        if(obj1.price>obj2.price  && obj1.price>obj3.price)
        {
                System.out.println(obj1.name+" "+obj1.price);
                if(obj2.price>obj3.price)
                {
                    System.out.println(obj2.name+" "+obj2.price);
                    System.out.println(obj3.name+" "+obj3.price);
                }
                else
                {
                    System.out.println(obj3.name+" "+obj3.price);
                    System.out.println(obj2.name+" "+obj2.price);  
                }
        }
        else if(obj2.price>obj1.price  && obj2.price>obj3.price)
        {
            System.out.println(obj2.name+" "+obj2.price);
                if(obj1.price>obj3.price)
                {
                    System.out.println(obj1.name+" "+obj1.price);
                    System.out.println(obj3.name+" "+obj3.price);
                }
                else
                {
                    System.out.println(obj3.name+" "+obj3.price);
                    System.out.println(obj1.name+" "+obj1.price);  
                }
        }
        else{
            System.out.println(obj3.name+" "+obj3.price);
            if(obj1.price>obj2.price)
            {
                System.out.println(obj1.name+" "+obj1.price);
                System.out.println(obj2.name+" "+obj2.price);
            }
            else
            {
                System.out.println(obj2.name+" "+obj2.price);
                System.out.println(obj1.name+" "+obj1.price);  
            }
        }
    }
    
}

