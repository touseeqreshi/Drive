
public class Driver 
{
	public static void main(String[] args)
	{
int num;
int Count;
{
	Count=0;
	System.out.println("Numbers Between 1 to Million Divisable by 9,13,27,and 81 are");
	for(num = 1; num <= 1000000; num = num + 1)
	{
		 if(num % 9 == 0 || num % 13 == 0 || num % 27 == 0 || num % 81 == 0)
	  {
			 Count = Count + 1;
	  }
	} 
    System.out.println("Sum: "+Count);
}
}
}
