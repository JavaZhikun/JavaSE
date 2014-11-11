package lesson13_io;

import java.io.File;

public class FileTest9 
{
	public static void deleteAll(File file)
	{
		//文件或者空文件夹
		if(file.isFile() || file.list().length == 0)
		{
			file.delete();
		}
		
		else
		{
			File[] files = file.listFiles();
			
			for(File f : files)
			{
				deleteAll(f); //一层一层地删掉，最后删掉本身
				
				f.delete();
			}
		}
	}
	
	public static void main(String[] args) {
		
		deleteAll( new File("C:/abc/xyz/hello"));
	}

}
