class ExceptionTest6
{
	public static void main(String[] args)
	{
		Test t=new Test();
		int[] arr=new int[10];
		try
		{
			int num=t.method(arr,-1);
			System.out.println("num..."+num);
		}
		catch(FuShuException k)
		{
			System.out.println(k);
			return ;//�Ի�ִ��finally,���Ǻ���û�С�
			//System.exit(0);//ɶ��û�ˣ��˳�jvm
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("over");
	}
}
class Test
{
	int method(int[] arr,int index)throws FuShuException
	{
		if(index<0)
			throw new FuShuException("�Ǳ긺��������"+index);
		return arr[index];
	}
}
class FuShuException extends Exception
{
	FuShuException(){}
	FuShuException(String k)
	{
		super(k);
	}
}

/*
	finally:һ�����ڹرգ��ͷţ���Դ��
	��������ݿ������ʱ��

*/
/*
	try catch finally���������ص㣺
	1,try catch finally
	
	2,try catch (���)��û�б�Ҫ��Դ�ͷ�ʱ,���Բ�����finally
	
	3,
	try finally
	
	void show()throws Exception
	{
		try
		{
			//������Դ
			throw new Exception()
		}
		finally
		{
			//�ر���Դ
		}
	}

*/
























