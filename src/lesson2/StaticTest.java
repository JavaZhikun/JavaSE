package lesson2;

public class StaticTest {
	
	public static void main(String[] args) {
		
		MyStatic myStatic = new MyStatic();
		
		MyStatic myStatic2 = new MyStatic();
		
		myStatic.a = 10;
		
		System.out.println(myStatic2.a);
	}
}

class MyStatic
{
	static int a;
}