/*
	���ģʽ����������֮��Ч�ķ�������ʵ����һ�ַ�����
	
	1,�������ģʽ��
		��������⣺���Ա�֤һ�����ڴ��еĶ���Ψһ�ԡ�
	����Զ������ʹ��ͬһ��������Ϣ����ʱ������Ҫ��֤�����Ψһ�ԡ�
	
	��α�֤�����Ψһ���أ�
	1������������������new�����ö���
	2���ڸ��ഴ��һ������ʵ�塣
	3�������ṩһ������������������Ի�ȡ�ö���
		
*/
//����ʽ
class Single//�����ڷ�װ,��һ���ض��󼴽�����
{
	private static Single s=new Single();
	private  Single(){}
	int haha;
	public static Single getInstance()
	{
		return s;
	}
}
//����ʽ
class Single2//����ؽ��������󲻻Ὠ����ֻ��get����ʹ���˲Ž������ӳټ��أ���
{
	private static Single2 s=null;
	private Single2(){}
	public static Single2 getInstance()
	{
		if(s==null)
			s=new Single2();
		return s;
	}
}
class singleDemo
{
	public static void main(String[] args)
	{
		Single s1=Single.getInstance();
		Single s2=Single.getInstance();
		System.out.println(s1==s2);
	}
}
