/*

��̬�����
������ļ��ض�ִ�С�

���ã����ڸ����ʼ����

*/
class StaticCodeTest
{
	static
	{
		System.out.println("haha");
	}
	public static void main(String[] args)
	{
		//new StaticCode().show();
		StaticCode.show();
	}
}
class StaticCode
{
	static
	{
		System.out.println("haha");
	}
	static void show()
	{
		System.out.println("show run");
		System.out.println("show run");
	}
}
