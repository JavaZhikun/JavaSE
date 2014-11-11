package lesson14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest1 
{
	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("C:\\hello.txt");
			
			byte[] buffer = new byte[200];
		    
		   int length;
		   
		   while(-1 != (length = is.read(buffer, 0 , 200)))
		   {
			   String str = new String(buffer, 0 ,length);
			   
			   System.out.println(str);
		   }
			
		   is.close();
	}

}
