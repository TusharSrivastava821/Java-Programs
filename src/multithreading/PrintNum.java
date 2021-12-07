// : Create a thread which prints 1 to 10.
// After printing 5, there should be a delay of 5000 milliseconds before printing 6. 
// ( Thread Control Mechanism concept) 

package multithreading;
public class PrintNum implements Runnable 
{
  public void run() 
  {
      synchronized(this)
      {
          for(int i=0;i<10;i++)
          {
              System.out.println(i+1);
              if((i+1)==5)
              {
                  try {
                      Thread.sleep(5000);
                  } catch (InterruptedException e) 
                  {
                      e.printStackTrace();
                  }
              }
          }
      }
  }    
}
 class PrintMain
{
 public static void main(String[] args) 
 {
   PrintNum obj= new PrintNum();
   Thread obj1= new Thread(obj);
   obj1.start();
  }
}
