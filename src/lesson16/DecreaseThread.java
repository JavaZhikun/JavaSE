package lesson16;

public class DecreaseThread extends Thread
{
	private Sample sample;
	
	public DecreaseThread(Sample sample)
	{
		this.sample = sample;
	}
	
	public void run()
	{
		for(int i = 0; i < 20; i++)
		{
			try
			{
				Thread.sleep((long)(Math.random()));
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			sample.decrease();
		}
	}


}

