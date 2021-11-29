import java.util.Scanner;
class TenthDigit
{
public static void main(String arg[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number:- ");
int n = sc.nextInt();
int k=0;
int c=0;
while(c!=2){
k = n%10;
n /= 10;
c++;
}
System.out.println(k);
}
}