// Initialize an integer array with ascii values and print the corresponding character values in a single row.

public class AsciiValue
{
    int[] ascii;
    AsciiValue()
    {
        ascii = new int[] {75,85,65};
    }
    void print_Array()
    {
        for (int i = 0; i < ascii.length; i++)
        {
            System.out.println((char) ascii[i]);
        }
    }
}
class AsciiValMain
{
    public static void main(String[] args) {
        AsciiValue obj = new AsciiValue();
        obj.print_Array();
    }
}