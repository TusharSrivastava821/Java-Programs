// Java program to demonstrate varargs .

class VarArgs
{
	static void fun(int ...a) // A method that takes variable number of integer arguments.
	{
		System.out.println("Number of arguments: " + a.length);
		for (int i: a) // using for each loop to display contents of a
        {
			System.out.print(i + " ");
        }
        System.out.println();
	}
	public static void main(String args[])
	{
		fun(100);		 // one parameter
		fun(1, 2, 3, 4); // four parameters
		fun();		 // no parameter
	}
}
