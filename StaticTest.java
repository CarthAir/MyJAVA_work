class StaticTest
{
	public static void main(String[] args)
	{
		System.out.println(Person.country);
	}
}
class Person
{
	static String country="CN";
	static int age;
	Person(){}
	public static void main()
	{
		System.out.println(country+"+"+age  );
	}
}
/*
static ��һ�����η����������γ�Ա��
static���εĳ�Ա�����ж�����
static���ȶ�����ڡ�
static���εĳ�Ա����һ�ֵ��÷�ʽ�����Ա�����ֱ�ӵ��á�����.��������
static���ε������ǹ������ݣ������д洢�����������ݡ�
*/
/*ע������
��̬����ֻ�ܷ��ʾ�̬��Ա��(�Ǿ�̬�ȿ��Է��ʾ�̬�ֿ��Է��ʷǾ�̬)
��̬�����в����Զ���this,super�ؼ��֡�
�������Ǿ�̬�ġ�
*/
