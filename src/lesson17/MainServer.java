package lesson17;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer
{
	public static void main(String[] args) throws IOException
	{
		
		ServerSocket serverSocket = new ServerSocket(4000);
		
		while(true)
		{
			Socket socket = serverSocket.accept();
			
			//Æô¶¯¶ÁÐ´Ïß³Ì
			new ServerInputThread(socket).start();
			new ServerOutputThread(socket).start();
		}
		
	}

}
