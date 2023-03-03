public class Lambdawithreturn
{
	interface reportCard
	{
	   public int Marksforsub(int math ,int phys ,int hist, int chem );
	}
	public static void main(String args[])
	{
	   reportCard am1 = (int math ,int phys ,int hist, int chem ) ->{
	   return (math + phys + hist + chem );
	};
	System.out.println("the total of the first student is " + am1.Marksforsub(74,75,67,87);
	}
} 