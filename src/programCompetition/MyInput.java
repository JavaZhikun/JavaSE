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
		char[] chars =  new char[] {' ','十','百','千','万','十','百','千'};
		char[] ch = new char[] {'零','一','二','三','四','五','六','七','八','九'};
		
		BufferedReader br = null;
		try{
			String input ="";//输入序列
			String numStr = "";//输入有效序列
			char[] series; //有效输入序列字符数组
			
			for(; ;)
			{//直到输入正确时退出循环
				br = new BufferedReader(new InputStreamReader(System.in));
				input = br.readLine();
				if(input.length() > 8)
				{
					System.out.println("你输入了" + input.length()
							+"个字符，用户每次最多输入8个字符，请重新输入：");
					continue;
				}
				series =input.toCharArray();
				
				//确保输入的全部是数字
				boolean isRight = true;
				for(char c: series)
				{
				     if(c < 48 || c > 57)
				     {
				    	 System.out.println("输入序列不能包括非数字字符，请重新输入:");
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
		
		
		int data = Integer.parseInt(numStr);// 可消除高位的所有是0的数字
		numStr = null;
		numStr = data +"";
		series = numStr.toCharArray();
		
		if(series.length ==1 && series[0] == 48)
		{//全零，输出零
		     System.out.println(ch[0]);
		     return;
		}
		
		StringBuffer sb = new StringBuffer();
		//key = 0表示0，  key =1 表示非0数字， value 为数字的下标index
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int length = series.length;
		
		for(int i = 0; i <length; i++)
		{
			int index = Integer.parseInt(series[i] + "");
			if(index != 0)
			{//不是数字0的情况处理
				map.put(1,i);
				if(map.get(0) != null && map.get(0)<map.get(1))
				{
					sb.append(ch[0]);
					map.put(1, null);
					map.put(0, null);
				}
				if(!(ch[index] ==  ch[1] && chars[length -i -1] == chars[1]))
				{//不是“一十”
					sb.append(ch[index]);
				}else{//是“一十”，取“一十”or“十”
					if(i != 0)
					{
						int previous = Integer.parseInt(series[i-1] + "");
						if(previous != 0)
						{// 前一个元素如果不是0，取“一十”，否则取“十”
							sb.append(ch[index]);
							
						}
					}
				}
				sb.append(chars[length - i - 1]);
			}else{//是数字0的情况处理
				map.put(0, i);
				if(chars[length - i -1] == chars[4])
				{//数字0对应的单位是“万”
					sb.append(chars[4]);
				}
			}
		}
		System.out.println(sb.toString());
	}catch(NumberFormatException e){
		System.out.println("用户输入的不都为数字，无法转换");
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
