// Write a program the calculates the final total fees to be paid.
// Program must request user to enter original fees value greater then R50000.
// Program should also request user to enter amount to deposit before calculating final total fees.

import java.util.Scanner;
public class Fees
{
    double deposit =10000;
    double original_fees;
    Fees(double original_fees,double deposit)
    {
        this.deposit+=deposit;
        this.original_fees=original_fees;
        if(this.deposit>=(original_fees/2))
        {
            this.original_fees -= original_fees*0.05;
        }
    }
    void finalTotalFees()
    {
        double totalFess=0;
        totalFess+=original_fees+(0.10*original_fees)+(0.05*original_fees);
        System.out.println("Total Original Fees is "+totalFess);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("< Enter the original fees value greater than 50000/- >");
        double of = sc.nextDouble();
        System.out.println("<Enter the deposit >");
        double d = sc.nextDouble();
        Fees obj=new Fees(of,d);
        obj.finalTotalFees();
    }
}