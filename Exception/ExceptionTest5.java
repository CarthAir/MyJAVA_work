/*
	�쳣����Ĳ�׽��ʽ��
	���ǿ��Զ��쳣��������Դ���ķ�ʽ��
	
	�����ʽ�ǣ�
	
	try
	{
		//��Ҫ�����Ĵ��롣
	}
	catch(�쳣�� ����)//�ñ������ڽ��ܷ������쳣����
	{
		//�����쳣�Ĵ��롣
	}
	finally
	{
		//һ���ᱻִ�еĴ��롣
	}
	
	��������Ż�try,��û���ⲻ��try��
*/

class ExceptionTest5
{
	public static void main(String[] args)
	{
		Test t=new Test();
		int[] arr=new int[10];
		try{
			int num=t.method(null,-3);
			System.out.println("num..."+num);
		}
		catch(NullPointerException e){
			System.out.println(e.toString());
		}
		catch(FuShuException k){//���������
			System.out.println("�����Ǳ��쳣����");	
			k.printStackTrace();//JVM��Ĭ�ϴ�����ƾ��ǵ����쳣����÷�����
			System.out.println("message:"+k.getMessage());
		}
		/*��catch����catch����������
		catch(Exception t){
			
		}
		*/
		finally{
			System.out.println("over");
		}
	
	}
}
class Test
{
	public int method(int[] arr,int index) throws FuShuException,NullPointerException
	{
		if(arr==null)
			throw new NullPointerException("��ָ�룡��");
		if(index<0)
			throw new FuShuException("�Ǳ�Ϊ������:"+index);
		return arr[index];
	}
}
class FuShuException extends Exception
{
	FuShuException()
	{}
	FuShuException(String k)
	{
		super(k);
	}
}



/*
	�쳣�����ԭ��
	1�������ڲ�����׳���Ҫ�����쳣����ô�����ϱ���������
	��������ں�������trycatch��׽���������ʧ�ܡ�
	
	2����������������쳣�ĺ�����ҪôtrycatchҪôthrows���������ʧ�ܡ�
	
	3��ʲôʱ��catch��ʲôʱ��throws��
		�������ݿ��Խ������catch��
		������ˣ���throws���ߵ����ߣ��ɵ����߽����
		
	4��һ�������ڲ�����׳��˶���쳣����ô����ʱ�������ж�Ӧ���catch��������Դ���
	�ڲ��м�����Ҫ�����쳣�����׳��������׳���������catch������


*/





















