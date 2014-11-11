package Lesson12;

public class StaticInnerClassTest 
{

	public static void main(String[] args) {
		
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.test();
	}
}


class StaticInner
{
	private static int a = 4;
	
	public static class Inner
	{
		public void test()
		{
			System.out.println(a);
		}
	}
}