/*
	�����ڲ��ࡣ�����ڲ���ļ�д��ʽ��
	
	������ǰ�᣺
	�ڲ������̳л���ʵ��һ���ⲿ����߽ӿڡ�
	
	�����ڲ��ࣺ��ʵ����һ�������������
	��ʽ��new ����or�ӿ�(){��������}
*/

class innerClassTest5
{
	public static void main(String[] args)
	{
		new Outer().method();
	}
}
class Outer
{
	int num=4;
	/*
	class Inner extends test
	{
		void show()
		{
			System.out.println("num..."+num);
		}
	}
	*/
	public void method()
	{
		new test() //�����ڲ��ࡣ
		{
			void show()
			{
				System.out.println("show...........");
			}
		}.show();
	}
	
}
abstract class test
{
	abstract void show();
}


















