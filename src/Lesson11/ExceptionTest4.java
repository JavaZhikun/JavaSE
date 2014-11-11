package Lesson11;

public class ExceptionTest4 
{
       public void method(String str) throws Exception
       {
    	   if(null == str)
    	   {
    		   throw new MyException("������ַ�����������Ϊnull");
    	   }
    	   
    	   else if("hello".equals(str))
    	   {
    		   throw new MyException("������ַ�������Ϊhello");
    	   }
    	   
    	   else 
    	   {
    		   System.out.println(str);
    	   }
    			   
       }
       
       public static void main(String[] args) {
		
    	   try
    	   {
    		   ExceptionTest4 test = new ExceptionTest4();
    		   
    		   test.method("hello");
    	   }
    	   catch(MyException e)
    	   {
    		   System.out.println("���뵽MyException catch��");
    		   e.printStackTrace();
    	   }
    	   
    	   catch(MyException2 e)
    	   {
    		   System.out.println("���뵽MyException2 catch��");
    		   e.printStackTrace();
    	   }
    	   
    	   catch(Exception e)
    	   {
    		   System.out.println("���뵽Exception catch��");
    		   e.printStackTrace();
    	   }
    	   
    	   finally
    	   {
    		   System.out.println("�쳣�������");
    	   }
	}
	
	
	
	
}


class MyException extends Exception
{
	public MyException()
	{
		super();
	}
	
	public MyException(String message)
	{
		super(message);
	}
}

class MyException2 extends Exception
{
	public MyException2()
	{
		super();
	}
	
	public MyException2(String message)
	{
		super();
	}
}
