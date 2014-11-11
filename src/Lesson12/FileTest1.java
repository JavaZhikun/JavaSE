package Lesson12;

import java.io.File;
import java.io.IOException;

public class FileTest1 
{
	public static void main(String[] args) {
		
		// 创建新的文件
		File file = new File("c:\\abc.txt");
		
		try
		{
			System.out.println(file.createNewFile());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
