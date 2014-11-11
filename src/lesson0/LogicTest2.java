package lesson0;

public class LogicTest2
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int f = 5;
		
		//²âÊÔ¶ÌÂ·Ð§Ó¦
		boolean e =(a > b)&&((f = c) < d);
		
		System.out.println(e);
		System.out.println(f);
		
		System.out.println("------------------");
		boolean g = (a > b)|| ((f = c) < d);
		
		System.out.println(g);
		System.out.println(f);
	}

}
