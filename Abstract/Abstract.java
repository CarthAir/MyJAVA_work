/*
	�����ࣺ
	������ͳ��ģ�����������������塣
	
	�ص㣺
		1������ֻ������û��ʵ��ʱ���÷������ǳ��󷽷�����Ҫ��abstract���Ρ�
		���󷽷����뱻�����ڳ������С�����Ҳ���뱻abstract���Ρ�
		2�������಻�ܱ�ʵ��������Ϊ���ó��󷽷�û�����塣
		3�������������������ȫ�����Ǻ������ſ���ʵ������
	������Ҫ��ʹ�ñ����Ǹ��ࡣ

*/

class Abstract
{
	public static void main()
	{
		
	}
}
abstract class Test
{
	String data="Test";
	abstract void show();
}
class TestA extends Test
{
	void show()
	{
		System.out.println("Test...A");
	}
}
class TestB extends Test
{
	void show()
	{
		System.out.println("Test...B");
	}
}