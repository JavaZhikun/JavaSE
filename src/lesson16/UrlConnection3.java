package lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlConnection3
{
	//将网站的内容显示到控制台里面来
	public static void main(String[] args) throws IOException
	{
		URL url = new URL("http://www.shengsiyuan.com");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String line = null;
		
		while(null != (line = br.readLine()))
		{
			System.out.println(line);
		}
		
		br.close();
		
	}

}
