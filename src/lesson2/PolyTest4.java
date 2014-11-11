package lesson2;

public class PolyTest4 {

	public static void main(String[] args) {
		
		A a = null;
		
		if(args[0].equals("1"))
		{
			a = new B();
		}
		
		if(args[1].equals("2"))
		{
			a  = new C();
		}
		
		if(args[2].equals("3"))
		{
			a = new D();
		}
		
		a.method();
	}
}

class A
{
	public void method()
	{
		System.out.println("A");
	}
}

class B extends A
{
	public void method()
	{
		System.out.println("B");
	}	
}

class C extends A
{
	public void method()
	{
		System.out.println("C");
	}
}

class D extends A
{
	public void method()
	{
		System.out.println("D");
	}
}