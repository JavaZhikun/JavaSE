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
			return "��";
		}
		
		boolean flag = false;
		
		if(original < 0)
		{
			flag = true;
			original = -1 *original;
		}
		//temp1���ڱ����������ֵ�ǰ��λ�����ڵ�����£�
		int temp1 = original / 10000;
		//temp2���ڱ����������ֵĺ���λ
		int temp2 = original %10000;
		
		if(temp1 !=0)
		{
			//��ǰ��λ��Ϊ0������ǰ��λ
			result = this.process(temp1);
			
			//��ǰ��λ�����λ֮���һ��������
			result += "��";
			//���ǰ��λ�Ľ�βΪ"0"(��ͬʱ����λ����ȫΪ0)
			//���ߺ���λ�Ŀ�ͷΪ0�ұ���Ϊ0������ǰ��λ�ͺ���λ֮��������ֻ���һ��0
			if((temp1%10 == 0 &&temp2 !=0) || (temp2/1000 == 0&&temp2 !=0))
			{
				result += "��";
			}
		}
			
			//��������ǰ��λ�ͺ���λ������
			result += this.process(temp2);
			return (flag?"��" :"")+result;
		
	}
		
		//���������λ���İ��������֣�����ת���ɶ�Ӧ�ĺ��ӱ�ʾ��ʽ
		
		
		private String process(int nub)
		{
			char[] cnNumber ={'��','һ','��','��','��','��','��','��','��','��'};
			
			StringBuffer sb = new StringBuffer("");
			
			//ǧλ�� 
			int n1 = nub /1000;
			//��λ��
			int n2 = nub%1000 /100;
			//ʮλ��
			int n3 = nub %100 /10;
			//��λ��
			int n4 = nub %10;
			
			//����ǧλ
			if(n1 != 0)
			{
				sb.append(cnNumber[n1]).append("ǧ");
				//ǧλ������ȫΪ0������˷���
				if(n2 ==0 && n3 ==0 && n4 ==0)
				{
					return sb.toString();
				}
				//ǧλ��Ϊ0������½���λ�ϵ����ֵĺ��ֱ�ʾ��ʽ�ӵ�ǧλ����
				sb.append(cnNumber[n2]);
			}
			
			//�����λ
			if(n2 != 0)
			{
				//ǧλΪ0����λ��Ϊ0ʱ������λ�����ֵĺ��ֱ�ʾ��ʽ�ӵ�ǧλ����
				if(n1 ==0)
				{
					sb.append(cnNumber[n2]);
				}
				
				sb.append("��");
				
				if(n3==0 && n4==0)
				{
					return sb.toString();
				}
				
			}
			
			//����ʮλ
			if(n3 != 0)
			{
				//ʮλ��Ϊ1������ʮλΪ1����λ��Ϊ��
				if(n3!=1 ||(n2!=0 && n3 ==1))
				{
				sb.append(cnNumber[n3]).append("ʮ");
				}
				else
				{//ʮλ����Ϊ1ʱ����λΪ0
					sb.append("ʮ");
				}
				
				if(n4 ==0 )
				{//������ʮλ������λΪ0��ֱ�ӷ���
					return sb.toString();
				}
				
			}else if(n2 != 0)
			{//ʮλ�ϵ�����Ϊ0����λ��Ϊ0ʱ
				sb.append("��");
			}
			
			//�����λ
			if(n4 != 0)
			{//��Ϊ0ʱ������ת��Ϊ����
				sb.append(cnNumber[n4]);
			}
			return sb.toString();
		}
		
		/**
		 * ���������л��һ������������û����벻�Ϸ�����������8λ�����ֱ���˳�
		 */
		
		public int getInput()
		{
			int result = 0;
			Scanner sc = new Scanner(System.in);
			
			try{
				System.out.println("������Ҫת�������֣�һ��Ҫ��8λ��ȫ����");
				//����˼��   ʹ�� Scanner ���е� nextInt()  ���� ����һ������, �÷���ֻ�ǽ���һ�� ���͵�����,
				//���������Ƿ���������, ���� �׳� InputMismatchException �쳣
				result = sc.nextInt();
				
				//����������ִ���8λ�����ֱ���˳�
				if(result >99999999)
				{
					System.out.println("����������ִ���8λ");
					System.exit(0);
				}
			}
			catch(Exception e){
				System.out.println("������ĸ�ʽ�����緹ת��Ϊ����");
				System.exit(0);
			}
			return result;
			
	    }

}
