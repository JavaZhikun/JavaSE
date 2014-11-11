package programCompetition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MyInput
{
	public static void main(String[] args)
	{
		char[] chars =  new char[] {' ','ʮ','��','ǧ','��','ʮ','��','ǧ'};
		char[] ch = new char[] {'��','һ','��','��','��','��','��','��','��','��'};
		
		BufferedReader br = null;
		try{
			String input ="";//��������
			String numStr = "";//������Ч����
			char[] series; //��Ч���������ַ�����
			
			for(; ;)
			{//ֱ��������ȷʱ�˳�ѭ��
				br = new BufferedReader(new InputStreamReader(System.in));
				input = br.readLine();
				if(input.length() > 8)
				{
					System.out.println("��������" + input.length()
							+"���ַ����û�ÿ���������8���ַ������������룺");
					continue;
				}
				series =input.toCharArray();
				
				//ȷ�������ȫ��������
				boolean isRight = true;
				for(char c: series)
				{
				     if(c < 48 || c > 57)
				     {
				    	 System.out.println("�������в��ܰ����������ַ�������������:");
				    	 isRight = false;
				    	 break;
				     }
				     numStr += c;
				}
				
				if(isRight)
				{
					continue;
				}
				break;
				
			}
		
		
		int data = Integer.parseInt(numStr);// ��������λ��������0������
		numStr = null;
		numStr = data +"";
		series = numStr.toCharArray();
		
		if(series.length ==1 && series[0] == 48)
		{//ȫ�㣬�����
		     System.out.println(ch[0]);
		     return;
		}
		
		StringBuffer sb = new StringBuffer();
		//key = 0��ʾ0��  key =1 ��ʾ��0���֣� value Ϊ���ֵ��±�index
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int length = series.length;
		
		for(int i = 0; i <length; i++)
		{
			int index = Integer.parseInt(series[i] + "");
			if(index != 0)
			{//��������0���������
				map.put(1,i);
				if(map.get(0) != null && map.get(0)<map.get(1))
				{
					sb.append(ch[0]);
					map.put(1, null);
					map.put(0, null);
				}
				if(!(ch[index] ==  ch[1] && chars[length -i -1] == chars[1]))
				{//���ǡ�һʮ��
					sb.append(ch[index]);
				}else{//�ǡ�һʮ����ȡ��һʮ��or��ʮ��
					if(i != 0)
					{
						int previous = Integer.parseInt(series[i-1] + "");
						if(previous != 0)
						{// ǰһ��Ԫ���������0��ȡ��һʮ��������ȡ��ʮ��
							sb.append(ch[index]);
							
						}
					}
				}
				sb.append(chars[length - i - 1]);
			}else{//������0���������
				map.put(0, i);
				if(chars[length - i -1] == chars[4])
				{//����0��Ӧ�ĵ�λ�ǡ���
					sb.append(chars[4]);
				}
			}
		}
		System.out.println(sb.toString());
	}catch(NumberFormatException e){
		System.out.println("�û�����Ĳ���Ϊ���֣��޷�ת��");
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try{
			if(br != null)
			{
				br.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
		}

}
