package lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamTest2 
{
	public static void main(String[] args) throws IOException {
		//从控制台中读出来
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String str;
		
		while(null != (str = br.readLine()))
		{
			System.out.println(str);
		}
		
		br.close();
	}

}
