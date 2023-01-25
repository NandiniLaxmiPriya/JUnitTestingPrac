package pracclass;

public class ExceptionsClass {
	public void  divide(int a,int b)
	{
		
		if(b==0)
		{
		throw new ArithmeticException("ex");
		}else {
			int r= a/b;
			System.out.println(r);
		}
		
	}
	
	public void call(String s)
	{
		if(s.length()==0)
		{
			throw new NullPointerException("npe");
		}
		else
		{
			System.out.println(s);
		}
	}
}
