//RuntimeException Test
//����ֱ������������Ҫ���������Ϊû�н��������
class FuShuIndexException extends RuntimeException
{
	FuShuIndexException()
	{}
	FuShuIndexException(String k)
	{
		super(k);
	}
}
class ExceptionTest4
{
	public static void main(String[] args)
	{
		int[] arr=new int[3];
		Test t=new Test();
		t.method(arr,-1);
	}
}
class Test
{
	public int method(int[] arr,int index)
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
/*
	�Զ����쳣ʱ��Ҫô�̳�Exception��Ҫô�̳�RuntimeException��
	
*/






