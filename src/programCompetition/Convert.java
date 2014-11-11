package programCompetition;

import java.util.Scanner;

public class Convert
{
	
	/*
	 * Author:JavaZhikun
	 * */
	
	public static void main(String[] args)
	{
		Convert convert = new Convert();
		String str = convert.getOutput(convert.getInput());
		System.out.println(str);
	}
	
	public String getOutput(int original)
	{
		String result = "";
		if(original == 0)
		{
			return "零";
		}
		
		boolean flag = false;
		
		if(original < 0)
		{
			flag = true;
			original = -1 *original;
		}
		//temp1用于保存输入数字的前四位（存在的情况下）
		int temp1 = original / 10000;
		//temp2用于保存输入数字的后四位
		int temp2 = original %10000;
		
		if(temp1 !=0)
		{
			//若前四位不为0，处理前四位
			result = this.process(temp1);
			
			//在前四位后后四位之间加一个”万“字
			result += "万";
			//如果前四位的结尾为"0"(但同时后四位不能全为0)
			//或者后四位的开头为0且本身不为0，则在前四位和后四位之间除加万字还加一个0
			if((temp1%10 == 0 &&temp2 !=0) || (temp2/1000 == 0&&temp2 !=0))
			{
				result += "零";
			}
		}
			
			//将处理后的前四位和后四位相连接
			result += this.process(temp2);
			return (flag?"负" :"")+result;
		
	}
		
		//处理传入的四位数的阿拉伯数字，将其转换成对应的汉子表示形式
		
		
		private String process(int nub)
		{
			char[] cnNumber ={'零','一','二','三','四','五','六','七','八','九'};
			
			StringBuffer sb = new StringBuffer("");
			
			//千位数 
			int n1 = nub /1000;
			//百位数
			int n2 = nub%1000 /100;
			//十位数
			int n3 = nub %100 /10;
			//个位数
			int n4 = nub %10;
			
			//处理千位
			if(n1 != 0)
			{
				sb.append(cnNumber[n1]).append("千");
				//千位数后面全为0则结束此方法
				if(n2 ==0 && n3 ==0 && n4 ==0)
				{
					return sb.toString();
				}
				//千位不为0的情况下将百位上的数字的汉字表示形式加到千位后面
				sb.append(cnNumber[n2]);
			}
			
			//处理百位
			if(n2 != 0)
			{
				//千位为0但百位不为0时，将百位的数字的汉字表示形式加到千位后面
				if(n1 ==0)
				{
					sb.append(cnNumber[n2]);
				}
				
				sb.append("百");
				
				if(n3==0 && n4==0)
				{
					return sb.toString();
				}
				
			}
			
			//处理十位
			if(n3 != 0)
			{
				//十位不为1，或者十位为1但百位不为零
				if(n3!=1 ||(n2!=0 && n3 ==1))
				{
				sb.append(cnNumber[n3]).append("十");
				}
				else
				{//十位数字为1时，百位为0
					sb.append("十");
				}
				
				if(n4 ==0 )
				{//处理完十位，若个位为0则直接返回
					return sb.toString();
				}
				
			}else if(n2 != 0)
			{//十位上的数字为0，百位不为0时
				sb.append("零");
			}
			
			//处理个位
			if(n4 != 0)
			{//不为0时，将其转化为汉字
				sb.append(cnNumber[n4]);
			}
			return sb.toString();
		}
		
		/**
		 * 从命令行中获得一个整数，如果用户输入不合法或整数大于8位则程序直接退出
		 */
		
		public int getInput()
		{
			int result = 0;
			Scanner sc = new Scanner(System.in);
			
			try{
				System.out.println("请输入要转换的数字，一定要是8位的全数字");
				//其意思是   使用 Scanner 类中的 nextInt()  方法 输入一个整数, 该方法只是接受一个 整型的数据,
				//如果输入的是非整数数据, 将会 抛出 InputMismatchException 异常
				result = sc.nextInt();
				
				//若输入的数字大于8位则程序直接退出
				if(result >99999999)
				{
					System.out.println("您输入的数字大于8位");
					System.exit(0);
				}
			}
			catch(Exception e){
				System.out.println("您输入的格式错误，午饭转换为数字");
				System.exit(0);
			}
			return result;
			
	    }

}
