package lesson7_strategy;

public class Client
{
	public static void main(String[] args)
	{
		AddStrategy addStrategy = new AddStrategy();
		
		Environment environment = new Environment(addStrategy);
		
		System.out.println(environment.calculate(3, 4));
		
		SubtractStrategy subtractStrategy = new SubtractStrategy();
	}

}