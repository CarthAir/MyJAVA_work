/*
	1���ڲ����ص㣺�ڲ������ֱ�ӷ����ⲿ���еĳ�Ա��
	2���ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ������

*/
class innerClassTest
{
	public static void main(String[] args)
	{
		Outer.Inner in=new Outer.Inner();
		in.show();
		Outer.Inner2 in2=new Outer.Inner2();
	}
	
}
class Outer
{
	private static int num=4;
	static class Inner//�ڲ���
	{
		void show()
		{
			System.out.println("num..."+num);
		}
		static void func()//���ڲ����ж����˾�̬��Ա�����ڲ���Ҳ�����Ǿ�̬�ġ�
		{
			
		}
	}
	static class Inner2//���ڲ����Ǿ�̬�ġ��൱��һ���ⲿ�ࡣ
	{
		
	}
	public void method()
	{
		Inner in=new Inner();
		in.show();
	}
}