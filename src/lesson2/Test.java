package lesson2;

public class Test {

	public static void main(String[] args) {
		T r = new T();
	}
}

abstract class T
{
	public abstract void method();
	
	public void test()
	{
		System.out.println("test");
	}
}

abstract class R extends T
{
	public void method()
	{
		System.out.println("method");
	}
}
