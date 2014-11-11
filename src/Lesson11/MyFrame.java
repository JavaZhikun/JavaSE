package Lesson11;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame
{
	public MyFrame(String title)
	{
		super(title);
	}
	
	public static void main(String[] args) 
	{
		
		MyFrame frame = new MyFrame("First GUI app");
		
		frame.setSize(300,300);
		frame.setBackground(Color.green);
		
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
	}

}
