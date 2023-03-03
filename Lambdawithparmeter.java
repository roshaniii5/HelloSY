class Lambdawithparmeter
{
	interface rax 
	{
	    public String rax(String raxText);
	}
	public static void main(String args[])
	{
	    rax r1 = (raxText)->
	    {
		return "we have an important announcementto be made "+ raxText;
	    };
	    System.out.println(r1.rax("the flight going to new york has been cancelled "));
	    rax r2 = raxText->
	    {
		return "we have an important announcementto be made "+ raxText;
	    };

	    System.out.println(r2.rax("the flight going to Boston has been arrived "));
	}
}