package lesson13_io;

public class Fab 
{
	public int compute(int n)
	{
		//µÝ¹éµÄ³ö¿Ú
		
		if(1 == n || 2 == n)
		{
			return 1;
		}
		
		else
		{
			return compute(n - 1) + compute(n - 2);
		}
	}
	
	public static void main(String[] args) 
	{
		Fab fab = new Fab();
		
		System.out.println(fab.compute(9));
		
	}

}
