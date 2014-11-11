package lesson0;

public class WhileTest
{
	public static void main(String[] args)
	{
		int a = 2;
		int sum = 0;
		
		while(a <= 100)
		{
			sum += a;
			a += 2;
		}
		
		System.out.println(sum);
	}

}
