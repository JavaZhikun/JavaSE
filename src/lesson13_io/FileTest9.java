package lesson13_io;

import java.io.File;

public class FileTest9 
{
	public static void deleteAll(File file)
	{
		//�ļ����߿��ļ���
		if(file.isFile() || file.list().length == 0)
		{
			file.delete();
		}
		
		else
		{
			File[] files = file.listFiles();
			
			for(File f : files)
			{
				deleteAll(f); //һ��һ���ɾ�������ɾ������
				
				f.delete();
			}
		}
	}
	
	public static void main(String[] args) {
		
		deleteAll( new File("C:/abc/xyz/hello"));
	}

}
