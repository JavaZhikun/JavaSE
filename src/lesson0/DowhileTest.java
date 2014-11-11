package lesson0;

public class DowhileTest
{
	public static void main(String[] args)
	{
		int a = 2;
		int sum = 0;
		
		do
		{
			sum += a;
			a += 2;
		}
		while(a <= 100);
		
		System.out.println(sum);
		
		int b = 2;
		while(b < 1 )
		{
			System.out.println("hello world");
		}
		
		System.out.println("**************");
		do
		{
			System.out.println("welcome");
		}
		while(b < 1);
	}
}
