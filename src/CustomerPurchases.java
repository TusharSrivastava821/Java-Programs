// Santa  runs a local musical equipment store in your neighbourhood. He has contracted you to create an interactive application that will assist him with customer purchases. 
// Create a class named Customer Purchases that will contain get and set methods for a customer number, first name, surname, product, price and quantity. 
// Create a separate class called Printing that will include a method called Print Details, that will print the Customer Invoice.
// In the Printing class include another method called Customer Purchase Report which will display the following information:
// REPORT OPTION PERCENTAGE
// TAX 15%
// COMMISSION 8.5%
// DISCOUNT 10%
// TOTAL (Price + Tax) – (Discount + Commission)
// In your main class, capture all the customer purchase details required to produce the reports.

import java.util.Scanner;
public class CustomerPurchases 
{
	private String customerNumber;
	private String firstName;
	private String surname;
	private String product;
	private double price;
	private int quantity;
	public String getCustomerNumber() 
    {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) 
    {
		this.customerNumber = customerNumber;
	}
	public String getFirstName() 
    {
		return firstName;
	}
	public void setFirstName(String firstName) 
    {
		this.firstName = firstName;
	}
	public String getSurname() 
    {
		return surname;
	}
	public void setSurname(String surname) 
    {
		this.surname = surname;
	}
	public String getProduct() 
    {
		return product;
	}
	public void setProduct(String product) 
    {
		this.product = product;
	}
	public double getPrice() 
    {
		return price;
	}
	public void setPrice(double price) 
    {
		this.price = price;
	}
	public int getQuantity() 
    {
		return quantity;
	}
	public void setQuantity(int quantity) 
    {
		this.quantity = quantity;
	}
}
class Printing 
{
	private CustomerPurchases customerPurchases;
	public Printing(CustomerPurchases customerPurchases) 
    {
		this.customerPurchases = customerPurchases;
	}
	public void PrintDetails() 
    {
		System.out.println("CUSTOMER INVOICE");
		System.out.println("***************************");
		System.out.println("CUSTOMER NUMBER: " + this.customerPurchases.getCustomerNumber());
		System.out.println("CUSTOMER FIRST NAME: " + this.customerPurchases.getFirstName());
		System.out.println("CUSTOMER SURNAME: " + this.customerPurchases.getSurname());
		System.out.println("PRODUCT PRICE: R " + String.format("%.2f", this.customerPurchases.getPrice()));
		System.out.println("PRODUCT QUANTITY: " + this.customerPurchases.getQuantity());
		System.out.println("***************************");
	}
	public void CustomerPurchaseReport() 
    {
		double productPrice = this.customerPurchases.getQuantity() * this.customerPurchases.getPrice();
		double tax=0.15*productPrice;
		double commission=0.085*productPrice;
		double discount=0.1*productPrice;
		double total=(productPrice + tax) - (discount + commission);
		System.out.println("\nCUSTOMER PURCHASE REPORT");
		System.out.println("***************************");
		System.out.println("PRODUCT PRICE: R " + String.format("%.2f", productPrice));
		System.out.println("TAX (15%): R " + String.format("%.2f", tax));
		System.out.println("COMMISSION (8.5% ): R " + String.format("%.2f", commission));
		System.out.println("DISCOUNT (10% ): R " + String.format("%.2f", discount));
		System.out.println("TOTAL: R " + String.format("%.2f", total));
		System.out.println("***************************");
	}
}


 class CustomerPurchasesMain {
	public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the customer number: ");
		String customerNumber = in.nextLine();
		System.out.print("Enter the customer first name: ");
		String firstName = in.nextLine();
		System.out.print("Enter the customer surname: ");
		String surname = in.nextLine();
		System.out.print("Enter the customer product: ");
		String product = in.nextLine();
		System.out.print("Enter the customer price: ");
		double price = in.nextDouble();
		System.out.print("Enter the customer quantity: ");
		int quantity = in.nextInt();
		CustomerPurchases customerPurchases = new CustomerPurchases();
		customerPurchases.setCustomerNumber(customerNumber);
		customerPurchases.setFirstName(firstName);
		customerPurchases.setSurname(surname);
		customerPurchases.setProduct(product);
		customerPurchases.setPrice(price);
		customerPurchases.setQuantity(quantity);
		Printing printing = new Printing(customerPurchases);
		printing.PrintDetails();
		printing.CustomerPurchaseReport();
	}
}