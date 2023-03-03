import java.util.Scanner;
class InputException extends Exception
{
    @Override
    public String toString()
    {
        return "InvalidInputException";
    }
    @Override
    public String getMessage()
    {
        return "Input is greter then 1000000 Exception";
    }
}
class calculator
{
    void input()
    {
        int a , b , c;
        Scanner  s = new Scanner(System.in);
        System.out.println("enter the value of a and b :");
        a=s.nextInt();
        b=s.nextInt();
    };
    void add()
    {
        c=a+b;
        System.out.println("the addition is "+ c);
    };

    void sub()
    {
        c=a-b;
        System.out.println("the subtraction is "+c);

    };
    void mul()
    {
        c=a*b;
        System.out.println("the multiplication is "+c);
    };
    void div()
    {
        c =a/b;
        System.out.println("the division is "+c);

    }

}