/*
	���ڽǱ������������ڵ�����ȿ�����JAVA�ж�����쳣��ʹ�á�
	
	�����Ǳ������쳣JAVAδ����ľ���Ҫ�Լ������쳣�����з�ת������
	���Զ�������������ͳ�Ϊ�Զ����쳣��
	
	ע�⣺��Ҫһ�����Ϊ�쳣�࣬����̳��쳣��ϵ��ֻ�������ſ��Ծ߱������ԣ�
	�ſ��Ա�throws,throw���Ρ�
	
*/
/*
		1,����ʱ������쳣:ֻҪ��Exception�������඼�ǣ�������������RuntimeException��ϵ��
		2,����ʱ������쳣(����ʱ�쳣):����Exception�е�RuntimeException�������ࡣ
*/

class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}
	FuShuIndexException(String k)
	{
		super(k);
	}
}
class ExceptionTest3
{
	public static void main(String[] args)throws FuShuIndexException
	{
		int[] arr=new int[3];
		Test t=new Test();
		t.method(arr,-1);
	}
}
class Test
{
	public int method(int[] arr,int index)throws FuShuIndexException 
	{
		if(index>=arr.length)
			throw new ArrayIndexOutOfBoundsException("Խ����:"+index);
		if(arr==null)
			throw new NullPointerException("��ָ�뾯��");
		if(index<0)
			throw new FuShuIndexException("�Ǳ�Ϊ����:"+index);
		return arr[index];
	}
}
















