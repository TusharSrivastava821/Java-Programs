 interface Drawable
 {  
    public void draw();  
 }  
  
public class LambdaExp 
{  
    public static void main(String[] args) {  
        int width=25;  
        Drawable d2=()->{System.out.println("Drawing "+width);};  
        d2.draw();  
    }  
}  