/*
	���̣����ڽ����еĳ���ֱ�룩��
	
	�̣߳����ǽ�����һ���������ִ�еĿ��Ƶ�Ԫ��
	
	һ�����̵�������Ҫ��һ���̡߳�
	
	
	��������߳���Ϊ��ͬʱ���ж�����롣������ݿ��Գ�Ϊ�߳�Ҫִ�е�����
*/
class Demo
{
	public void finalize()
	{
		System.out.println("demo ok");
	}
}
class ThreadDemo
{
	public static void main(String[] args)
	{
		new Demo();
		new Demo();
		new Demo();
		System.gc();
		new Demo();
		System.out.println("duoxiancheng");
	}
}