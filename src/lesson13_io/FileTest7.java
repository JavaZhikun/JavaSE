package lesson13_io;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest7 
{
	public static void main(String[] args) 
	{
		
		File file = new File("c:/abc/xyz/hello");
		
		String[] names = file.list(new FilenameFilter()
		{
			public boolean accept(File dir, String name)
			{
				if(name.endsWith(".txt"))
				{
					return true;
				}
				return false;
			};
		});
		
		for(String name: names)
		{
			System.out.println(name);
		}
	}

}
