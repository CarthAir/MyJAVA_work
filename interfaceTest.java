/*
	��һ���������еķ������ǳ����ʱ�򣬾Ϳ�������һ�ַ�ʽ����
	���� �ӿ� interface��
*/
/*
	������ʹ�õĹؼ��ֲ���class��interface��
*/

interface Test
{
	public static final int NUM=4;
	public abstract void show();
}

/*
	���ڽӿ��г����ĳ�Ա��������Щ��Ա���й̶������η���
	1,ȫ�ֳ�����public static final
	
	2�����󷽷���public abstract 
	
	�ӿ��еĳ�Ա���ǹ�����Ȩ�ޡ�
*/
//������֮���Ǽ̳й�ϵ��������֮����ʵ�ֹ�ϵ��
/*
	�ӿڲ�����ʵ������
	ֻ����ʵ���˽ӿڵ����ಢ�����˽�������еĳ��󷽷��󣬸�����ſ���ʵ������
	���򣬸��������һ�������ࡣ
*/
class TestImp implements/*ʵ��*/ Test
{
	public void show()
	{}
	
}

/*
	��java�в���ʵ�ֶ�̳У�����ֵ��õĲ�ȷ���ԡ�
	����java���̳л��Ƹ�������java�б�ɶ�ʵ�֡�
	
	һ�������ʵ�ֶ����ڡ�
*/
interface A
{
	public abstract void show();
	
}

interface B
{
	public abstract void show();
}

class TestAgain implements A,B//��ʵ��
{
	public void show(){} 	
}


/*
	һ�����ڼ̳���һ�����ͬʱ��������ʵ�ֶ�ӿڡ�
	
	
*/

class Q
{
	public int method()
	{
		return 0;
	}
	
}

abstract class Test2 extends Q implements A,B
{
}
/*
	�ӿڵĳ��ֱ����˵��̳еľ����ԡ�

*/

interface CC
{
	void show();
}
interface MM
{
	void method();
	
}
interface QQ extends CC//�ӿ���ӿ�֮���Ǽ̳й�ϵ�����ҿ��Զ�̳С�
{
	
	
}
class interfaceTest 
{
	public static void main(String[] args)
	{
		TestImp haha=new TestImp();
	}
}


























