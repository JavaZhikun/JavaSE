package lesson13_io;

import java.io.File;
import java.io.IOException;

public class FileTest5 
{
	public static void main(String[] args) throws Exception {
		
		File file = new File("c:/abc/xyz/hello/abc.txt");
		
		file.createNewFile();
		
		System.out.println(file.delete());
	}

}
