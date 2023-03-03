public class Lambdawithoutparmeter
{
interface we1
{
	public String we1();
}

public static void main(String args[])
{
	we1 w=()->
	{
	   return "the flight going to new york has been cancelled" ;
	};
	System.out.println(w.we1());
}
}
