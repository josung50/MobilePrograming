import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickCoding3 {
	
	static int Num1;
	static int Num2;
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			Num1 = Integer.parseInt(in.readLine());
			Num2 = Integer.parseInt(in.readLine());
		}
		catch(Exception e)
		{
			System.out.println("���ڰ��ƴ�");
			return;
		}

		if(Num1 > 999 || Num2 > 999)
			throw new MyException("Number is bingger than 1000.");

		try{
			System.out.println(Num1 / Num2);
		}
		
		catch (Exception e){
			System.out.println("0���� ���� Ȥ�� ���ڰ� �ƴ�.");
		}
	}
	
}

class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}