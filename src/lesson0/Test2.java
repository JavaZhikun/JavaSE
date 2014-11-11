package lesson0;

public class Test2
{
	public int add(int a, int b)
	{
		return a + b;
	}
	
	public int subtract(int a, int b)
	{
		return a - b;
	}
	
	public int multiply(int a, int b)
	{
		return a * b;
	}
	
	public int divide(int a, int b)
	{
		return a / b;
	}
	
	public void output()
	{
		System.out.println("hello world");
	}
	
	public void method(int a)
	{
		if(a < 10)
		{
			return;
		}
		
		System.out.println("welcome to shengsiyuan!!");
	}
	
	public static void main(String[] args)
	{
		Test2 test = new Test2();
		
		int x = 8;
		int y = 3;
		
		int a = test.add(x, y);
		int b = test.subtract(x,y);
		int c = test.multiply(x,y);
		int d = test.divide(x,y);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		test.output();
		
		int m = 15;
		
		test.method(m);
	}
	

}
